public class Vehicle {
    private int numberOfWheels;
    private String color;

    //constructor
    public Vehicle(String color){
        //setting the color attribute to the value from the color parameter
        this.color = color;
    }
    //To allow multiple ways to instantiate our objects, we must overload the constructor method.
    //constructor 2
    public Vehicle(){

    }
    //constructor 3
    public Vehicle(String color, int num){
        this.color = color;
        this.numberOfWheels = num;
    }
    //getter
    public int getNumberOfWheels(){
        return numberOfWheels;
    }

    //setter
    public void setNumberOfWheels(int number){
        numberOfWheels = number;
    }

    //getter
    public String getColor(){
        return color;
    }

    //setter
    public void setColor(String color){
        this.color = color;
    }
}
