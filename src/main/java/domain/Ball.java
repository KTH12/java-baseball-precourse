package domain;

import console.Output;

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
			throw new IllegalArgumentException(Output.NUMBER_RANGE_EXCEPTION_MESSAGE);
		}
	}
}
