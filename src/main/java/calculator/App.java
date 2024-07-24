package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nb1;
        String nb2;

        System.out.println("첫 번째 숫자를 입력하세요: ");
        nb1 = scanner.nextLine();
        System.out.println("두 번째 숫자를 입력하세요: ");
        nb2 = scanner.nextLine();

        System.out.println("nb1: "+nb1+" nb2: "+nb2);
    }
}
