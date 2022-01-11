# 웹/모바일(웹 기술) 스켈레톤 프로젝트

<!-- 필수 항목 -->

## 카테고리

| Application | Domain | Language | Framework |
| ---- | ---- | ---- | ---- |
| :white_check_mark: Desktop Web | :black_square_button: AI | :white_check_mark: JavaScript | :white_check_mark: Vue.js |
| :black_square_button: Mobile Web | :black_square_button: Big Data | :black_square_button: TypeScript | :black_square_button: React |
| :white_check_mark: Responsive Web | :black_square_button: Blockchain | :black_square_button: C/C++ | :black_square_button: Angular |
| :black_square_button: Android App | :black_square_button: IoT | :black_square_button: C# | :white_check_mark: Node.js |
| :black_square_button: iOS App | :black_square_button: AR/VR/Metaverse | :white_check_mark: Python | :black_square_button: Flask/Django |
| :black_square_button: Desktop App | :black_square_button: Game | :white_check_mark: Java | :white_check_mark: Spring/Springboot |
| | | :black_square_button: Kotlin | |

<!-- 필수 항목 -->

## 프로젝트 소개

* 프로젝트명: 그룹 비디오 컨퍼런스 서비스
* 서비스 특징: 웹/모바일(웹 기술) 프로젝트를 위한 스켈레톤 프로젝트
* 주요 기능
  - 회원 관리
  - 화상 미팅룸
  - 그룹 채팅
* 주요 기술
  - WebRTC
  - WebSocket
  - JWT Authentication
  - REST API
* 참조 리소스
  * Vuetify: 디자인 전반 적용
  * Vue Argon Design System: 디자인 전반 적용
  * Vue Black Dashboard Pro(유료): 캘린더 컴포넌트 사용
  * AR Core: 구글에서 제공하는 AR 지원 라이브러리. 이미지 인식 및 오버레이 영상에 활용
  * Color Thief: 이미지 색상 추출 라이브러리. 커버 사진 색상 추출 및 배경 변경에 활용
  * Animation.css: CSS 애니메이션 지원 라이브러리. 메인 페이지 진입 애니메이션에 활용
* 배포 환경
  - URL: // 웹 서비스, 랜딩 페이지, 프로젝트 소개 등의 배포 URL 기입
  - 테스트 계정: // 로그인이 필요한 경우, 사용 가능한 테스트 계정(ID/PW) 기입

## 팀 소개
* 김병완
* 김소은
* 박상훈
* 박주윤
* 유진주
* 이남수


## 프로젝트 상세 설명

// 개발 환경, 기술 스택, 시스템 구성도, ERD, 기능 상세 설명 등


# 0110

### 개발환경설정

clone 코드를 가져와 임포트

1. Back-end
    - java
    - database
    - IntelliJ
2. Front-end
    - Node JS
    - VS Code
    - 프로젝트 Dependencieds 설치
        
        ```bash
        npm install
        ```
        
        오류시 다음과 같이 명령어 실행
        
        ```bash
        npm install node-sass
        npm rebuild node-sass
        ```
        
    - 프로젝트 Dev. 모드 실행
        
        ```bash
        npm run serve
        ```
        
    - 프론트엔드 빌드
        
        ```bash
        npm run build
        ```
        
