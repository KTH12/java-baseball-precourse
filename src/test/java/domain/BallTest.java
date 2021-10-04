package domain;

import baseball.Application;
import common.exception.InvalidParamException;
import nextstep.test.NSTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertAll;

class BallTest extends NSTest {

    @BeforeEach
    void beforeEach() {
        super.setUp();
    }

    @Test
    void 볼_생성() {
        Ball ball = new Ball(1);
        assertAll(
            () -> assertThat(ball.getNumber()).isEqualTo(1));
    }

    @Test
    void 볼_생성_실패() {
        assertThatExceptionOfType(InvalidParamException.class).isThrownBy(() -> new Ball(20));
    }

    @AfterEach
    void tearDown() {
        outputStandard();
    }

    @Override
    public void runMain() {
        Application.main(new String[] {});
    }
}