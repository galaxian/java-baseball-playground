package baseball;

public class BaseballPlay {
    private final BallGenerator generator;

    public BaseballPlay() {
        generator = new BallGenerator();
    }

    public void play() {
        Balls computer = new Balls(generator.createBall());

        JudgeResult judge;
        do{
            View.inputView();
            judge = computer.play(Input.inputUserBall());
            View.resultView(judge);
        } while(!judge.isGameEnd());

    }

    public boolean isRetry() {
        View.checkRetryView();
        if (Input.inputSelectRetry().equals("1")) {
            View.replayView();
            return true;
        }
        return false;
    }

}
