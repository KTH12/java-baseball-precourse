package domain;

import java.util.ArrayList;
import java.util.List;

public class Balls {
	private final List<Ball> balls = new ArrayList<>();

	public void add(Ball ball) {
		validDuplicate(ball);
		balls.add(ball);
		validSize();
	}

	private void validSize() {
		int MAX_SIZE = 3;
		if (balls.size() > MAX_SIZE) {
			throw new IllegalArgumentException("최대 3개까지 공을 가질 수 있습니다.");
		}
	}

	private void validDuplicate(Ball ball) {
		if (numberToArray().contains(ball.getNumber())) {
			throw new IllegalArgumentException("서로 다른 숫자를 입력 하셔야합니다.");
		}
	}

	public List<Integer> numberToArray() {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < balls.size(); i++) {
			numbers.add(balls.get(i).getNumber());
		}

		return numbers;
	}

	public List<Ball> getBalls() {
		return balls;
	}
}
