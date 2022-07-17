package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] test1 = "1,2".split(",");
        assertThat(test1).contains("1","2");
        String[] test2 = "1".split(",");
        assertThat(test2).containsExactly("1");
    }

    @Test
    void substring() {
        String test = "(1,2)".substring(1,4);
        assertThat(test).isEqualTo("1,2");
    }

    @Test
    @DisplayName("Exception 발생 테스트")
    void chatAt() {
        assertThatThrownBy(() -> {
            String actual = "abc";
            System.out.println(actual.charAt(100));

        }).isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}
