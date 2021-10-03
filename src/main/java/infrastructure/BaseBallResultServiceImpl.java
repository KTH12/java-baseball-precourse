package infrastructure;

import domain.BaseBallResult;
import domain.BaseBallResultService;

import java.util.List;

public class BaseBallResultServiceImpl implements BaseBallResultService {
	BaseBallResult baseBallResult;
	List<Integer> computerBalls;
	List<Integer> userBalls;

	public BaseBallResultServiceImpl(List<Integer> computerBalls, List<Integer> userBalls) {
		this.baseBallResult = new BaseBallResult();
		this.computerBalls = computerBalls;
		this.userBalls = userBalls;
	}

	@Override public BaseBallResult strikeAndBallChecker() {
		zoneValid(computerBalls, userBalls);
		return getBaseBallResult();
	}

	private void zoneValid(List<Integer> computerBalls, List<Integer> userBalls) {
		for (int i = 0; i < computerBalls.size(); i++) {
			zoneMatch(computerBalls.get(i), userBalls.get(i));
		}
	}

	private void zoneMatch(Integer computerBallNumber, Integer userBallNumber) {
		if (isStrike(computerBallNumber, userBallNumber)) {
			baseBallResult.incrementStrikeCount();
			return;
		}

		if (isBall(userBallNumber)) {
			baseBallResult.incrementBallCount();
		}
	}

	private boolean isBall(Integer userBallNumber) {
		return computerBalls.contains(userBallNumber);
	}

	private boolean isStrike(Integer computerBallNumber, Integer userBallNumber) {
		return computerBallNumber.equals(userBallNumber);
	}

	private BaseBallResult getBaseBallResult() {
		return baseBallResult;
	}

}
