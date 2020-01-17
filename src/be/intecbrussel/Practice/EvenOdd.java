package be.intecbrussel.Practice;

import java.util.Arrays;

public class EvenOdd {


    public String missingChar(String str, int n) {

        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());
        return front + back;
    }

    public String delDel(String str) {
        if (str.length() > 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

        public boolean mixStart(String str){
            if (str.startsWith("mix") || str.contains("ix")) {
                return true;
            }
            return false;
        }

    public String startOz(String str) {
if(str.startsWith("oz")){
    return str.substring(0,2);
} else if(str.substring(1,2).contains("z")){
    return str.substring(1,2);
} else if(str.substring(0,1).contains("o")){
    return str.substring(0,1);
}
return "";
    }
    public int[] makeMiddle(int[] nums) {
        int[]c = new int[2];
        for(int i=0; i<nums.length;i++){
            if((nums.length)%2==0){
                c[0]=nums[i];
                c[1]=nums[i+1];
            }
        }
        return c;
    }

    public static void main (String[]args){
            EvenOdd evenOdd = new EvenOdd();
            System.out.println(evenOdd.missingChar("kitten", 2));
            System.out.println(evenOdd.mixStart("pix snacks"));
            System.out.println(evenOdd.startOz("bz00"));
        }
    }

