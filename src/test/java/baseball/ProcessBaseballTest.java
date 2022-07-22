package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ProcessBaseballTest {
    ProcessBaseball processBaseball;

    @BeforeEach
    void setup() {
        processBaseball = new ProcessBaseball();
    }

    @Test
    void countStrikeTest() {
        String input = "123";
        List<Integer> ball = new ArrayList<>();
        ball.add(1);
        ball.add(3);
        ball.add(9);

        assertThat(processBaseball.cntStrike(input.charAt(0), ball.get(0))).isEqualTo(1);
    }

    @Test
    void countBallTest(){
        String input = "123";
        List<Integer> ball = new ArrayList<>();
        ball.add(1);
        ball.add(3);
        ball.add(9);

        assertThat(processBaseball.cntBall(input.charAt(0), ball)).isEqualTo(1);
    }

    @Test
    void checkStrikeTest() {
        String input = "123";
        List<Integer> ball = new ArrayList<>();
        ball.add(1);
        ball.add(3);
        ball.add(9);

        assertThat(processBaseball.checkStrike(input, ball)).isEqualTo(1);
    }

    @Test
    void checkBallTest() {
        String input = "193";
        List<Integer> ball = new ArrayList<>();
        ball.add(1);
        ball.add(3);
        ball.add(9);

        assertThat(processBaseball.checkBall(input, ball)).isEqualTo(2);
    }

    @Test
    void resultTest() {
        String input = "193";
        List<Integer> ball = new ArrayList<>();
        ball.add(1);
        ball.add(3);
        ball.add(9);

        assertThat(processBaseball.result(input, ball)).isEqualTo("2볼 1스트라이크");
    }

    @Test
    void answerTest() {
        String input = "123";
        List<Integer> ball = new ArrayList<>();
        ball.add(1);
        ball.add(2);
        ball.add(3);

        assertThat(processBaseball.resultView(input, ball)).isFalse();
    }
}
