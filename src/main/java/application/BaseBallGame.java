package application;

import console.Output;
import domain.BaseBallResult;
import domain.BaseBallService;
import domain.BaseBallServiceImpl;
import nextstep.utils.Console;

public class BaseBallGame {
    private final BaseBallService baseBallService = new BaseBallServiceImpl();
    private final Integer COMPLETE_STRIKE_COUNT = 3;

    public void play() {
        baseBallService.generateComputerInfo();

        do {
            gameProcess();
        } while (!isSuccess());
    }

    private boolean isSuccess() {
        BaseBallResult baseBallResult = baseBallService.isSuccess();
        printBallMatchResult(baseBallResult.getStrikeCount(), baseBallResult.getBallCount());

        return baseBallResult.getStrikeCount() == COMPLETE_STRIKE_COUNT;
    }

    private void gameProcess() {
        try {
            Output.printRequireNumberMessage();
            String userInput = Console.readLine();
            baseBallService.generateUserInfo(userInput);
        } catch (IllegalArgumentException e) {
            Output.printExceptionMessage(e.getMessage());
            gameProcess();
        }
    }

    private void printBallMatchResult(int strikeCount, int ballCount) {
        if (strikeCount == COMPLETE_STRIKE_COUNT) {
            Output.printMessage(strikeCount + Output.STRIKE_MESSAGE);
            Output.printGameComplete();
            return;
        }

        if (strikeCount == 0 && ballCount == 0) {
            Output.printNothing();
            return;
        }

        Output.printMessage(strikeCount + Output.STRIKE_MESSAGE + ballCount + Output.BALL_MESSAGE);
    }
}
