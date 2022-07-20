package baseball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BallGenerator {
    public BallGenerator() {
    }

    public List<Integer> generateBall() {
        Set<Integer> ballNumber = new HashSet<>();
        while (ballNumber.size() != 3) {
            ballNumber.add((int)((Math.random() * 9) + 1));
        }
        return new ArrayList<>(ballNumber);
    }
}
