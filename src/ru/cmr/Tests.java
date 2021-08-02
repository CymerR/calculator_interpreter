package ru.cmr;

import ru.cmr.expr.impl.AddExpression;
import ru.cmr.expr.impl.NumExpression;
import ru.cmr.expr.impl.SubtractExpression;

public class Tests {
    static class SimpleTests {
        static class AddTest {
            public static void main(String[] args) {
                var left = new NumExpression(15);
                var right = new NumExpression(10);
                var res = AddExpression.start()
                        .leftOperand(left)
                        .rightOperand(right);

                assert 25.0 == res.eval();
            }
            static class SubTest {
                public static void main(String[] args) {
                    var left = new NumExpression(15);
                    var right = new NumExpression(10);
                    var res = SubtractExpression.start()
                            .leftOperand(left)
                            .rightOperand(right);

                    assert 5.0 == res.eval();
                    }
            }
        }

    }
}
