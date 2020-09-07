public class StringManipulatorTesting{
    public static void main(String[] args){
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("      Hello     ","      World     ");
        System.out.println(str);

        StringManipulator manipulator1 = new StringManipulator();
        char letter = 'o';
        Integer a = manipulator1.getIndexOrNull("Coding", letter);
        Integer b = manipulator1.getIndexOrNull("Hello World", letter);
        Integer c = manipulator1.getIndexOrNull("Hi", letter);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        StringManipulator manipulator2 = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = manipulator2.getIndexOrNull(word, subString);
        Integer e = manipulator2.getIndexOrNull(word, notSubString);
        System.out.println(d);
        System.out.println(e);

        StringManipulator manipulator3 = new StringManipulator();
        String word1 = manipulator3.concatSubstring("Hello", 2, 4, "world");
        System.out.println(word1);


        StringManipulator manipulator4 = new StringManipulator();
        int numCh = 6;
        String randomStr = manipulator4.randomString(numCh);
        System.out.println(randomStr);

    }
}