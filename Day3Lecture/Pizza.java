import java.util.Arrays; 

//when we use public it means that it would be accessible anywhere in the program
public class Pizza {
    //Access Modifiers
    private String sauce;
    private String[] toppings;
    private char size;
    private double price;
    private int slices;

    //Constructor
    public Pizza(String sauce, String[] toppings, char size, double price){
        this.sauce = sauce; //this sauce - sauce from class Pizza is going to equal to sauce that user is going to put in)
        this.toppings = toppings;
        this.size = size;
        this.price = price;
        this.slices = 8;
    }

    //Method Overloading. This constructor is for a customer - there is no price, because we don't want a customer to change the price

    public Pizza(String sauce, String[] toppings, char size){
        this.sauce = sauce;
        this.toppings = toppings;
        this.size = size;
        this.price = 20;
        this.slices = 10;
    }

    public Pizza(){

    }

    //Things we can do with pizza
    public void displayPizza(){
        //display pizza
        System.out.printf("This is a pizza with %s sauce, and with %s toppings, that costs $%.2f dollars", this.sauce, Arrays.toString(this.toppings), this.price);
    }

    //eat a slice
    public void eatASlice(int slices){
        System.out.printf("You have eaten %d slices. ", slices);
        
        this.slices -= slices;
        
        System.out.println("The pizza now has " + this.slices + " left");
    }

    //method Overloading for eat a slice, here there's no parameters because this method would allow to eat only 1 slice:

    public void eatASlice(){
        System.out.printf("You have eaten 1 slice of pizza.");
        this.slices -=1;
        System.out.println("The pizza now has " + this.slices + " left");

    }

    //Vegetarian pizza takes off slice of pepperoni pizza
    public void pizzaFight(Pizza otherPizza){
        otherPizza.setSlices(otherPizza.getSlices() - 1);
        System.out.println(Arrays.toString(this.toppings) + " pizza just cut 1 slice from " + Arrays.toString(otherPizza.toppings));
        System.out.println("Other pizza now has " + otherPizza.getSlices());
    }

    //Getters
    public int getSlices(){
        return this.slices;
    }
    public String getSauce(){
        return this.sauce;
    }
    public String getToppings(){
        return Arrays.toString(this.toppings);
    }
    public char getSize(){
        return this.size;
    }
    public double getPrice(){
        return this.price;
    }

    //Setters

    public void setPrice( double price){
        this.price = price;
    }
    public void setSauce(String sauce){
        if(sauce.equals("")){
            System.out.println("Sauce field cannot be empty");
            return;
        }
        this.sauce = sauce;
    }
    public void setSize(char size){
        this.size = size;
    }
    public void setSlices(int slices){
        this.slices = slices;
    }
    public void setToppings(String[] toppings){
        this.toppings = toppings;
    }


}
