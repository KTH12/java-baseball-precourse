package infrastructure;

import domain.Ball;
import domain.Balls;
import domain.BallsFactory;
import nextstep.utils.Randoms;

public class BallsFactoryImpl implements BallsFactory {
    final int BALLS_MAX_SIZE = 3;
    final int RANDOM_NUMBER_MIN = 1;
    final int RANDOM_NUMBER_MAX = 9;

    @Override public Balls registerRandomBalls() {
        return createRandomBalls();
    }

    @Override public Balls registerInputBalls(String input) {
        Balls balls = new Balls();
        for (int i = 0; i < input.length(); i++) {
            balls.add(new Ball(input.charAt(i) - '0'));
        }
        return balls;
    }

    private Balls createRandomBalls() {
        Balls balls = new Balls();

        for (int i = 0; i < BALLS_MAX_SIZE; i++) {
            balls.add(new Ball(Randoms.pickNumberInRange(RANDOM_NUMBER_MIN, RANDOM_NUMBER_MAX)));
        }
        return balls;
    }
}
