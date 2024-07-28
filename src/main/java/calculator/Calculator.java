package calculator;
import java.util.Queue;
import java.util.LinkedList;

public class Calculator {

    private Queue<String> arch;
    private Queue<String> archCircle;
    // 파이의 값은 절때 바뀌지 않는 상수라 final을 사용 했습니다.
    final double pi = 3.14159265358979323846264338;

    Calculator () {
        arch = new LinkedList<>();
        archCircle = new LinkedList<>();
    }

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

        // print results
        System.out.println("계산결과: "+ String.valueOf(result));
        return result;
    }

    // Getter Method
    public Queue<String> getResult() {
        return arch;
    }

    // Setter Method: adds new method into the
    public void setResult(double result) {
        arch.add(String.valueOf(result));
    }

    public void removeResult() {
        arch.poll();
    }

    public void inquiryResults() {
        for (String result : arch)
            System.out.println(result);
    }

    /* 원의 넓이를 구하는 메서드 선언*/
    public double calculateCircleArea(double r) {
        double circleArea = pi*r*r;
        return circleArea;
    }

    // 원넓이 getter method
    public String getCircleArea() {
        return archCircle.peek();
    }

    // 원넓이 setter method
    public void setCircleArea(double circleArea) {
        archCircle.add(String.valueOf(circleArea));
    }

    public void inquiryCircleResults() {
        for (String result : archCircle)
            System.out.println(result);
    }


}
