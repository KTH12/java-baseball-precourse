package domain;

public interface BallsFactory {

    Balls registerRandomBalls();

    Balls registerInputBalls(String input);
}
