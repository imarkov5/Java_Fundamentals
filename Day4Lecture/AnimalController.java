public class AnimalController {
    public static void main(String[] args) {
        Animal tigress = new Animal("Tigress", 'f', 5);
        Animal lion = new Animal("Lion", 'm', 7);
        Animal bear = new Animal("Bear", 'f', 10);

        tigress.battle("roar", lion);
        bear.battle(tigress);
    }
}
