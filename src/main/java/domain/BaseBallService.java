package domain;

public interface BaseBallService {
    void generateComputerInfo();

    void generateUserInfo(String userInput);

    BaseBallResult isSuccess();
}
