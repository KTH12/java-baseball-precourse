package domain;

public class BaseBallResult {
    private int strikeCount = 0;
    private int ballCount = 0;

    public void incrementStrikeCount() {
        this.strikeCount++;
    }

    public void incrementBallCount() {
        this.ballCount++;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

}
