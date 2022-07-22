package baseball;

public class Main {
    public static void main(String[] args) {
        ProcessBaseball processBaseball = new ProcessBaseball();
        boolean baseball = true;
        while (baseball) {
            baseball = processBaseball.process();
        }
    }
}
