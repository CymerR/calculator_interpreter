package ru.cmr.expr;

public interface LeftOperandable<T> {

    T leftOperand(Expression expression);

    Expression getLeft();
}
