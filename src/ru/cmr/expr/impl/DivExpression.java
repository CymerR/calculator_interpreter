package ru.cmr.expr.impl;

import ru.cmr.expr.Expression;
import ru.cmr.expr.OperandableExpression;
import ru.cmr.interpret.ToString;

public class DivExpression implements OperandableExpression<DivExpression> {

    private Expression left, right;


    private DivExpression() {}


    public static DivExpression start() {
        return new DivExpression();
    }


    @Override
    public double eval() {
        return left.eval() / right.eval();
    }

    @Override
    public DivExpression leftOperand(Expression expression) {
        this.left = expression;
        return this;
    }

    @Override
    public Expression getLeft() {
        return left;
    }

    @Override
    public DivExpression rightOperand(Expression expression) {
        this.right = expression;
        return this;
    }

    @Override
    public Expression getRight() {
        return right;
    }

    @Override
    public String toString() {
        return new ToString("/", this).get();
    }
}
