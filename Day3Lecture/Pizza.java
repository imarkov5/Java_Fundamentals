import java.util.Arrays;

public class Pizza {
    public String sauce;
    public String[] toppings;
    public char size;
    public double price;

    //Constructor
    public Pizza(String sauce, String[] toppings, char size, double price){
        this.sauce = sauce; //this sauce - sauce from class Pizza is going to equal to sauce that user is going to put in)
        this.toppings = toppings;
        this.size = size;
        this.price = price;
    }

    //Things we can do with pizza
    public void displayPizza(){
        //display pizza
        System.out.printf("This is a pizza with %s sauce, and with %s toppings, that costs $%.2f dollars", this.sauce, Arrays.toString(this.toppings), this.price);
    }

    //eat a slice
    public void eatASlice(){
        //code here
    }
}
