public class Greeter {
    public String greet(String name){
        //return "Hello " + name;
        return createGreeting(name);
    }
    public String greet(){
        //return "Hello World";
        return createGreeting("World");
    }
    public String greet(String firstName, String lastName){
        return createGreeting(firstName + " " + lastName);
    }
    private String createGreeting(String toBeGreeted){
        return "Greeting " + toBeGreeted + ", welcome to coding dojo";
    }
}
