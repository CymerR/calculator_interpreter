package ru.cmr.interpret;

import ru.cmr.expr.Expression;
import ru.cmr.expr.Operandable;
import ru.cmr.expr.OperandableExpression;
import ru.cmr.expr.impl.*;

import java.util.ArrayDeque;

public class Interpreter {

    private final ArrayDeque<Expression> numStack;
    private final ArrayDeque<OperandableExpression> opsStack;

    public Interpreter(String input) {
        numStack = new ArrayDeque<>();
        opsStack = new ArrayDeque<>();

        var strs = input.split(" ");
        var isNextLast = false;
        for (String word : strs) {
            switch (word) {
                case "+" -> opsStack.addLast(AddExpression.start());
                case "-" -> opsStack.addLast(SubtractExpression.start());
                case "*" -> {
                    opsStack.addFirst(MultExpression.start());
                    numStack.addFirst(numStack.pop());
                    isNextLast = true;
                }
                case "/" -> {
                    opsStack.addFirst(DivExpression.start());
                    numStack.addFirst(numStack.pop());
                    isNextLast = true;
                }
                default -> {
                    if (isNextLast) {
                        numStack.addFirst(new NumExpression(Double.parseDouble(word)));
                        isNextLast = false;
                    } else {
                        numStack.addLast(new NumExpression(Double.parseDouble(word)));
                    }
                }
            }
        }
    }

    public double eval() {
        System.out.println(opsStack);
        System.out.println(numStack);
        for (var op : opsStack) {
            var right = numStack.pop();
            var left = numStack.pop();
            op.leftOperand(left);
            op.rightOperand(right);
            numStack.addLast(op);
//            System.out.printf("%s ", op.toString());
        }
        System.out.println(numStack);
        return numStack.pop().eval();
    }
}
