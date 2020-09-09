import java.util.Arrays;
import java.util.ArrayList;

public class BasicJava {
    public static void main(String[] args) {
        int[] nums = {34,234,543,-45,78,1,5};
        LoopArray(nums);
        FindMax(nums);
        FindMin(nums);
        MaxMinAverage(nums);
        ShiftValues(nums);
        System.out.println(GetArraySum(nums));
    }

        //Print 1-255
        //Write a method that prints all the numbers from 1 to 255.
    public static void OneTo255(){
        for(int i = 1; i <=255; i++){
            System.out.print(i+", ");
        }
    }
        /*Print odd numbers between 1-255
        Write a method that prints all the odd numbers from 1 to 255.*/
    public static void PrintOdds(){
        for(int i = 1; i <= 255; i++){
            if(i % 2 != 0){
                System.out.print(i + ", ");
            }
        }
    }
        

        // Print Sum
        // Write a method that prints the numbers from 0 to 255, but this time print the sum of the numbers that have been printed so far.
    public static void PrintSum(){
        int sum = 0;
        for(int i = 0; i <= 255; i++){
            sum += i;
            System.out.println(String.format("New number: %d, Sum: %d", i, sum));
        }
    }
    public static int GetArraySum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

        //Iterating through an array
        //Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen. Being able to loop through each member of the array is extremely important.
    public static void LoopArray(){
        int[] arrayX = {1,3,5,7,9,13};
        for(int i = 0; i < arrayX.length; i++){
            System.out.println(arrayX[i]);
        }
    }

    //another way
    public static void LoopArray(int[] arr){
        for(int val: arr){
            System.out.println(val);
        }
    }

        //Find Max
        //Write a method (sets of instructions) that takes any array and prints the maximum value in the array. Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.
    public static void FindMax(){
        int[] myArray = {0,1,4,7,-1,2,-8,10,22,1,-8};
        int max = myArray[0];
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] > max){
                max = myArray[i];
            }
        }
        System.out.println(max);
    }
    public static int FindMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int val: arr){
            if(val > max){
                max = val;
            }
        }
        return max;
    }
    public static int FindMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int val: arr){
            if(val < min){
                min = val;
            }
        }
        return min;
    }
        //Get Average
        //Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5. Again, make sure you come up with a simple base case and write instructions to solve that base case first, then test your instructions for other complicated cases.
    public static void GetAverage(){
        int[] myArrayAvg = {2, 10, -3};
        int total = myArrayAvg[0];
        for(int i = 1; i < myArrayAvg.length; i++){
            total += myArrayAvg[i];
        }
        int average = total/myArrayAvg.length;
        System.out.println("Average: " + average);
    }

    public static double GetAverage(int[] nums){
        int sum = GetArraySum(nums);
        double avg = (double)sum/nums.length;
        System.out.println(String.format("Sum: %d, Average: %f", sum, avg));
        return avg;
    }


        //Array with Odd Numbers
        //Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].

    public static ArrayList<Integer> OddArray(){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i <= 255; i++){
            if(i % 2 != 0){
                nums.add(i);
            }
        }
        return nums;
    }

        //Greater Than Y
        //Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there are two values in the array that are greater than 3).
    public static int GreaterThanY(int[] arr, int y){
        int count = 0;
        for(int num: arr){
            if(num > y){
                count++;
            }
        }
        return count;
    }
        //Square the values
        //Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].

    public static void SquareArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        System.out.println(arr);
    }

        //Eliminate Negative Numbers
        //Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. When the method is done, x should have no negative values, say [1, 5, 10, 0]

    public static void EliminateNegatives(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <  0){
                nums[i] = 0;
            }
        }
        System.out.println(nums);
    }

        //Max, Min, and Average
        //Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, the minimum value in the array, and the average of the values in the array. The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]

    public static void MaxMinAverage(int[] nums){
        int min = FindMin(nums);
        int max = FindMax(nums);
        double avg = GetAverage(nums);
        System.out.println(String.format("Max: %d, Min: %d, Average: %f", max, min, avg));
    }

        //Shifting the Values in the Array
        //Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds.

    public static void ShiftValues(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = 0;
        System.out.println(Arrays.toString(arr));
    }    

    
}
