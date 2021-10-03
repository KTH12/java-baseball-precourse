package domain;

public class BaseBallServiceImpl implements BaseBallService {
	GamerInfo gamerInfo = new GamerInfo();

	@Override public void generateComputerInfo() {
		// Todo 랜덤 숫자 Balls 생성 함수 추가
		gamerInfo.setComputerBalls(new Balls());
	}

	@Override public void generateUserInfo(String userInput) {
		// Todo 유저 입력 받은 값으로 Balls 생성 함수 추가
		gamerInfo.setUserBalls(new Balls());
	}

	@Override public BaseBallResult isSuccess() {
		// Todo 스트라이크, 볼 체크 함수 추가
		return null;
	}
}
