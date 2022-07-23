package baseball;

import java.util.Objects;

public class Ball {
    private final int index;
    private final int number;

    public Ball(int index, int number) {
        this.index = index;
        this.number = number;
    }

    public BallStatus play(Ball userBall) {
        if (this.equals(userBall)) {
            return BallStatus.STRIKE;
        }
        if (this.matchNumber(userBall.number)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean matchNumber(int number) {
        return this.number == number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return index == ball.index && number == ball.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, number);
    }
}
