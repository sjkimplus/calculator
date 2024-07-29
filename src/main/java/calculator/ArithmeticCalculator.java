package calculator;

public class ArithmeticCalculator extends Calculator {
    private AddOperator addOperator = new AddOperator();
    private SubtractOperator subtractOperator = new SubtractOperator();
    private MultiplyOperator multiplyOperator = new MultiplyOperator();
    private DivideOperator divideOperator = new DivideOperator();

    public double calculate(double nb1, double nb2, String op) {
        double result = 0;
        try
        {
            switch (op) {
                case "+":
                    result = addOperator.operate(nb1, nb2);
                    break;
                case "-":
                    result = subtractOperator.operate(nb1, nb2);
                    break;
                case "*":
                    result = multiplyOperator.operate(nb1, nb2);
                    break;
                case "/":
                    if (nb2==0) {
                        throw new Exception("0 으로 나눌 수 없음.");
                    }
                    result = divideOperator.operate(nb1, nb2);
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
