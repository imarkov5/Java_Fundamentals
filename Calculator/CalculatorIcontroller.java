public class CalculatorIcontroller {
    public static void main(String[] args) {
        CalculatorI addNums = new CalculatorI(10.24, 20.51, "+");
        addNums.performOperation(addNums.getOperandOne(), addNums.getOperandTwo(), addNums.getOperation());
        
        System.out.println(addNums.getResults());

    }
}
