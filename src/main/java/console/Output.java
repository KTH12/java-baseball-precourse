package console;

public class Output {
    public static final String STRIKE_MESSAGE = "스트라이크 ";
    public static final String BALL_MESSAGE = "볼";
    public static final String NUMBER_RANGE_EXCEPTION_MESSAGE = "1부터 9까지 숫자만 입력 할 수 있습니다.";
    public static final String BALLS_SIZE_EXCEPTION_MESSAGE = "최대 3개까지 공을 가질 수 있습니다.";
    public static final String BAllS_DUPLICATE_MESSAGE = "서로 다른 숫자를 입력 하셔야합니다.";
    private static final String CONTINUE_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final String REQUIRE_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String GAME_COMPLETE_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 끝";
    private static final String GAME_NOTHING_MESSAGE = "낫싱";

    public static void printContinueMessage() {
        System.out.println(CONTINUE_MESSAGE);
    }

    public static void printRequireNumberMessage() {
        System.out.println(REQUIRE_NUMBER_MESSAGE);
    }

    public static void printExceptionMessage(String message) {
        System.out.println("[ERROR]" + message);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printGameComplete() {
        System.out.println(GAME_COMPLETE_MESSAGE);
    }

    public static void printNothing() {
        System.out.println(GAME_NOTHING_MESSAGE);
    }
}
