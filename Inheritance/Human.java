public class Human {
    private boolean sleeping = false;
    public void regularTemperature(){
        System.out.println("My temperature is just right now.");
    }
    public void startSleeping(){
        sleeping = true;
        System.out.println("ZzZz");
    }
    public boolean isSleeping(){
        return sleeping;
    }
}
