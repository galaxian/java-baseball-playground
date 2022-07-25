package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class BallNumberTest {
    @Test
    void number() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new BallNumber(10))
                .withMessage("1~9 까지의 숫자만 입력 가능합니다.");

        assertThatIllegalArgumentException()
                .isThrownBy(() -> new BallNumber(0))
                .withMessage("1~9 까지의 숫자만 입력 가능합니다.");

        assertThatCode(() -> new BallNumber(5))
                .doesNotThrowAnyException();
    }
}
