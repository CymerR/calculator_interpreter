package ru.cmr.expr.impl;

import ru.cmr.expr.Expression;

public class NumExpression implements Expression {


    private final double value;

    public NumExpression(double value) {
        this.value = value;
    }

    @Override
    public double eval() {
        return value;
    }
}
