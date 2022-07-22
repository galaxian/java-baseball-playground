package baseball;

import java.util.List;
import java.util.Scanner;

public class ProcessBaseball {
    public boolean process() {
        List<Integer> correctBall = createBall();
        boolean play = true;

        while (play) {
            InputView inputView = new InputView();
            inputView.input();

            String ballNumber = input();

            play =  resultView(ballNumber, correctBall);
        }
        return selectRestart();
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

    public String result(String ballNumber, List<Integer> correctBall) {
        int strikeCnt = checkStrike(ballNumber, correctBall);
        int ballCnt = checkBall(ballNumber, correctBall);

        if (strikeCnt != 0 && ballCnt != 0) {
            return ballCnt + "볼 " + strikeCnt + "스트라이크";
        }
        if (ballCnt != 0) {
            return ballCnt + "볼";
        }
        if (strikeCnt != 0) {
            return strikeCnt + "스트라이크";
        }
        return "낫싱";

    }

    public boolean resultView(String ballNumber, List<Integer> correctBall) {
        System.out.println(result(ballNumber, correctBall));
        if (result(ballNumber, correctBall).equals("3스트라이크")) {
            return false;
        }
        return true;
    }

    public boolean selectRestart() {
        System.out.println("정답을 맞추셨습니다. 다시 진행하려면 1번, 중단하시려면 2번을 입력하세요");
        Scanner sc = new Scanner(System.in);
        if (sc.nextLine().equals("1")) {
            return true;
        }
        if (sc.nextLine().equals("2")) {
            return false;
        }
        return false;
    }
}
