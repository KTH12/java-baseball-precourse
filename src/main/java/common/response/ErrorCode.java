package common.response;

public enum ErrorCode {
    COMMON_INVALID_PARAMETER("요청한 값이 올바르지 않습니다."),
    COMMON_NUMBER_RANGE_EXCEPTION("1부터 9까지 숫자만 입력 할 수 있습니다."),
    COMMON_BALLS_SIZE_EXCEPTION("최대 3개까지 공을 가질 수 있습니다."),
    COMMON_BAllS_DUPLICATE_EXCEPTION("서로 다른 숫자를 입력 하셔야합니다.");

    private final String errorMsg;

    ErrorCode(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return "[ERROR]" + errorMsg;
    }
}
