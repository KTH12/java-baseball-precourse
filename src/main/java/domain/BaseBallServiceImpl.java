package domain;

import infrastructure.BallsFactoryImpl;

public class BaseBallServiceImpl implements BaseBallService {
	GamerInfo gamerInfo = new GamerInfo();
	BallsFactory ballsFactory = new BallsFactoryImpl();

	@Override public void generateComputerInfo() {
		gamerInfo.setComputerBalls(ballsFactory.registerRandomBalls());
	}

	@Override public void generateUserInfo(String userInput) {
		gamerInfo.setUserBalls(ballsFactory.registerInputBalls(userInput));
	}

	@Override public BaseBallResult isSuccess() {
		// Todo 스트라이크, 볼 체크 함수 추가
		return null;
	}
}
