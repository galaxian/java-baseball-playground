package baseball;

import java.util.HashSet;
import java.util.List;

public class Validation {
    public boolean validRange(int number) {
        return number < 10 && number > 0;
    }

    public boolean duplicate(List<Integer> asList) {
        return new HashSet<>(asList).size() != 3;
    }
}
