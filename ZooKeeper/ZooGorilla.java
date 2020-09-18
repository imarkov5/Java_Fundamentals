public class ZooGorilla extends ZooMammal{
    public ZooGorilla(int energyLevel){
        super(energyLevel);
    }
    public void throwSomething(){
        this.energyLevel -= 5;
        System.out.println("Gorilla threw something and its energy level now:" + energyLevel);
    }
    public void eatBananas(){
        this.energyLevel += 10;
        System.out.println("Gorilla ate a banana and its energy level now: " + energyLevel);
    }
    public void climb(){
        this.energyLevel -=10;
        System.out.println("Gorilla climbed a tree and its energy level is: " + energyLevel);
    }
}
