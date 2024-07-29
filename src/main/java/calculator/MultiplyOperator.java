package calculator;

public class MultiplyOperator implements OpInterface {
    public double operate(double a, double b) {
        double result = a*b;
        return result;
    }
}