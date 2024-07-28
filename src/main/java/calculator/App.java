package calculator;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // variable and object decalration
        Scanner scanner = new Scanner(System.in);
        String nb1;
        String nb2;
        String op;
        int play = 0;
        String again;
        String remove;
        String inquiry;
        Calculator myCalc = new Calculator();

        System.out.print("사칙연산을 원하면 '1' \n원의 너비를 원하면 '2'를 입력해 주세요: ");
        play = Integer.parseInt(scanner.nextLine());
        while(play > 0) {
            if (play == 1)
            {
                double calcResult;
                // getting the numbers and operator
                System.out.print("첫 번째 숫자를 입력하세요: ");
                nb1 = scanner.nextLine();
                System.out.print("두 번째 숫자를 입력하세요: ");
                nb2 = scanner.nextLine();

                System.out.print("사칙연산 기호를 입력하세요: ");
                op = scanner.nextLine();

                // performing the operation
                double nb11 = Double.parseDouble(nb1);
                double nb22 = Double.parseDouble(nb2);

                calcResult = myCalc.calculate(nb11, nb22, op);

                // print result
                System.out.println("계산결과: "+ String.valueOf(calcResult));
                // save result
                myCalc.setResult(calcResult);
                // inquire
                myCalc.inquiryResults();
            }
            else if (play==2)
            {
                double radius;
                double circleResults;
                System.out.print("반지름의 크기를 입력하시오: ");
                radius = Double.parseDouble(scanner.nextLine());
                circleResults = myCalc.calculateCircleArea(radius);

                // print results
                System.out.println("계산결과: "+ String.valueOf(circleResults));
                // save results
                myCalc.setCircleArea(circleResults);
                // inquire
                myCalc.inquiryCircleResults();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, enter 누를시 지속)");
            again = scanner.nextLine();
            if (again.equals("exit"))
                play = -1;
        }
        scanner.close();
    }
}
