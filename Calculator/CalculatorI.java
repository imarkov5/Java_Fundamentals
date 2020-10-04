public class CalculatorI {
    private double operandOne;
    private double operandTwo;
    private String operation;
    private double result;

    public CalculatorI(){

    }
    public CalculatorI(double operandOne, double operandTwo, String operation){
        this.operandOne = operandOne;
        this.operandTwo = operandTwo;
        this.operation = operation;
    }


    public double getOperandOne(){
        return this.operandOne;
    }
    public void setOperandOne(double operandOne){
        this.operandOne = operandOne;
    }
    public double getOperandTwo(){
        return this.operandTwo;
    }
    public void setOperandTwo(double operandTwo){
        this.operandTwo = operandTwo;
    }
    public String getOperation(){
        return this.operation;
    }
    public void setOperation(){
        this.operation = operation;
    }
    
    public void performOperation(double operandOne, double operandTwo, String operation){
        double r;
        if( operation.equals("+")){
            r = operandOne + operandTwo;
        }else if (operation.equals("-")){
            r = operandOne - operandTwo;
        }else{
            System.out.println("Operation can be + or - only");
            return;
        }
        System.out.printf("%.2f %s %.2f = %.2f %n", operandOne, operation, operandTwo, r);
        this.result = r;

    }
    public double getResults(){
        return this.result;

    }

}
