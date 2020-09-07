import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;


public class Day2Lecture{
    public static void main(String[] args) {
        /*String name = "Jeremy";
        String name2 = "Jeremy";
        System.out.println(name == name2);//true

        String name3 = new String("Jeremy");
        String name4 = new String("Jeremy");
        System.out.println(name3 == name4);//false, because they are two different instances

        String name5 = new String("Jeremy");
        String name6 = new String("Jeremy");
        System.out.println(name5.equals(name6));//true because it's comparing what's inside of the instances*/

        String[] people = {"Matthew", "Jaremy", "Edgar"};
        //you can't add new index in to the existing array
        //people[3] = "Justin"; // out ob bounds error'
        System.out.println(people[2]);
        //On of the ways to have more people
        String[] newPeople = new String[10];
        
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i ++){
            numbers[i] = i +1;   
        }
        System.out.println(numbers);//numbers is an object and it will print out memory location of this object
        //after we imported Arrays library:
        System.out.println(Arrays.toString(numbers));// we can see classical array

        //to have an array with different types, use object
        Object[] myObjectArr = {"matthew", 13, 'c', true};

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);

        }

        //Collections Superclass
        //ArrayLists
        ArrayList<String> numbersSpelledOut = new ArrayList<String>();
        numbersSpelledOut.add("one");
        numbersSpelledOut.add("two");
        numbersSpelledOut.add("three");
        numbersSpelledOut.add("four");
        System.out.println(numbersSpelledOut);
        System.out.println(numbersSpelledOut.get(1));//equivalent to arr[1] in JS

        for(int i = 0; i < numbersSpelledOut.size(); i++){
            System.out.println(numbersSpelledOut.get(i));
        }

        //For Each Loop
        for(String num : numbersSpelledOut){
            System.out.println(num);
        }

        //Hash Map - won't keep the order.
        HashMap<String, String> ourHobbies = new HashMap<String, String>();
        ourHobbies.put("Edgar", "Video Games");
        ourHobbies.put("Justin", "Making Wine");
        ourHobbies.put("Jeremy", "Cryptocurrency");
        ourHobbies.put("Frank", "Sleep");
        ourHobbies.put("Ozair", "Traveling");
        ourHobbies.put("Tailor", "Running");
        ourHobbies.put("Matthew", "Photography");
        ourHobbies.put("Zach", "WebFun");
        System.out.println(ourHobbies);

        System.out.println(ourHobbies.get("Edgar"));

        for(String name : ourHobbies.keySet()){
            System.out.println(name);
        }
        for(String name : ourHobbies.values()){
            System.out.println(name);
        }

        for(HashMap.Entry<String, String>  nameHobbies: ourHobbies.entrySet()){
            System.out.println("key: " + nameHobbies.getKey() + ", value: " + nameHobbies.getValue());
        }
    }
}