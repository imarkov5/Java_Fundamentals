public class Man extends Human {
    public void goToWork(){
        System.out.println("I'm going to work, something only humans can do.");
    }
    public void startSleeping(){
        System.out.println("Toss and turn");
        super.startSleeping();
    }
}
