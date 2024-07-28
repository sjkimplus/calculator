package calculator;
import java.util.Queue;
import java.util.LinkedList;

public class Calculator {

    private Queue<String> arch;

    Calculator () {
        arch = new LinkedList<>();
    }

    // Getter Method
    public Queue<String> getResult() {
        return arch;
    }

    // Setter Method: adds new method into the
    public void setResult(double result) {
        arch.add(String.valueOf(result));
    }

    // 결과값 삭제
    public void removeResult() {
        arch.poll();
    }

    // 결과값 프린트
    public void inquiryResults() {
        for (String result : arch)
            System.out.println(result);
    }
}

