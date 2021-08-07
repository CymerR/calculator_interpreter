package ru.cmr.expr.impl;

import ru.cmr.expr.*;

public class AddExpression implements OperandableExpression<AddExpression> {

    private Expression leftOper, rightOper;

    private AddExpression() {}


    public static AddExpression start() {
        return new AddExpression();
    }

    public AddExpression leftOperand(Expression exp) {
        this.leftOper = exp;
        return this;
    }

    public AddExpression rightOperand(Expression exp) {
        this.rightOper = exp;
        return this;
    }


    @Override
    public double eval() {
        return leftOper.eval() + rightOper.eval();
    }


    @Override
    public String toString() {
        var l = leftOper == null ? "null" : leftOper.toString();
        var r = rightOper == null ? "null" : rightOper.toString();
        return "{" + l + " + " + r + "}";
    }
}
