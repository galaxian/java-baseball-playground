package baseball;

public class JudgeResult {
    private int strike = 0;
    private int ball = 0;

    public int getStrike() {
        return this.strike;
    }

    public int getBall() {
        return this.ball;
    }

    public void report(BallStatus status) {
        if (status.isStrike()) {
            strike++;
        }
        if (status.isBall()) {
            ball++;
        }
    }

    public String ballsReport() {
        if (strike == 0 && ball == 0) {
            return "낫싱";
        }
        if (strike == 0) {
            return ball + " 볼";
        }
        if (ball == 0) {
            return strike + " 스트라이크";
        }
        return ball + " 볼," + strike +" 스트라이크";
    }

    public boolean isGameEnd() {
        return strike == 3;
    }
}
