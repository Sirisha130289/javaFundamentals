package be.intecbrussel.sample;

import com.sun.security.jgss.GSSUtil;

public class Sample {
    public static void main(String[] args) {
int[] numbers ={1, 2, 2, 1, 13};
int sum=0;
for(int i=0; i<numbers.length; i++){
    sum+=numbers[i];
    if(numbers.length==0){
        sum+=numbers[i]-13;
    }


}
        System.out.println(sum);

    }

}


