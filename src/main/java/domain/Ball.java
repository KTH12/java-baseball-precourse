package domain;

public class Ball {
	private static final int MIN = 1;
	private static final int MAX = 9;

	private final int number;

	public Ball(int number) {
		validBallNumber(number);
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	private void validBallNumber(int number) {
		if (number < MIN || number > MAX) {
			throw new IllegalArgumentException("1부터 9까지 숫자만 입력 할 수 있습니다.");
		}
	}
}
