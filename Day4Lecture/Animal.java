public class Animal {
    private String species;
    private char gender;
    private int health;
    private int strength;

    //Method Overloading
    public Animal(){ //this constructor called POJO: Plain Old Java Object - empty constructor

    }
    public Animal(String species, char gender, int strength){
        this.species = species;
        this.gender = gender;
        this.health = 100;
        this.strength = strength;
    }

    //Getters and Setters
    public String getSpecies(){
        return this.species;
    }
    public void setSpecies(){
        this.species = species;
    }
    public char getGender(){
        return this.gender;
    }
    public void setGender(){
        this.gender = gender;
    }
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int health){
        this.health = health;
    }

    public void battle(String powerMove, Animal target){
        //Define the logic how the animal attacks
        int damage;
        if(powerMove.equals("roar")){
            damage = 3;
        } else if(powerMove.equals("bear hug")){
            damage = 10;
        } else if (powerMove.equals("defaultMove")){
            damage = 2; 
        }else{
            System.out.println("Move not recognized");
            return;
        }
        //multiply the strength and the damage
        int effectiveDamage = this.strength * damage;

        //reduce the target health by effectiveDamage
        target.health -= effectiveDamage;

        //print to the console what just happened
        System.out.printf("%s attacks %s for %d health points. ", this.species, target.species, effectiveDamage);
        System.out.println("Target Health: " + target.health);
    }
    
    public void battle(Animal target){
        this.battle("defaultMove", target);
    }

}
