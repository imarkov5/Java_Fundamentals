import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public static void main(String[] args) {
        int[] nums = {3,5,1,2,7,9,8,13,25,32};    
        GreaterThanTen(nums);
    }

    public static int GreaterThanTen(int[] nums){
        int sum = 0;
        int[] newNums;
        for(int val: nums){
            sum += val;
            if(val > 10){
                newNums.add(val);
            }
        }
        System.out.println(sum);
        return ;
    }
}
