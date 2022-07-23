package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationTest {
    @Test
    void validRange() {
        Validation validation = new Validation();
        assertThat(validation.validRange(9)).isTrue();
        assertThat(validation.validRange(0)).isFalse();
        assertThat(validation.validRange(1)).isTrue();
        assertThat(validation.validRange(10)).isFalse();
    }

    @Test
    @DisplayName("3자리 숫자 중 중복 유무 테스트")
    void duplicate() {
        Validation validation = new Validation();
        assertThat(validation.duplicate(Arrays.asList(1, 1, 3))).isTrue();
        assertThat(validation.duplicate(Arrays.asList(1, 2, 3))).isFalse();
        assertThat(validation.duplicate(Arrays.asList(9, 9, 9))).isTrue();
    }

    @Test
    @DisplayName("3자리 숫자인지 테스트")
    void size() {
        Validation validation = new Validation();
        assertThat(validation.validSize(Arrays.asList(1, 2, 3))).isTrue();
        assertThat(validation.validSize(Arrays.asList(1, 2, 3, 4))).isFalse();
        assertThat(validation.validSize(Arrays.asList(1, 9))).isFalse();
    }
}
