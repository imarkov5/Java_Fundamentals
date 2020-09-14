import java.util.jar.Attributes.Name;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person(10, "Bob", 150);
        Person person2 = new Person(12, "Lisa", 151);
        person1.objectMethods(person2);
    }
}
