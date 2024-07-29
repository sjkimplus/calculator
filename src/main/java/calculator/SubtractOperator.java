package calculator;

public class SubtractOperator implements OpInterface {
    public double operate(double a, double b) {
        double result = a - b;
        return result;
    }
}