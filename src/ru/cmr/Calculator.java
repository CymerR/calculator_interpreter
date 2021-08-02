package ru.cmr;

import ru.cmr.interpret.Interpreter;

public class Calculator {

    private String input;

    public Calculator(String input) {
        this.input = input;
    }

    public double calc() {
        return new Interpreter(input).eval();
    }
}
