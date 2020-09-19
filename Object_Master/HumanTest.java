public class HumanTest {
    public static void main(String[] args) {
        Human target1 = new Human();
        Human target2 = new Human();

        target1.getHealth();
        target2.getHealth();
        target1.setStrength(4);
        target2.getStrength();

        target1.attack(target2);
        target2.attack(target1);
    }
}
