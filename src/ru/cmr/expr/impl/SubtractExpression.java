package ru.cmr.expr.impl;

import ru.cmr.expr.Expression;
import ru.cmr.expr.Operandable;
import ru.cmr.expr.OperandableExpression;
import ru.cmr.interpret.ToString;

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
//        var l = leftOper == null ? "null" : leftOper.toString();
//        var r = rightOper == null ? "null" : rightOper.toString();
//        return "{" + l + " - " + r + "}";
        return new ToString("-", this).get();
    }


    @Override
    public Expression getLeft() {
        return leftOper;
    }

    @Override
    public Expression getRight() {
        return rightOper;
    }
}
