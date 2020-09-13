public class PizzaController {
    //Entry Point Method
    public static void main(String[] args) {
        Pizza cheesePizza = new Pizza();
        cheesePizza.setSauce("Marinara");
        // cheesePizza.toppings = new String[]{"cheese"};
        // cheesePizza.sauce = "marinara";
        // cheesePizza.size = 'L';
        // cheesePizza.price = 14.99;
        // cheesePizza.displayPizza();

        Pizza pepperoniPizza = new Pizza("white sauce", new String[]{"pepperoni", "cheese"}, 'L', 14.99);
        pepperoniPizza.displayPizza();
        //pepperoniPizza.sauce = "marinara" won't work because sauce is set to private
        System.out.println(pepperoniPizza.getSauce());
        pepperoniPizza.setSauce("");
        pepperoniPizza.setSauce("Marinara");
        System.out.println(pepperoniPizza.getSauce());
        pepperoniPizza.eatASlice(3);
        System.out.println(pepperoniPizza.getSlices());

        Pizza vegetarianPizza = new Pizza("marinara", new String[]{"mushrooms", "peppers"}, 'L');
        System.out.println(vegetarianPizza.getPrice());
        System.out.println(vegetarianPizza.getSlices());

        vegetarianPizza.pizzaFight(pepperoniPizza);

        vegetarianPizza.eatASlice();

        vegetarianPizza.eatASlice(4);
    }
}
