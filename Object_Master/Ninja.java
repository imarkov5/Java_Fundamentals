public class Ninja extends Human{
    public Ninja(){
        this.stealth = 10;
    }
    public int steal(Human target){
        this.health += this.stealth;
        target.health -= this.stealth;
        System.out.println("Ninja stole target. Ninja's health now: " + this.health + " Target's health is: " + target.health);
        return this.health;
    }
    public int runAway(){
        this.health -= 10;
        System.out.println("Ninja ran away. Health: " + this.health);
        return this.health;
    }
}
