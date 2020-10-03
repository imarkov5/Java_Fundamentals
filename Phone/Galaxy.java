public class Galaxy extends Phone implements Ringable{
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public void ring(){
        String r = "";
        r = r + "Galaxy " + this.getVersionNumber() + " says " + this.getRingTone();
        System.out.println(r);
    }
    @Override
    public void unlock(){
        System.out.println("Unlocking via fingerprint");
    }
    @Override
    public void displayInfo(){
        System.out.println("Galaxy " + this.getVersionNumber() + " from " + this.getCarrier());
    }

}