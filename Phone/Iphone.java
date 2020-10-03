public class Iphone extends Phone implements Ringable{
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public void ring(){
        String r = "";
        r = r + "iPhone " + this.getVersionNumber() + " says " + this.getRingTone();
        System.out.println(r);
    }
    @Override
    public void unlock(){
        System.out.println("Unlocking via facial recognition");
    }
    @Override
    public void displayInfo(){
        System.out.println("iPhone " + this.getVersionNumber() + " from " + this.getCarrier());
    }

}
