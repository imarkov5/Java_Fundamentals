public class Mammal implements Attackable{
    protected String species;
    protected int health;
    protected int strength;


    public String getSpecies(){
        return species;
    }
    public void setSpecies(){
        this.species = species;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public int getStrength(){
        return strength;
    }
    public void setStrength(){
        this.strength = strength;
    }

    public Mammal(String species, int health){
        this.species = species;
        this.health = health;
    }
    public void sleep(){
        this.health += 2;
        System.out.println("zzz");
    }
    public int takeDamage(int damageAmount){
        this.health -= damageAmount;
        return health;
    }
    public void battle(Attackable target){
        //decrement health
        int damage = 5;
        target.setHealth(target.getHealth() - takeDamage(damage));
    }
}
