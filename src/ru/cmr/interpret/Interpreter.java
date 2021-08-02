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
            if (word.equals("+")) {
                opsStack.addLast(AddExpression.start());
            } else if (word.equals("-")) {
                opsStack.addLast(SubtractExpression.start());
            } else {
                numStack.addLast(new NumExpression(Double.parseDouble(word)));
            }
        }
    }

    public double eval() {
        for (var op : opsStack) {
            
        }
        return opsStack.getFirst().eval();
    }
}
