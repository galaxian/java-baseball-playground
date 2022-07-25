package baseball;

import java.util.ArrayList;
import java.util.List;

public class BallGenerator {
    private final List<Integer> balls = new ArrayList<>();

    public List<Integer> createBall() {
        return addBallList();
    }

    private List<Integer> addBallList() {
        while (balls.size() < 3) {
            int randomNumber = (int)(Math.random() * 10) + 1;
            checkDuplicate(randomNumber);
        }
        return balls;
    }

    private void checkDuplicate(int randomNumber) {
        if (!balls.contains(randomNumber)) {
            balls.add(randomNumber);
        }
    }
}
