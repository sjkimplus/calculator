package calculator;

public class CircleCalculator extends Calculator {
    final double pi = 3.14159265358979323846264338;

    public double calculate(double r) {
        double circleArea = pi*r*r;
        return circleArea;
    }
}
