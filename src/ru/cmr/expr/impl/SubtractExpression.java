package ru.cmr.expr.impl;

import ru.cmr.expr.Expression;
import ru.cmr.expr.Operandable;
import ru.cmr.expr.OperandableExpression;

public class SubtractExpression implements OperandableExpression<SubtractExpression> {
    private Expression leftOper, rightOper;

    private SubtractExpression() {}


    public static SubtractExpression start() {
        return new SubtractExpression();
    }

    public SubtractExpression leftOperand(Expression exp) {
        this.leftOper = exp;
        return this;
    }

    public SubtractExpression rightOperand(Expression exp) {
        this.rightOper = exp;
        return this;
    }


    @Override
    public double eval() {
        return leftOper.eval() - rightOper.eval();
    }

    @Override
    public String toString() {
        return "-";
    }
}
