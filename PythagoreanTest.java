public class PythagoreanTest {
    public static void main(String[] args){
        Pythagorean theory = new Pythagorean();
        double hypotenuse = theory.calculateHypotenuse(3, 4);
        System.out.println(hypotenuse);
    }
}