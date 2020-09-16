public class Animal {
    private String species;
    private char gender;
    private int health;

    //Method Overloading
    public Animal(){ //this constructor called POJO: Plain Old Java Object - empty constructor

    }
    public Animal(String species, char gender){
        this.species = species;
        this.gender = gender;
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
    

}
