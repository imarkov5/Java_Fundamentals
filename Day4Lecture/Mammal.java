public class Mammal {
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
    public void battle(Mammal target){
        //decrement health
        target.health -= 5;

    }
}
