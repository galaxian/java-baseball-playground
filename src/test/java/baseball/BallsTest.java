package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {
    Balls computer;

    @BeforeEach
    void setUp() {
        computer = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    void nothing() {
        BallStatus status = computer.play(new Ball(1, 4));
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void ball() {
        BallStatus status = computer.play(new Ball(1, 2));
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    void strike() {
        BallStatus status = computer.play(new Ball(1, 1));
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }
}
