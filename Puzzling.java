import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Puzzling {
    public static void main(String[] args) {

        Random r = new Random();

        ArrayList<Character> alphabet = new ArrayList<Character>();//when we work with collections superclass, everything has to be an object, so ArrayList<char> or ArrayList<int> won't work here, instead use ArrayList<Character> or ArrayList<Integer>
        for(char ch = 'a'; ch <= 'z'; ++ch){
            alphabet.add(ch);
        }
        System.out.println(alphabet);
        
        Collections.shuffle(alphabet);
        System.out.println(alphabet);
        System.out.println(alphabet.get(25));

        int randomNumber = r.nextInt(25);
        System.out.println(alphabet.get(randomNumber));
    }
}
