package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

    public static List<Integer> inputUserBall() {
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.nextLine();
        String[] inputArray = input.split("");
        List<Integer> userBalls = new ArrayList<>();
        for (String number:inputArray) {
            userBalls.add(Integer.valueOf(number));
        }
        return userBalls;
    }
}
