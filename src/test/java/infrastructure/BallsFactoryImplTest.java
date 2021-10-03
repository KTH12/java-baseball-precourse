package infrastructure;

import baseball.Application;
import domain.Balls;
import domain.BallsFactory;
import nextstep.test.NSTest;
import nextstep.utils.Randoms;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

class BallsFactoryImplTest extends NSTest {

    @BeforeEach
    void beforeEach() {
        super.setUp();
    }

    @ParameterizedTest
    @CsvSource(value = {"1, 3, 5"})
    void 랜덤_숫자_생성(int number1, int number2, int number3) {
        BallsFactory ballsFactory = new BallsFactoryImpl();
        try (final MockedStatic<Randoms> mockRandoms = mockStatic(Randoms.class)) {
            mockRandoms
                .when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                .thenReturn(number1, number2, number3);
            Balls randomBalls = ballsFactory.registerRandomBalls();
            List<Integer> ballsArr = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                ballsArr.add(randomBalls.getBalls().get(i).getNumber());
            }

            assertThat(ballsArr).contains(number1);
            assertThat(ballsArr).contains(number2);
            assertThat(ballsArr).contains(number3);
        }
    }

    @ParameterizedTest
    @CsvSource(value = {"1, 3, 5, ABC"})
    void 문자입력_실패(int number1, int number2, int number3, String str) {
        BallsFactory ballsFactory = new BallsFactoryImpl();
        try (final MockedStatic<Randoms> mockRandoms = mockStatic(Randoms.class)) {
            mockRandoms
                .when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                .thenReturn(number1, number2, number3);

            Assertions.assertThatThrownBy(() ->
                ballsFactory.registerInputBalls(str))
                .isInstanceOf(IllegalArgumentException.class);
        }
    }

    @ParameterizedTest
    @CsvSource(value = {"1, 3, 5, 119"})
    void 중복_문자입력_실패(int number1, int number2, int number3, String str) {
        BallsFactory ballsFactory = new BallsFactoryImpl();
        try (final MockedStatic<Randoms> mockRandoms = mockStatic(Randoms.class)) {
            mockRandoms
                .when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                .thenReturn(number1, number2, number3);

            Assertions.assertThatThrownBy(() ->
                ballsFactory.registerInputBalls(str))
                .isInstanceOf(IllegalArgumentException.class);
        }
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