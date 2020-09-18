public class ManTest {
    public static void main(String[] args){
        Man m = new Man();
        m.regularTemperature();
        m.startSleeping();
        m.goToWork();
        boolean sleeping  = m.isSleeping();

        if(sleeping){
            System.out.println("The human is sleeping!");
        }
    }
}
