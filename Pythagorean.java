import java.lang.Math;
public class Pythagorean {
    public double calculateHypotenuse(double legA, double legB){
        double hypotenuse = Math.sqrt(legA * legA + legB * legB);
        return hypotenuse;
    }
}