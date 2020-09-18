public class ZooMammal {
    protected int energyLevel = 100;

    public ZooMammal(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public int displayEnergy(){
        System.out.println("Energy level: " + energyLevel);
        return energyLevel;
    }

}
