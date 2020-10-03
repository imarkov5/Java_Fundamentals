public class PersonStaticController {
    public static void main(String[] args) {
        PersonStatic person1 = new PersonStatic(20, "David");
        PersonStatic person2 = new PersonStatic(25, "Lydia");
        //System.out.println(PersonStatic.numberOfPeople);
        System.out.println(PersonStatic.peopleCount());
    }
}
