package be.intecbrussel.programming_language.CodingBat;

public class CodingBatStringCountingEvensinArrayInt {
    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 3, 4};
        int count =0;
        for(int i=0; i<nums.length;i++){
            if((nums[i] % 2) == 0){
                count++;
            }

        }
        System.out.println("Count of evens is " + count);
    }

}
