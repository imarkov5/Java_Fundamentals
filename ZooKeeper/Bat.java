public class Bat extends ZooMammal{
    public Bat(int energyLevel){
        super(300);
    }
    public void fly(){
        energyLevel -=50;
        System.out.println("I'm flying. Bat's Energy Level: " + energyLevel);
    }    
    public void eatHumans(){
        energyLevel += 25;
        System.out.println("I just ate. Bat's Energy Level: " + energyLevel);
    }
    public void attackTown(){
        energyLevel -=100;
        System.out.println("I'm attacking a town. Bat's Energy Level: " + energyLevel);
    }
}
