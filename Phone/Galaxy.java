public class Galaxy extends Phone implements Ringable{
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Overriide
    public String ring(){
        //code here
    }
    @Override
    public String unlock(){
        //code here
    }
    @Override
    public void displayInfo(){
        //code here
    }

}
