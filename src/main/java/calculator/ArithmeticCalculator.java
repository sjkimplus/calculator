package calculator;

public class ArithmeticCalculator extends Calculator {

    public double calculate(double nb1, double nb2, String op) {
        double result = 0;
        try
        {
            switch (op) {
                case "+":
                    result = nb1 + nb2;
                    break;
                case "-":
                    result = nb1 - nb2;
                    break;
                case "*":
                    result = nb1 * nb2;
                    break;
                case "/":
                    if (nb2==0) {
                        throw new Exception("0 으로 나눌 수 없음.");
                    }
                    result = nb1/nb2;
                    break;
                default:
                    throw new Exception("에러: 잘못된 연산자입니다.");
            }
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
            return result;
        }
        return result;
    }
}
