package baseball;

import java.util.List;
import java.util.Scanner;

public class ProcessBaseball {
    public void process() {
        List<Integer> correctBall = createBall();

        InputView inputView = new InputView();
        inputView.input();

        String ballNumber = input();

    }

    public List<Integer> createBall() {
        BallGenerator ballGenerator = new BallGenerator();
        return ballGenerator.generateBall();
    }

    public String input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public int checkStrike(String ballNumber, List<Integer> correctBall) {
        int strikeCnt = 0;
        for (int i = 0; i < 3;i++) {
            strikeCnt += cntStrike(ballNumber.charAt(i), correctBall.get(i));
        }
        return strikeCnt;
    }

    public int cntStrike(char ballNumber, int correctBallNumber) {
        if (Integer.parseInt(String.valueOf(ballNumber)) == correctBallNumber) {
            return 1;
        }
        return 0;
    }

    public int checkBall(String ballNumber, List<Integer> correctBall) {
        int ballCnt = 0;
        for (int i = 0; i < 3;i++) {
            if (Integer.parseInt(String.valueOf(ballNumber.charAt(i))) != correctBall.get(i)) {
                ballCnt += cntBall(ballNumber.charAt(i), correctBall);
            }
        }
        return ballCnt;
    }

    private int cntBall(char ballNumber, List<Integer> correctBall) {
        if (correctBall.contains(Integer.parseInt(String.valueOf(ballNumber)))) {
            return 1;
        }
        return 0;
    }

}
