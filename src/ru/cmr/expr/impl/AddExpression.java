package ru.cmr.expr.impl;

import ru.cmr.expr.Expression;

public class AddExpression implements Expression {

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
}
