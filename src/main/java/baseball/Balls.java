package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private final List<Ball> balls;

    public Balls(List<Integer> comNumbers) {
        this.balls = mapBall(comNumbers);
    }

    private List<Ball> mapBall(List<Integer> comNumbers) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            balls.add(new Ball(i + 1, comNumbers.get(i)));
        }
        return balls;
    }

    public BallStatus play(Ball userBall) {
        for (int i = 0; i < 3; i++) {
            if (balls.get(i).play(userBall).isStrike()) {
                return BallStatus.STRIKE;
            }
            if (balls.get(i).play(userBall).isBall()) {
                return BallStatus.BALL;
            }
        }
        return BallStatus.NOTHING;
    }


}
