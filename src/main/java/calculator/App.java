package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nb1;
        String nb2;
        String op;

        System.out.print("첫 번째 숫자를 입력하세요: ");
        nb1 = scanner.nextLine();
        System.out.print("두 번째 숫자를 입력하세요: ");
        nb2 = scanner.nextLine();

        System.out.print("사칙연산 기호를 입력하세요: ");
        op = scanner.nextLine();

        System.out.println("nb1: "+nb1+" nb2: "+nb2+" operator: "+op);
    }
}
