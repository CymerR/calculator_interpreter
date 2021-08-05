package ru.cmr.interpret;

import ru.cmr.expr.Expression;
import ru.cmr.expr.impl.AddExpression;
import ru.cmr.expr.impl.NumExpression;
import ru.cmr.expr.impl.SubtractExpression;

import java.util.ArrayDeque;

public class Interpreter {

    private ArrayDeque<Expression> numStack, opsStack;

    public Interpreter(String input) {
        numStack = new ArrayDeque<>();
        opsStack = new ArrayDeque<>();

        var strs = input.split(" ");
        for (String word : strs) {
            switch (word) {
                case "+" -> opsStack.addFirst(AddExpression.start());
                case "-" -> opsStack.addFirst(SubtractExpression.start());
                default -> numStack.addFirst(new NumExpression(Double.parseDouble(word)));
            }
        }
    }

    public double eval() {
        System.out.println(opsStack);
        System.out.println(numStack);
        for (var op : opsStack) {
//            System.out.printf("%s ", op.toString());
        }

        return 0.0;
    }
}
