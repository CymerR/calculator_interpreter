package ru.cmr.interpret;

import ru.cmr.expr.Expression;

import java.util.ArrayDeque;

public class Interpreter {

    private ArrayDeque<Expression> numStack, opsStack;

    public Interpreter(String input) {
        numStack = new ArrayDeque<>();
        opsStack = new ArrayDeque<>();

        var strs = input.split(" ");
        var parser = new Parser();
        for (String word : strs) {

        }
    }

    public double eval() {
        return 0;
    }
}
