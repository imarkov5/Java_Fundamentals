public class Human {
    // private int strength = 3;
    // private int stealth = 3;
    // private int intelligence = 3;
    // private int health = 100;

    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int health = 100;

    //getters and setters
    public int getIntelligence(){
        return intelligence;
    }
    public void setIntelligence(int newIntelligence){
        this.intelligence = newIntelligence;
    }
    public int getStrength(){
        return strength;
    }
    public void setStrength(int newStrength){
        this.strength = newStrength;
    }
    public int getStealth(){
        return stealth;
    }
    public void setStealth(int newStealth){
        this.stealth = newStealth;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int newHealth){
        this.health = newHealth;
    }

    public int attack(Human target){
        target.health -= this.strength;
        System.out.println("Health of attacked human now: " + target.health);
        return target.health;
    }

}
