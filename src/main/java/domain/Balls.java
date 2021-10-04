package domain;

import common.exception.InvalidParamException;
import common.response.ErrorCode;

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
            throw new InvalidParamException(ErrorCode.COMMON_BALLS_SIZE_EXCEPTION);
        }
    }

    private void validDuplicate(Ball ball) {
        if (numberToArray().contains(ball.getNumber())) {
            throw new InvalidParamException(ErrorCode.COMMON_BAllS_DUPLICATE_EXCEPTION);
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
