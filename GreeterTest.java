public class GreeterTest {
    public static void main(String[] args) {
        Greeter g = new Greeter();
        String greeting = g.greet();
        String greetingWithName = g.greet("Sophie", "Markov");
        System.out.println(greetingWithName);
        String greetingWithFirstName = g.greet("Sophie");
        System.out.println(greetingWithFirstName);
        System.out.println(greeting);



        // if (greeting.equals("Hello World") || greetingWithName.equals("Hello Sophie")){
        //     System.out.println("Test successful");
        // } else {
        //     System.out.println("Test Fail");
        // }
    }
}
