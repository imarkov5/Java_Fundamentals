public class Mammal {
    private String species;
    private int health;

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

    public Mammal(String species, int health){
        this.species = species;
        this.health = health;
    }
    public void sleep(){
        this.health += 2;
        System.out.println("zzz");
    }
}
