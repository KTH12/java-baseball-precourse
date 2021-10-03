package domain;

import infrastructure.BallsFactoryImpl;
import infrastructure.BaseBallResultServiceImpl;

import java.util.List;

public class BaseBallServiceImpl implements BaseBallService {
	GamerInfo gamerInfo = new GamerInfo();
	BallsFactory ballsFactory = new BallsFactoryImpl();
	BaseBallResultService baseBallResultService;

	@Override public void generateComputerInfo() {
		gamerInfo.setComputerBalls(ballsFactory.registerRandomBalls());
	}

	@Override public void generateUserInfo(String userInput) {
		gamerInfo.setUserBalls(ballsFactory.registerInputBalls(userInput));
	}

	@Override public BaseBallResult isSuccess() {
		List<Integer> computerBalls = gamerInfo.getComputerBalls().numberToArray();
		List<Integer> userBalls = gamerInfo.getUserBalls().numberToArray();
		baseBallResultService = new BaseBallResultServiceImpl(computerBalls, userBalls);
		return baseBallResultService.strikeAndBallChecker();
	}
}
