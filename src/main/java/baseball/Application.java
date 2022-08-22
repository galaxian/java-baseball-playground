package baseball;

public class Application {
    public static void main(String[] args) {
        BaseballPlay baseballPlay = new BaseballPlay();
        do {
            baseballPlay.play();
        } while (baseballPlay.isRetry());

        View.gameEndView();
    }
}
