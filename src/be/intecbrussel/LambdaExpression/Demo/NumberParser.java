package be.intecbrussel.LambdaExpression.Demo;

import java.math.BigDecimal;

@FunctionalInterface
public interface NumberParser {

    BigDecimal parse(String s);
}
