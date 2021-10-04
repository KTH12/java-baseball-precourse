# 숫자 야구 게임

---
<br>

## 작업 개요

### 규칙 및 흐름 정의

<details>
<summary> 야구게임 규칙 과 흐름 정의 </summary>


--- 

1. 컴퓨터는 랜덤 3개의 숫자를 생성한다.
    - 규칙
        - 1이상 9이하의 숫자여야한다.
        - 서로 다른 숫자여야한다.
        - 3개의 숫자여야한다
    - 함수
        - 숫자배열생성 **랜덤숫자**  함수 구현


2. 유저에게 3개의 숫자를 입력 받는다.
    - 규칙
        - 1이상 9이하의 숫자여야한다.
        - 서로 다른 숫자여야한다.
        - 3개의 숫자여야한다
        - 사용자가 잘못된 값을 입력할 경우 [ERROR]로 시작하는 에러 메시지를 출력하고 게임을 계속 진행한다.
    - 함수
        - 숫자배열생성 **입력받은문자열**을 변환 함수 구현


3. 컴퓨터와 유저의 3개의 숫자를 비교한다.
    - 배열의 같은 자리에 있으면 **스트라이크**
    - else 다른 자리에 포함이면 **볼**
    - 스트라이크 또는 볼이면 해당 결과 출력(ex: 1스트라이크, 1 볼)
    - 같은게 없으면 **낫싱**
    - 3스트라이크 이면 유저승리
    - 아니면 다시 유저에게 다시 입력을 받는다.
    - **승리 할때 까지 2번으로 돌아가 반복**


4. 게임 승리 후 계속 진행 여부 체크
    - "1" 입력하면 다시 진행
    - "2" 입력하면 게임 종료

</details>

### 프로젝트 구조 설계

--- 

    ├── ...
    ├── application
    │   ├── GameFacade        # 게임 관리 
    │   └── BaseBallGame      # 야구 게임 프로세스
    │
    ├── domain
    │   ├── Ball                   # 야구공 모델(1~9 숫자를 가진 객체)
    │   ├── Balls                  # Ball List를 가진 모델
    │   ├── GamerInfo              # Balls 타입을 가진 Computer,User 모델
    │   ├── BaseBallResult         # 스트라이크, 볼의 카운트 모델
    │   ├── BallsFactory           # 랜덤 Balls 생성, 받은문자열 Balls 생성
    │   ├── BaseBallService        # 컴퓨터 Balls생성, 유저 Balls 생성, 결과값 검증 
    │   ├── BaseBallServiceImpl    # BaseBallService 구현체
    │   └── BaseBallResultService  # 결과 검증 인터페이스
    │
    ├── infrastructure             # 변경 가능한 비지니스 로직 패키지
    │   ├── BallsFactoryImpl            # BaseBallService 구현체
    │   └── BaseBallResultServiceImpl   # BaseBallResultService 구현체
    │
    ├── console  
    │   └── Output                # 사용자에게 메시지 출력 담당
    └── ...

### 구현 기능 목록 체크 리스트

- [X] 흐름도를 작성해보며 전체적인 플로우를 검토한다.[규칙 및 흐름 정의](#규칙-및-흐름-정의)
- [X] 프로젝트 구조를 작업전에 정의 해본다 [프로젝트 설계](#프로젝트-구조-설계)
- [X] 미리 정의한 프로젝트 기본 구조를 만든다.
- [X] Ball 모델 구현
    - [X] validBallNumber (숫자 검증 함수)


- [X] Balls 모델 구현
    - [X] validSize(총 숫자 사이즈 검증 함수)
    - [X] validDuplicate (중복 입력 검증 함수)


- [X] GamerInfo 모델 구현


- [X] BaseBallResult 모델 구현
    - [X] 스트라이크, 볼 증가시키는 함수


- [X] BaseBallServiceImpl 구현
    - [X] 컴퓨터 Balls 생성 함수
    - [X] 유저 Balls 생성 함수
    - [X] 결과 검증 함수


- [X] BallsFactoryImpl 구현
    - [X] 랜덤 Balls 생성 함수
    - [X] 입력받은 문자열 -> Balls 생성 함수


- [X] BaseBallResultServiceImpl 구현
    - [X] 스트라이크 , 볼 카운트를 검증 로직 구현


- [X] GameFacade 구현
    - [X] 유저가 게임을 마친뒤 진행 여부를 물어보고 진행한다면, 게임을 반복한다.
    - [X] 게임을 계속 할것인지 메시지 출력 후 결과 반환


- [X] BaseBallGame
    - [X] 컴퓨터 balls, 유저 balls 를 생성, 맞출때까지 반복 진행
    - [X] 유저 입력값을 받고 Baseball을 생성한다, 입력 오류시 재입력 반복한다
    - [X] 정답 검증


- [X] 테스트 구현
    - [X] Ball 모델 테스트 작성
    - [X] Balls 모델 테스트 작성
    - [X] BallsFactoryImpl 구현체 테스트 작성

### 리팩토링

- [ ] Output 메시지 정의를 common 패키지로 분리하기

- [ ] Exception 을 도메인 단위로 분리 관리하기
    - [ ] BaseBallException 만들기

---
