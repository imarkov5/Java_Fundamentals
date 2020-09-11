package Day3Lecture;

public class PizzaController {
    //Entry Point Method
    public static void main(String[] args) {
        Pizza cheesePizza = new Pizza();
        cheesePizza.toppings = new String[]{"cheese"};
        cheesePizza.sauce = "marinara";
        cheesePizza.size = 'L';
        cheesePizza.price = 14.99;

    }
}
