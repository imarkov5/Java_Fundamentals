public class Samurai extends Human{
    private static int numberOfSamurai = 0;
    private static int defaultHealth = 200;
    public Samurai(){
        this.health = defaultHealth;
        Samurai.numberOfSamurai += 1;
    }
    public int deathBlow(Human target){
        target.health = 0;
        this.health /= 2;
        System.out.println("Samurai did a death blow. Target is dead. Target's Health: " + target.health + " Samurai's health: " + this.health);
        return this.health;
    }
    public int meditate(){
        this.health += this.health/2;
        System.out.println("Samurai meditated. Health: " + this.health);
        return this.health;
    }
    public static int howMany(){
        return Samurai.numberOfSamurai;
    }
}
