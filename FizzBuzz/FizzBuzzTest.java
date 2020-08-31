public class FizzBuzzTest{
    public static void main(String[] args){
        FizzBuzz calculateFizzBuzz = new FizzBuzz();
        for(int i = 0; i <= 15; i++){
            String result = calculateFizzBuzz.fizzBuzz(i);
            System.out.println("Number " + i + " - " + result);
        }   
    }
}