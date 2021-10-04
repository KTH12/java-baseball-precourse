package application;

import common.exception.InvalidParamException;
import common.response.CommonCode;
import console.Input;
import console.Output;
import domain.BaseBallResult;
import domain.BaseBallService;
import domain.BaseBallServiceImpl;

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
            String userInput = Input.userInput();
            Output.printMessage(userInput);
            baseBallService.generateUserInfo(userInput);
        } catch (InvalidParamException e) {
            Output.printExceptionMessage(e.getMessage());
            gameProcess();
        }
    }

    private void printBallMatchResult(int strikeCount, int ballCount) {
        if (strikeCount == COMPLETE_STRIKE_COUNT) {
            Output.printMessage(strikeCount + CommonCode.STRIKE.getMessage());
            Output.printGameComplete();
            return;
        }

        if (strikeCount == 0 && ballCount == 0) {
            Output.printNothing();
            return;
        }

        Output.printMessage(strikeCount + CommonCode.STRIKE.getMessage() + ballCount + CommonCode.BALL.getMessage());
    }
}
