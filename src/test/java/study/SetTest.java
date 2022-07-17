package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("set size 메서드 테스트")
    void sizeSetTest() {
        System.out.println(numbers.size());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    @DisplayName("set contains 메서드 테스트 및 중복코드 제거")
    void containsTest(int number) {
        assertTrue(numbers.contains(number));
    }

    @DisplayName("contains 메서드 true, false 구분 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"} ,delimiter = ':')
    void containsTest2(String input, String output) {
        boolean resultContains = numbers.contains(Integer.parseInt(input));
        assertEquals(Boolean.parseBoolean(output), resultContains);
    }
}
