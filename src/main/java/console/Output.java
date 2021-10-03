package console;

public class Output {
	private static final String CONTINUE_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

	public static void printContinueMessage() {
		System.out.println(CONTINUE_MESSAGE);
	}
}
