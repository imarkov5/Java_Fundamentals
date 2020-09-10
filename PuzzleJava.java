import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public static void main(String[] args) {
        int[] nums = {3,5,1,2,7,9,8,13,25,32};
        String[] namesShuffled = { "Nancy", "Jinchi", "Fujibayashi", "Momochi", "Ishikawa"};    
        ArrayList<String> names = new ArrayList<String>();
        int lowerBound = 55;
        int upperBound = 100;
        int numChars = 5;
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        GreaterThanTen(nums);
        ShuffleNames(names);
        ShuffleNames(namesShuffled);
        AlphabetShuffle();
        RandomIntArray(lowerBound, upperBound);
        RandomString(numChars);
        RandomStringArray();
    }

    public static int[] GreaterThanTen(int[] nums){
        int sum = 0;
        int[] newNums = new int[BasicJava.GreaterThanY(nums, 10)];
        int j = 0;
        for(int val : nums){
            sum += val;
            if(val > 10){
                newNums[j] = val;
                j++;
            }
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(newNums));
        return newNums;
    }

    public static void ShuffleNames(ArrayList<String> names){
        System.out.println("Before shuffling" + names);
        Collections.shuffle(names);
        System.out.println("After shuffling" + names);
    }

    public static String[] ShuffleNames(String[] namesShuffled){
        int count = 0;
        for(String val : namesShuffled){
            if(val.length() > 5){
                count++;
            }
        }
        System.out.println(count);
        String[] namesSortedSize = new String[count];
        int j = 0;
        for(String val : namesShuffled){
            if(val.length() > 5){
                namesSortedSize[j] = val;
                j++;
            }
        }
        System.out.println(Arrays.toString(namesSortedSize));
        return namesSortedSize;
    }
    public static void AlphabetShuffle(){
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(char ch = 'a'; ch <= 'z'; ++ch){
            alphabet.add(ch);
        }
        System.out.println("In order: " + alphabet);
        Collections.shuffle(alphabet);
        System.out.println("Shuffled: " + alphabet);
        System.out.println("First letter: " + alphabet.get(0));
        System.out.println("Last letter: " + alphabet.get(25));
        char letter = alphabet.get(0);
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.println("The first letter is a VOWEL!!!");
        }
    }
    public static int[] RandomIntArray(int lowerBound,int upperBound){
        int[] arr = new int[10];
        int offset = upperBound - lowerBound;
        Random r = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(offset) + lowerBound;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Min: " + BasicJava.FindMin(arr));
        System.out.println("Max: " + BasicJava.FindMax(arr));
        return arr;
    }
    public static String RandomString(int numChars){
        String output = "";
        Random r = new Random();
        for(int i = 0; i < numChars; i++){
            output += Character.toChars(r.nextInt(122-97)+97)[0];
        }
        return output;
    }
    public static String[] RandomStringArray(){
        String[] arr = new String[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = RandomString(5);
        }
        System.out.print(Arrays.toString(arr));
        return arr;
    }
}
