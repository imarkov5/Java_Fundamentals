public class StringDemo {
    public static void main(String[] args) {
        String ninja = "Coding Dojo is awesome!";
        int length = ninja.length();
        System.out.println("String Length is: " + length);
        String string1 = "My name is ";
        String string2 = "Sophie";
        String string3 = string1.concat(string2);
        System.out.println(string3);
    }
}