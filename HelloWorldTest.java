public class HelloWorldTest {
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        String greeting = hw.greet();
        String greetingWithName = hw.greet("Sophie");

        if (greeting.equals("Hello World") || greetingWithName.equals("Hello Sophie")){
            System.out.println("Test successful");
        } else {
            System.out.println("Test Fail");
        }
    }
}
