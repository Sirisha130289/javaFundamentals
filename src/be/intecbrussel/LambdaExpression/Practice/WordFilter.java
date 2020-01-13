package be.intecbrussel.LambdaExpression.Practice;

@FunctionalInterface
public interface WordFilter {

    boolean isValid(String s);
}
