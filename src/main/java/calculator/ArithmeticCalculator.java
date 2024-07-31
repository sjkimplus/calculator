package calculator;

public class ArithmeticCalculator extends Calculator {
    private AddOperator addOperator = new AddOperator();
    private SubtractOperator subtractOperator = new SubtractOperator();
    private MultiplyOperator multiplyOperator = new MultiplyOperator();
    private DivideOperator divideOperator = new DivideOperator();
    private ModOperator modOperator = new ModOperator();

    public double calculate(double nb1, double nb2, String op) {
        double result = 0;
        try
        {
            switch (op) {
                case "+":
                    this.setOperation(addOperator);
                    break;
                case "-":
                    this.setOperation(subtractOperator);
                    break;
                case "*":
                    this.setOperation(multiplyOperator);
                    break;
                case "%":
                    this.setOperation(modOperator);
                    break;
                case "/":
                    if (nb2==0) {
                        throw new Exception("0 으로 나눌 수 없음.");
                    }
                    this.setOperation(divideOperator);
                    break;
                default:
                    throw new Exception("에러: 잘못된 연산자입니다.");
            }
            result = operation.operate(nb1, nb2);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
            return result;
        }
        return result;
    }
}
