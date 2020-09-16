import java.util.ArrayList;
public class ZooController {
    public static void main(String[] args) {
        Mammal dolphin = new Mammal("dolphin", 100);
        Gorilla gorilla = new Gorilla();

        // ArrayList<Mammal> animals = new ArrayList<Mammal>();
        // animals.add(dolphin);
        // animals.add(gorilla);

        // for(Mammal m: animals){
        //     System.out.println(m.getSpecies());
        // }

        gorilla.sleep();
    }
}
