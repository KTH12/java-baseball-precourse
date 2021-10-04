package domain;

import baseball.Application;
import common.exception.InvalidParamException;
import common.response.ErrorCode;
import nextstep.test.NSTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class BallsTest extends NSTest {

    @BeforeEach
    void beforeEach() {
        super.setUp();
    }

    @ParameterizedTest
    @CsvSource(value = {"1, 2, 3"})
    void Balls_생성(int number1, int number2, int number3) {
        Balls balls = new Balls();
        balls.add(new Ball(number1));
        balls.add(new Ball(number2));
        balls.add(new Ball(number3));

        assertThat(balls.numberToArray()).contains(number1);
        assertThat(balls.numberToArray()).contains(number2);
        assertThat(balls.numberToArray()).contains(number3);
    }

    @ParameterizedTest
    @CsvSource(value = {"1, 2, 1"})
    void Balls_중복_실패(int number1, int number2, int number3) {
        Balls balls = new Balls();

        assertThatExceptionOfType(InvalidParamException.class).isThrownBy(() -> {
            balls.add(new Ball(number1));
            balls.add(new Ball(number2));
            balls.add(new Ball(number3));
        }).withMessage(ErrorCode.COMMON_BAllS_DUPLICATE_EXCEPTION.getErrorMsg());
    }

    @ParameterizedTest
    @CsvSource(value = {"1, 2, 3, 4"})
    void Balls_사이즈_오버_실패(int number1, int number2, int number3, int number4) {
        Balls balls = new Balls();
        assertThatExceptionOfType(InvalidParamException.class).isThrownBy(() -> {
            balls.add(new Ball(number1));
            balls.add(new Ball(number2));
            balls.add(new Ball(number3));
            balls.add(new Ball(number4));
        });
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
