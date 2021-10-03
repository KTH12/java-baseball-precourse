package domain;

import console.Output;

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
            throw new IllegalArgumentException(Output.BALLS_SIZE_EXCEPTION_MESSAGE);
        }
    }

    private void validDuplicate(Ball ball) {
        if (numberToArray().contains(ball.getNumber())) {
            throw new IllegalArgumentException(Output.BAllS_DUPLICATE_MESSAGE);
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
