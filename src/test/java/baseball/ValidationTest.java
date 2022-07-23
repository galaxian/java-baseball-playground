package baseball;

import org.junit.jupiter.api.Test;

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
}
