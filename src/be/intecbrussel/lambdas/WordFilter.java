package be.intecbrussel.lambdas;

@FunctionalInterface
public interface WordFilter {

    boolean isValid(String s);
}
