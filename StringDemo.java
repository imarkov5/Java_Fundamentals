public class StringDemo {
    public static void main(String[] args) {
        String ninja = "Coding Dojo is awesome!";// Strings like any other object, belong to a class. Instances of the String class are immutable - it cannot be modified

        //Methods of the String Class:
        //Length
        int length = ninja.length();
        System.out.println("String Length is: " + length);

        //Concatenate
        String string1 = "My name is ";
        String string2 = "Sophie";
        String string3 = string1.concat(string2);
        System.out.println(string3);
        
        // second way to concatenate:L
        System.out.println("Welcome" + " ninja" + "!"); //displays "Welcome ninja!"

        //Format (another way of concatenating strings)
        String ninja1 = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);//%s - expecting a string; %.2f is expecting a float data type with two values to right of the decimal point
        System.out.println(ninja1);

        //IndexOf

        String ninja2 = "Welcome to Coding Dojo";
        int a  = ninja2.indexOf("Coding");
        int b = ninja2.indexOf("co");
        int c = ninja2.indexOf("pizza");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //Trim
        String sentence = "       spaces everywhere!      ";
        System.out.println(sentence.trim());

        //Uppercase and Lowercase
        String a1 = "Hello";
        String b1 = "world";
        System.out.println(a1.toLowerCase());
        System.out.println(b1.toUpperCase());

        //Equality
        String a2 = new String("word");
        String b2 = new String("word");
        System.out.println(a2 == b2);//they are not the same exact object
        System.out.println(a2.equals(b2));//same exact characters
    }
}