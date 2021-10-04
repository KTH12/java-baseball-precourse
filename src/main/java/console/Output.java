package console;

import common.response.CommonCode;

public class Output {
    public static void printContinueMessage() {
        System.out.println(CommonCode.REQUIRE_CONTINUE_MESSAGE.getMessage());
    }

    public static void printRequireNumberMessage() {
        System.out.println(CommonCode.REQUIRE_NUMBER_MESSAGE.getMessage());
    }

    public static void printGameComplete() {
        System.out.println(CommonCode.GAME_COMPLETE_MESSAGE.getMessage());
    }

    public static void printNothing() {
        System.out.println(CommonCode.NOTHING.getMessage());
    }

    public static void printExceptionMessage(String message) {
        System.out.println(message);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

}
