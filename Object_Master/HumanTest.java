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

        Wizard w = new Wizard();
        Samurai s = new Samurai();
        Samurai Musashi = new Samurai();
        Ninja n = new Ninja();

        w.attack(s);
        w.fireball(s);
        w.heal(s);
        n.steal(s);
        n.runAway();
        s.deathBlow(n);
        s.meditate();
        w.heal(n);
        System.out.println(s.howMany());
    }
}
