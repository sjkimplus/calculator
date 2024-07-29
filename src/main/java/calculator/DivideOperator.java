package calculator;

public class DivideOperator implements OpInterface {
    public double operate(double a, double b) {
        double result = a / b;
        return result;
    }
}
