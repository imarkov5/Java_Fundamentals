public class FirstProgram{
    //Entry Point Method
    public static void main(String[] args){ //print main
        System.out.println("Hello World!"); //print sysout
        byte myByte = 100; //Stores whole numbers from -128 to 128
        short myShort = 1000; //Stores whole numbers from -32,368 to 32, 707
        int myInt = 1000000; //Stores whole numbers from -2,147,483,648 to 2,147,....etc
        long myLong = 100000000; //Stores whole numbers from -9,233,372,036,854,775,808 to ... Will use it for databases
        float myFloat = 3.14f; //Stores fractional numbers. Sufficient for storing 6-7 decimal places.
        double myDouble = 3.345345234345d; // Sores fractional numbers up to 15 decimal points
        boolean myBool = true; // Stores true of false
        char myChar = 'd'; // with single quotes; stores single character

        //Wrapper classes
        Integer myInteger = 10000;//Same as int, but with methods attached
        Character myCharacter = 'd';//Same as char but with methods attached
        System.out.println(Character.toUpperCase(myCharacter));


        //When do we use primitive variables vs wrapper classes: if we need a variable for "For loop" (something that counts up to keep track of the loop) we can use just primitive variables, and we use wrappers to work with their methods 


        //Strings
        String myString = "Java August 2020";
        System.out.println(myString.length());

        String bootcamp = "Java";
        String bootCamp = "August";
        String bootCAMP = "2020";

        System.out.println(bootcamp + " " + bootCamp + " " + bootCAMP);
        System.out.println(bootcamp.indexOf("J"));

        // Operators and Conditionals
        int myInt2 = 3;
        int myInt3 = 4;
        System.out.println(myInt2 == myInt3);

        String myString2 = "Java August 2020";
        System.out.println(myString.equals(myString2));

        int isOdd = 5;
        if(isOdd % 2 != 0){
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }

        //Loops
        // While
        int i = 0;
        while( i <= 5){
            System.out.println(i);
            i++;
        }
        
        //for

        for (i = 0; i <= 3; i++ ){
            System.out.println(i);
        }

        //to invoke function sayHello:
        System.out.println(sayHello("Jake"));
        myCountToTen();
        FizzBuzzTest();
    }

    //to declare other method we need to come out of main method parenthesis. Methods are the same as functions in JS
    //in JS: function sayHello(name){
    //       console.log("Hello" + name)}
    //In JAVA:
    public static String sayHello(String name){
        return "Hello " + name;
    }
    //if we don't need to return anything we'll use 'void'. VOID doesn't return anything!!!:
    public static void myCountToTen(){
        for(int num = 1; num <= 10; num ++){
            System.out.println(num);
        }
    }
    
    public static String fizzBuzz(int number){
        if(number % 3 == 0  && number % 5 ==0){
            return "FizzBUzz";
        } else if(number % 3 == 0){
            return "Fizz";
        }else if(number % 5 ==0){
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }

    public static void FizzBuzzTest(){
        for(int x = 1; x <=100; x++){
            String result = fizzBuzz(x);
            System.out.println("Number " + x + " - " + result);
        }
    }
}