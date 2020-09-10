import java.util.HashMap;
import java.util.Set;

public class HshMapFun {
    public static void main(String[] args) {
        //<key, value>
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("nninja@codingdojo.com", "Nancy Ninja");
        userMap.put("ssamurai@codingdojo.com", "Sam Samurai");
        userMap.put("wwizard@codingdojo.com", "Walter Wizard");

        String name = userMap.get("nninja@codingdojo.com");
        System.out.println("The full name is: " + name);

        //get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.print(key + " - ");
            System.out.print(userMap.get(key) + ", ");
        }
    }
}
