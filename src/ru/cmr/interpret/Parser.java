package ru.cmr.interpret;

import ru.cmr.expr.Expression;
import ru.cmr.expr.impl.NumExpression;

public class Parser {

    private final String word;

    public Parser(String word) {
        this.word = word;
    }

    public Expression parse() {
        return new NumExpression(0);
    }
}
