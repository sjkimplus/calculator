package calculator;
import java.math.BigDecimal;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // variable and object decalration
        Scanner scanner = new Scanner(System.in);
        String nb1;
        String nb2;
        String op;
        BigDecimal result = BigDecimal.ZERO;
        boolean play = true;
        String again;

        while(play) {
            // getting the numbers and operator
            System.out.print("첫 번째 숫자를 입력하세요: ");
            nb1 = scanner.nextLine();
            System.out.print("두 번째 숫자를 입력하세요: ");
            nb2 = scanner.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");
            op = scanner.nextLine();

            // performing the operation
            BigDecimal nb11 = new BigDecimal(nb1);
            BigDecimal nb22 = new BigDecimal(nb2);
            try {
                switch (op) {
                    case "+":
                        result = nb11.add(nb22);
                        break;
                    case "-":
                        result = nb11.subtract(nb22);
                        break;
                    case "*":
                        result = nb11.multiply(nb22);
                        break;
                    case "/":
                        if (nb22.equals(BigDecimal.ZERO)) {
                            throw new Exception("0 으로 나눌 수 없음.");
                        }
                        result = nb11.divide(nb22, 5, BigDecimal.ROUND_HALF_UP);
                        break;
                    default:
                        throw new Exception("에러: 잘못된 연산자입니다.");
                }

                String stringResult = String.valueOf(result);
                System.out.println("결과: " + stringResult);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, enter 누를시 지속)");
            again = scanner.nextLine();
            if (again.equals("exit"))
                play = false;
        }
    }
}
