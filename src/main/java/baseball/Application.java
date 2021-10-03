package baseball;

import application.GameFacade;

public class Application {
	public static void main(String[] args) {
		GameFacade gameFacade = new GameFacade();
		gameFacade.run();
	}
}
