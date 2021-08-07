package ru.cmr.interpret;

import ru.cmr.expr.Expression;
import ru.cmr.expr.Operandable;

public class ToString {


    private String res;

    public ToString(String op, Operandable obj) {
        res = new StringBuilder()
                .append(" { ")
                    .append(obj.getLeft()).append(" ")
                    .append(op).append(" ")
                    .append(obj.getRight())
                .append(" } ")
                .toString();
    }

    public String get() {
        return res;
    }

}
