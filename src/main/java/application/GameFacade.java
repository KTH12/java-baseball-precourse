package application;

import console.Output;
import nextstep.utils.Console;

public class GameFacade {

    public void run() {
        do {
            BaseBallGame baseBallGame = new BaseBallGame();
            baseBallGame.play();
        } while (isCorrectContinueQuestions());
    }

    private boolean isCorrectContinueQuestions() {
        String CONiNUE_MESSAGE = "1";
        Output.printContinueMessage();
        return Console.readLine().equals(CONiNUE_MESSAGE);
    }

}
