package baseball;

public class View {

    public static void resultView(JudgeResult result) {
        System.out.println(result.ballsReport());
    }

    public static void checkRetryView() {
        System.out.println("정답을 맞췄습니다. 다시 하시려면 1, 중단하시려면 2를 입력하세요");
    }

    public static void replayView() {
        System.out.println("다시 시작합니다.");
    }

    public static void gameEndView() {
        System.out.println("플레이해주셔서 감사합니다.");
    }

    public static void inputView() {
        System.out.println("1~9까지 서로 다른 3가지 번호를 입력하세요");
    }
}
