package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BallGeneratorTest {
    BallGenerator ballGenerator = new BallGenerator();

    @Test
    @DisplayName("생성된 볼에 중복유무 테스트")
    void duplicateTest() {
        List<Integer> ball = ballGenerator.generateBall();

        assertThat((int) ball.stream().distinct().count()).isEqualTo(3);
    }

    @Test
    @DisplayName("생성된 볼의 숫자가 0~9 인지 테스트")
    void correctTest() {
        List<Integer> ball = ballGenerator.generateBall();

        for (int number:ball) {
            assertThat(number).isGreaterThanOrEqualTo(0).isLessThanOrEqualTo(9);
        }
    }

    @Test
    @DisplayName("생성된 볼의 길이 테스트")
    void sizeTest() {
        List<Integer> ball = ballGenerator.generateBall();

        assertThat(ball.size()).isEqualTo(3);
    }
}
