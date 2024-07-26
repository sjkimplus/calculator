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
        boolean play = true;
        String again;
        String remove;
        String inquiry;
        Calculator myCalc = new Calculator();

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

            myCalc.calculate(nb11, nb22, op);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제, enter 누를시 다음)");
            remove = scanner.nextLine();
            if (remove.equals("remove"))
                myCalc.removeResult();

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회, enter 누를시 다음)");
            inquiry = scanner.nextLine();
            if (inquiry.equals("inquiry")) {
                myCalc.inquiryResults();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, enter 누를시 지속)");
            again = scanner.nextLine();
            if (again.equals("exit"))
                play = false;
        }
        scanner.close();
    }
}
