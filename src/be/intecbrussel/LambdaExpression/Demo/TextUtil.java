package be.intecbrussel.LambdaExpression.Demo;

public interface TextUtil
{
static String quote(String s){
    return String.format("<<%s>>",s);
}

}
