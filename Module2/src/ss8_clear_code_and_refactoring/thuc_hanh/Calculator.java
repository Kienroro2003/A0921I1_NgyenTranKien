package ss8_clear_code_and_refactoring.thuc_hanh;

public class Calculator implements Operator{

    public static int  calculate(int firstOperand, int lastOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + lastOperand;
            case SUBTRACTION:
                return firstOperand - lastOperand;
            case MULTIPLICATION:
                return firstOperand * lastOperand;
            case DIVISION:
                if (lastOperand != 0)
                    return firstOperand / lastOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
