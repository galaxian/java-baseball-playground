package baseball;

import java.util.Scanner;

public class InputView {
    public void input() {
        System.out.println("세 자리 숫자를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        String ballNumber = sc.nextLine();
    }
}
