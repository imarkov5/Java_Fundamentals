public class PizzaController {
    //Entry Point Method
    public static void main(String[] args) {
        // Pizza cheesePizza = new Pizza();
        // cheesePizza.toppings = new String[]{"cheese"};
        // cheesePizza.sauce = "marinara";
        // cheesePizza.size = 'L';
        // cheesePizza.price = 14.99;
        // cheesePizza.displayPizza();

        Pizza pepperoniPizza = new Pizza("white sauce", new String[]{"pepperoni", "cheese"}, 'L', 14.99);
        pepperoniPizza.displayPizza();
    }
}
