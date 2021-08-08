package ru.cmr.expr;

public interface RightOperandable<T> {

    T rightOperand(Expression expression);

    Expression getRight();
}
