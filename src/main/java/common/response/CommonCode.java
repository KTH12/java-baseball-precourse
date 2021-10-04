package common.response;

public enum CommonCode {
    STRIKE("스트라이크 "),
    BALL("볼"),
    NOTHING("낫싱"),
    REQUIRE_NUMBER_MESSAGE("숫자를 입력해주세요 : "),
    REQUIRE_CONTINUE_MESSAGE("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    GAME_COMPLETE_MESSAGE("3개의 숫자를 모두 맞히셨습니다! 게임 끝"),
    GAME_RESTART("1"),
    GAME_STOP("2");

    private final String message;

    CommonCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
