package be.intecbrussel.LambdaExpression.Practice;

public interface TextUtil
{

    static String quotes(String s){
        return String.format("<<%s>>",s);
    }
}
