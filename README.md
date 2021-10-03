# 숫자 야구 게임

---
<br>

## 요구사항

----
<details>
<summary>기능 요구사항</summary>

> ### 기능 요구사항
>
> 1. 기본적으로 1부터 9까지 서로 **<span style="color:orange">다른 수**로 이루어진 **<span style="color:orange">3자리의 수**를 맞추는 게임이다.
>
>
> 2. 같은 수가 같은 **<span style="color:orange">자리에 있으면 스트라이크**, **<span style="color:orange">다른자리에 있으면 볼**, **<span style="color:orange">같은 수 가전혀 없으면 포볼 또는 낫싱** 이란 힌트를 얻고,그 힌트를 이용해서 먼저 **<span style="color:orange">상대방(컴퓨터)의 수를 맞추면 승리**한다.
> - [예] 상대방(컴퓨터)의 수가 425일때, 123을 제시 한 경우: 1스트라이크, 456을 제시한경우:1스트라이크 1볼, 789를 제시한 경우:낫싱



>
>
> 3. 위 숫자 야구게임 에서 **<span style="color:orange">상대방의 역할을 컴퓨터**가한다. **<span style="color:orange">컴퓨터는 **1에서9** 까지 서로 다른 임의의 수 3개**를 선택한다.  
     게임플레이어는 컴퓨터가 생각하고 있는 **<span style="color:orange">3개의숫자**를입력하고, **<span style="color:orange">컴퓨터는 입력한 숫자에 대한 결과를 출력**한다
>
>
> 4. 이 같은 **<span style="color:orange">과정을 반복**해 컴퓨터가 선택한 **<span style="color:orange">3개의 숫자를 모두 맞히면 게임이 종료**된다.
>
>
> 5. 게임을 종료한 후 **<span style="color:orange">게임을 다시 시작**하거나 **<span style="color:orange">완전히 종료**할 수 있다
>
> 6. 사용자가 **<span style="color:orange">잘못 된 값을 입력 할 경우 [ERROR]로시작 하는 에러메시지를 출력**하고 **<span style="color:orange">게임을 계속 진행** 할 수 있어야한다


</details>

<details>
<summary> 프로그래밍 요구사항1 - 제약사항</summary>

> 1. 숫자 야구게임을 실행하는 시작점은 src/main/java폴더의 baseball.Application의 main() 이다.
>
>
> 2. 숫자 야구게임은 JDK8버전에서 실행 가능 해야 한다.JDK8에서 정상동작 하지 않을 경우 0점 처리한다.
>
>
> 3. JDK에서 기본제공하는 Random,ScannerAPI대신 nextstep.utils패키지 에서 제공하는 Randoms, ConsoleAPI 를 활용 해 구현 해야 한다.  
     > • Random값추출은 nextstep.utils.Randoms의 pickNumberInRange() 를 활용한다.  
     > • 사용자가 입력하는 값은 nextstep.utils.Console의readLine() 을 활용한다.  
     > • 프로그램 구현 을 완료했을때 src/test/java폴더의 baseball.ApplicationTest에 있는 2개의 TestCase가 성공해야한다.
>
>
> 4. ApplicationTest에서 제공하는 2개의 TestCase는 숫자 야구 게임 구현을 위한 최소한의 TestCase이다.
>
>
> 5. 필수요구사항은 아니지만 제공하는소스코드를 참고 해 숫자 야구 게임을 위한 모든 TestCase를 추가 해 보는 것도 테스트에대한좋은연습이될수있다.
>
>

</details>

<details>
<summary> 프로그래밍 요구사항2 - 제약사항</summary>

> 1. 자바코드컨벤션을지키면서프로그래밍한다.  
     -  https://naver.github.io/hackday-conventions-java/
>
>
> 2. indent(인덴트,들여쓰기)depth를2가넘지않도록구현한다.1까지만허용한다.  
     - 예를들어while문안에if문이있으면들여쓰기는2이다.  
     - 힌트:indent(인덴트,들여쓰기)depth를줄이는좋은방법은함수(또는메소드)를분리하면된다.
>
>
> 3. 자바8에추가된streamapi를사용하지않고구현해야한다.단,람다는사용가능하다.  
     - else예약어를쓰지않는다.      
     - 힌트:if조건절에서값을return하는방식으로구현하면else를사용하지않아도된다.  
     - else를쓰지말라고하니switch/case로구현하는경우가있는데switch/case도허용하지않는다.
>
>
> 4. 함수(또는메소드)의길이가10라인을넘어가지않도록구현한다.     
     - 함수(또는메소드)가한가지일만잘하도록구현한다.
>
>
</details>  


<details>
<summary> 프로그래밍 요구사항3 - 단위 테스트</summary>

> 1. 도메인로직에단위테스트를구현해야한다.단,UI(System.out,System.in,Scanner)로직은제외  
     - 핵심로직을구현하는코드와UI를담당하는로직을분리해구현한다.  
     - 힌트는MVC패턴기반으로구현한후View,Controller를제외한Model에대한단위테스트를추가하는것에집중한다.
>
>
> 2. JUnit5와AssertJ사용법에익숙하지않은개발자는첨부한"학습테스트를통해JUnit학습하기.pdf"문서를참고해 사용법을학습한후JUnit5기반단위테스트를구현한다
>
>

</details>  


<details>
<summary> 과제 진행 요구사항 </summary>

> 1. 미션은 ://github.com/next-step/java-baseball-precourse 저장소를 fork/clone해 시작 한다
>
>
> 2. 기능을 구현 하기 전에 java-baseball-precourse/README.md 파일에 구현 할 기능 목록을 정리 해 추가한다.
>
>
> 3. git의 commit단위는 앞단계에서 README.md파일에 정리한 기능 목록 단위 또는 의미 있는 단위로 Commit한다. - AngularJSCommitMessageConventions 참고해 commitlog 를 남기려고 노력 해 본다
>
>
> 4. 과제 진행 및 제출방법은  [프리코스 과제 제출](https://github.com/next-step/nextstep-docs/blob/master/precourse) 문서를 참고한다.

</details>

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
    ├── infrastructure
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


- [ ] BaseBallServiceImpl 구현
    - [X] 컴퓨터 Balls 생성 함수
    - [X] 유저 Balls 생성 함수
    - [ ] 결과 검증 함수


- [X] BallsFactoryImpl 구현
    - [X] 랜덤 Balls 생성 함수
    - [X] 입력받은 문자열 -> Balls 생성 함수


- [ ] BaseBallResultServiceImpl 구현
    - [ ] 스트라이크 , 볼 카운트를 검증 로직 구현


- [ ] GameFacade 구현
    - [ ] 유저가 게임을 마친뒤 진행 여부를 물어보고 진행한다면, 게임을 반복한다.
    - [ ] 게임을 계속 할것인지 메시지 출력 후 결과 반환


- [ ] BaseBallGame
    - [ ] 컴퓨터 balls, 유저 balls 를 생성, 맞출때까지 반복 진행
    - [ ] 유저 입력값을 받고 Baseball을 생성한다, 입력 오류시 재입력 반복한다
    - [ ] 정답 검증


- [ ] 테스트 구현
    - [X] Ball 모델 테스트 작성
    - [X] Balls 모델 테스트 작성
    - [X] BallsFactoryImpl 구현체 테스트 작성

---
