package calculator;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Queue;
import java.util.LinkedList;

public class Calculator {
    Queue<String> arch = new LinkedList<>();

    public BigDecimal calculate(BigDecimal nb1, BigDecimal nb2, String op) {
        BigDecimal result=BigDecimal.ZERO;
        try
        {
            switch (op) {
                case "+":
                    result = nb1.add(nb2);
                    break;
                case "-":
                    result = nb1.subtract(nb2);
                    break;
                case "*":
                    result = nb1.multiply(nb2);
                    break;
                case "/":
                    if (nb2.equals(BigDecimal.ZERO)) {
                        throw new Exception("0 으로 나눌 수 없음.");
                    }
                    result = nb1.divide(nb2, 5, RoundingMode.HALF_UP);
                    break;
                default:
                    throw new Exception("에러: 잘못된 연산자입니다.");
            }
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("계산결과: "+ String.valueOf(result));
        return result;
    }

}
