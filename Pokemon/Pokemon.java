public class Pokemon {
    private String name;
    private int health;
    private String type;
    private static int count = 0;

    public Pokemon(){
        count++;
    }

    public Pokemon(String name, int health, String type){
        Pokemon.setCount(getCount()+1);
        setName(name);
        setHealth(health);
        setType(type);
        System.out.println("Pokemon is created: " + this.name + ", health - " + this.health + ", type - " +this.type );
    }

    public String getName(){
        return this.name;
    }
    public int getHealth(){
        return this.health;
    }
    public String getType(){
        return this.type;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHealth(int health){
        this.health += health;
    }
    public void setType(String type){
        this.type = type;
    }
    public static int getCount(){
        return count;
    }
    public static void setCount(int count){
        Pokemon.count = count;
    }

    public void attackPokemon(Pokemon pokemon){
        pokemon.health -= 10;
    }
}
