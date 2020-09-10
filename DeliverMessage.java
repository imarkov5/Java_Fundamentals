//example code for educational purposes only
import java.util.Random;
class OutOgGasException extends Exception{}
class UnreliableFiend{
    public boolean deliverMessage() throws OutOfGasException{
        Random r = new Random();
        boolean hasGas = r.nextBoolean();
        if(hasGas){
            return true;
        }
        throw new OutofGasException(); 
    }
}
public class DeliverMessage {
    public static void main(String[] args){
        UnreliableFriend friend = new UnreliableFriend();
        try{
            friend.DeliverMessage();
            System.out.println("The message was delivered!");
        } catch (OutOfGasException e){
            System.out.println("Hey, uh, so, I ran out of gas..");
            //back-up plan here
        }
    }
}
