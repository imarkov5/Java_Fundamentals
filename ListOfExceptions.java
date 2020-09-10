import java.util.ArrayList;
import java.util.Random;


/*● Create ArrayList

● Try to cast each element to an Integer

● Use try/catch blocks to handle the exceptions*/

public class ListOfExceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hello world");
        myList.add(48);
        myList.add("Goodbye World");
        
        for(int i = 0; i < myList.size(); i++){
            try{
                Integer castedValue = (Integer) myList.get(i);
            } catch (ClassCastException e) {
                System.out.println(e);
            }  
        }
    }
}
