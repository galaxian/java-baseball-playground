package baseball;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BallGeneratorTest {
    @Test
    void createBall() {
        BallGenerator ballGenerator = new BallGenerator();
        List<Integer> ballList = ballGenerator.createBall();

        assertThat(ballList.size()).isEqualTo(3);
        assertThat(new HashSet<>(ballList).size()).isEqualTo(3);
    }
}
