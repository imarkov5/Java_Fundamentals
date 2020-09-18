public class Barrel implements Attackable {
    private String name;
    private int health;

    public Barrel(){
        this.name = "Barrel";
        this.health = 5;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public int takeDamage(int damageAmount){
        this.health -= damageAmount;
        return health;
    }
}
