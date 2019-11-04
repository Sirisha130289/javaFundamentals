package be.intecbrussel.OOPChapter6.ex6_4;

public class ex6_4 {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder();

        StringBuilder sb1 = new StringBuilder();

        String text1 = "Hello";
        sb.append(text1);

        String text2 = "You are beautiful";
        sb1.append(text2);
        System.out.println(sb);
        System.out.println(sb1);

        String text3 = " I'm Sirisha";
        sb.append(text3);
        System.out.println(sb);

        sb1.reverse();
        System.out.println(sb1);


        System.out.println(sb.toString().replaceAll(" ",""));
        System.out.println();

        String result= sb1.toString().replaceAll("t","tt");
        System.out.println(result);
    }


}

