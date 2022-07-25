package baseball;

import java.util.Objects;

public class BallNumber {
    private final int number;
    public BallNumber(int number) {
        if (number > 9 || number < 1) {
            throw new IllegalArgumentException("1~9 까지의 숫자만 입력 가능합니다.");
        }
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallNumber that = (BallNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
