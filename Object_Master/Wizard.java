public class Wizard extends Human{
    public Wizard(){
        this.health = 50;
        this.intelligence = 8;
    }
    public int heal(Human target){
        target.health += this.intelligence;
        System.out.println("Wizard healed target. Target's Health: " + target.health);
        return target.health;
    }
    public int fireball(Human target){
        target.health -= this.intelligence * 3;
        System.out.println("Wizard fireballed target. Target.s health: " + target.health);
        return target.health;
    }

}
