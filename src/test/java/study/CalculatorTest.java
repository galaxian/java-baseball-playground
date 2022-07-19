package study;

import calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("문자열 분리 테스트")
    void StringToArrayTest() {
        String expression = "1 + 3 - 0 * 2";
        assertThat(calculator.stringToArray(expression))
                .containsExactly("1","+","3","-","0","*","2");
    }

    @Test
    @DisplayName("덧셈 테스트")
    void addTest() {
        String expression = "1 + 2";
        String[] values = expression.split(" ");
        assertThat(calculator.inputArraySeparateCalculate(values)).isEqualTo(3);
    }

    @Test
    @DisplayName("뺄셈 테스트")
    void subtractTest() {
        String expression = "3 - 6";
        String[] values = expression.split(" ");
        assertThat(calculator.inputArraySeparateCalculate(values)).isEqualTo(-3);
    }

    @Test
    @DisplayName("0으로 나누기 실패 테스트")
    void divideByZero() {
        assertThatThrownBy(() -> {
            String expression = "1 / 0";
            String[] values = expression.split(" ");
            calculator.inputArraySeparateCalculate(values);
        }
        ).isInstanceOf(ArithmeticException.class);
    }

    @Test
    @DisplayName("+,-,/,*가 아닌 문자 입력")
    void illegalOperatorTest() {
        assertThatThrownBy(() -> {
                    String expression = "1 & 0";
                    String[] values = expression.split(" ");
                    calculator.inputArraySeparateCalculate(values);
                }
        ).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("복합 연산 테스트")
    void complexOperationTest() {
        String expression = "2 - 6 * 3 / 4 + 7";
        String[] values = expression.split(" ");
        assertThat(calculator.inputArraySeparateCalculate(values)).isEqualTo(4);
    }
}