package ru.cmr.expr.impl;

import ru.cmr.expr.Expression;
import ru.cmr.expr.OperandableExpression;
import ru.cmr.interpret.ToString;

public class MultExpression implements OperandableExpression<MultExpression> {

    private Expression left, right;


    private MultExpression() {

    }


    public static MultExpression start() {
        return new MultExpression();
    }



    @Override
    public double eval() {
        return left.eval() * right.eval();
    }

    @Override
    public MultExpression leftOperand(Expression l) {
        this.left = l;
        return this;
    }

    @Override
    public MultExpression rightOperand(Expression r) {
        this.right = r;
        return this;
    }

    @Override
    public Expression getLeft() {
        return left;
    }

    @Override
    public Expression getRight() {
        return right;
    }

    @Override
    public String toString() {
        return new ToString("*", this).get();
    }
}
