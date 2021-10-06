package application;

import common.exception.InvalidParamException;
import common.response.CommonCode;
import console.Input;
import console.Output;

public class GameController {

    public void run() {
        do {
            BaseBallGame baseBallGame = new BaseBallGame();
            baseBallGame.play();
        } while (isCorrectContinueQuestions());
    }

    private boolean isCorrectContinueQuestions() {
        Output.printContinueMessage();

        try {
            return resumeRequireToUser();
        } catch (InvalidParamException e) {
            Output.printExceptionMessage(e.getMessage());
            return isCorrectContinueQuestions();
        }
    }

    private boolean resumeRequireToUser() {
        String message = Input.userInput();

        if (CommonCode.GAME_STOP.getMessage().equals(message)) {
            return false;
        }
        if (CommonCode.GAME_RESTART.getMessage().equals(message)) {
            return true;
        }
        throw new InvalidParamException();
    }
}