3. 통합빌드(프론트&백) 및 실행 
    - 통합빌드하기위해 백엔드 프로젝트 경로에서 다음명령어실행
    
    ```bash
    gradlew clean build
    ```
    
    → /backend/build/libs 폴더에 .jar 파일 생성되었음.
    
    - 통합 빌드 된 Spring Boot Application 구동을 위해 .jar가 있는 폴더 경로에서 다음 명령 실행
    
    ```bash
    java -jar ~~~.jar
    ```
    
    - [localhost:8080](http://localhost:8080) 에 접속하여 서비스 구동 확인
    
4. 공통프로젝트 기획에 참고할 회의기법 조사
    
    내가 관심이 간 회의기법은 KJ 기법
    
    KJ 기법(친화도 분석법)
    <aside>
💡 아이디어를 정리하는 압축기법 (그룹화)

</aside>

1. 주제를 정하기
2. 카드에 정보를 간략히 적기
3. 정보를 적은 카드를 한눈에 들어오도록 벽에 붙이기
4. 내용이 비슷한 카드끼리 그룹으로 모으기
5. 같은 그룹에 있는 카드들의 내용을 보면서 어떤 점이 비슷한지 생각하기
6. 그룹에 타이틀을 붙이기
7. 타이틀 카드들을 붙이고 그룹을 만드는 작업을 반복~~~~~~~~~~~
8. 그룹 간의 관계를 생각하며 도표화 또는 문장화하여 정리하기

- **K J 법을 위한 주의사항:**

(1) 합리적인 분류법이 무엇인가에 대해 토론하거나 시간을 낭비하지 말고 각자 느끼는 대로 신속반응 하도록 한다.

(2) 신중한 생각보다 스피드가 중요하다.

(3) 다른 사람과 의견을 달리해도 괜찮다는 환경을 만들어 주어야 한다.

분류방식이 전혀 다른 사람이 있다면 독자적으로 작업할 수 있도록 카드 전체를 복사해줄 수도 있다.

[아이디어 정리는 KJ법으로](https://brunch.co.kr/@oeoechoi/74)

## 장점

1. 우선순위를 설정하기에 좋다. 
2. 다수의 의견을 반영하기 때문에 비교적 객관적이다. 
3. 방법이 간단하여 누구나 쉽게 결과를 산출해 낼 수 있다.

## 단점

구현을 어떻게 할 지?

## 추후에..

데이터마이닝을 통해 자동 그룹화를 해 준다면 좋지 않을까 ???

# **<CASE STUDY>**

### 젊은 직원이 곧 사직해서 곤란해하는 회사의 문제해결방법을 도출해본다.

1단계: 브레인스토밍에 의해 "왜 우리회사를 그만두는가?"를 생각해본다

2단계: 포스트잇 한장에 한가지 항목만을 적는다.

- 3단계: 나온 대답을 정리해보니, 대개 아래처럼 집약된다.
    
    *낮은 급료,  회사가 재미없다,  상사가 싫다,  직장이 더럽다,  가르쳐주지 않는다,*
    
    출근*이 빠르다,  잔업이 너무 많다,  평가해주지 않는다,  아르바이트의 급료가 더 높을거 같다,*
    
    *맞지 않는 사람이 있다,  생각했던 업무 내용과 다른다,  분위기가 어둡다,  너무 어렵다,*
    
    *휴가가 제멋대로다,  직장내 성추행에 가까운 행위가 많다,  소규모집단이 있고 거기에 들어갈수 없다,  권위적인 상사,*
    
    *미래가 보이지 않는다, 항상 똑같은 일만 되풀이해서 한다,  재미없다,  결과에 너무 엄격하다.*
    
- 4단계; 위 항목들을 그룹화해서 각 그룹에 서브타이틀을 붙인다(KJ법)
    - 노동조건에 관한 사항들
    
    *낮은 급료,  출근이 빠르다,  잔업이 너무 많다,  아르바이트의 급료가 더 높을거 같다,  휴가가 제멋대로다,  평가해주지 않는다.*
    
    - 노동환경에 관한 사항들
    
    *회사가 재미없다,  상사가 싫다,  직장이 더럽다,  맞지 않는 사람이 있다,  분위기가 어둡다,  직장내 성추행에 가까운 행위가 많다,* 
    *소규모집단이 있고 거기에 들어갈수 없다,  권위적인 상사,*
    
    - 업무내용에 관한 사항들
    
    *가르쳐주지 않는다,  생각했던 업무 내용과 다른다,  너무 어렵다,  미래가 보이지 않는다, 항상 똑같은 일만 되풀이해서 한다,*
    
    *재미없다,  결과에 너무 엄격하다.*
    

이상으로 KJ법을 설명했다..

여기서 한발 더나가, 부족한 개념 및 단어들을 구조화하여 문제발견 로직트리를 작성하면 다음과 같다...

<직원들이 회사를 그만두는 이유는?>

- 1. 노동조건
    - 제도
        
        출근*이 빠르다,  잔업이 너무 많다,  휴가가 제멋대로다,*
        
    - 임금
        
        *낮은 급료,  아르바이트의 급료가 더 높을거 같다,*
        
    - 평가 *평가해주지 않는다*
- 2. 노동환경
    - 상사
        
         *상사가 싫다,  권위적인 상사,  직장내 성추행에 가까운 행위가 많다,*
        
    - 동료
        
        *소규모집단이 있고 거기에 들어갈수 없다,  맞지 않는 사람이 있다,*
        
    - 직장
        
        *회사가 재미없다,  직장이 더럽다,  분위기가 어둡다,*  
        
- 3. 업무내용
    - 교육훈련
        
        *가르쳐주지 않는다,*
        
        *미래가 보이지 않는다,*
        
        *결과에 너무 엄격하다.*
        
    - 적정성
        
        *너무 어렵다, 생각했던 업무 내용과 다른다, 재미없다, 항상 똑같은 일만 되풀이해서 한다*
        

### <결론>

직원들이 회사를 그만두는 이유를 단순히, "출근이 빠르다" 라고 단정지을 경우, 

그 해결책은 "출근시간을 늦춘다"라고 하면 되어, 실제의 해결이라 할 수 없다. 

그러나 그 위의 레벨인 "제도"에 문제가 있다고 생각한다면, "선택적근로시간제를 도입한다" 등의 해결책이 도출된다..

> 출처
[https://blog.daum.net/nagaiaida/8182904](https://blog.daum.net/nagaiaida/8182904), 
[https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=postsent&logNo=220694490016](https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=postsent&logNo=220694490016)
>

# 0111

### Git 저장소 주소 repository 변경하기
``` bash
git remote set-url origin <새로운git url>

``` 
### 브랜치 생성
``` bash
git branch <브랜치이름>
```

### 브랜치로 이동
``` bash
git checkout <브랜치이름>
```

### 브랜치에서 push
``` bash
git push origin <브랜치이름>
```

## cmd 에서 mysql 실행하기
환경변수 > 시스템 변수 > path에 아래처럼 bin 파일경로 추가해주기
``` C:\Program Files\MySQL\MySQL Server 8.0\bin 
```

```
