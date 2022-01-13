# 웹/모바일(웹 기술) 스켈레톤 프로젝트

## 카테고리

| Application | Domain | Language | Framework |
| ---- | ---- | ---- | ---- |
| :white_check_mark: Desktop Web | :black_square_button: AI | :white_check_mark: JavaScript | :black_square_button: Vue.js |
| :black_square_button: Mobile Web | :black_square_button: Big Data | :black_square_button: TypeScript | :white_check_mark: React |
| :white_check_mark: Responsive Web | :black_square_button: Blockchain | :black_square_button: C/C++ | :black_square_button: Angular |
| :black_square_button: Android App | :black_square_button: IoT | :black_square_button: C# | :white_check_mark: Node.js |
| :black_square_button: iOS App | :black_square_button: AR/VR/Metaverse | :white_check_mark: Python | :black_square_button: Flask/Django |
| :black_square_button: Desktop App | :black_square_button: Game | :white_check_mark: Java | :white_check_mark: Spring/Springboot |
| | | :black_square_button: Kotlin | |



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
  * 
* 배포 환경
  - 

## 팀 소개
* 프론트엔드
  - 김병완
  - 박상훈
  - 박주윤
* 백엔드
  - 김소은
  - 유진주
  - 이남수



## 프로젝트 상세 설명

### 회의보조 플랫폼

#### 기획의도

- 회의가 서툰 학생들을 위한 "좋은 회의"를 할 수 있도록 도움을 주는 화상채팅 서비스

#### 타겟층

- 조별과제가 서툰 대학생
- 회의에 도움을 받고싶은 사용자

#### 필요성

- 대학시절 비효율적인 회의를 다수 경험했고, 여러 회의기법을 알고 있음에도 잘 활용하지 못하는 점을 개선한다면 더 좋은 결과물을 창출할 수 있고 이는 곧 개개인의 역량발전으로 이어질 수 있다고 생각해서 기획하게 되었다.

#### 주요 기능

1. 회의 시간 알림 (회의 시작 전 정해둔 회의 시간을 넘기지 않도록 표시해준다.)
2. 회의록 템플릿 제공 (회의 중 내용을 기록 할 수 있도록 템플릿을 제공한다.)
3. 채팅, 투표 등 회의에 도움이 될 수 있는 기능을 제공
4. 참여자가 각각 얼마나 발언했는지 말한 시간을 제공한다. (편의 기능)
5. 참여자의 역할을 표시한다.(팀장 / 서기등의 역할 표시 부터 / 6모자기법 같은 다양한 회의기법을 사용할 수 있도록 도와준다.)

#### 기대효과

- 이 서비스를 사용한 사용자들로 하여금 효율적인 회의를 위해 필요한 것들을 자연스럽게 익힐 수 있다.
- 사회에 진출했을 때 업무회의 등에 도움이 될 수 있음

### 프로젝트 주요기능

#### 회원 관리

- 회원가입
- 로그인
- 마이페이지
- 회원 탈퇴
- 회원 정보수정
- 아이디/비번 찾기

##### 회원 가입

- 아이디, 비밀번호, 비밀번호 확인, 이메일, 닉네임을 필수정보로한다.
- 위 정보는 다른 회원과 중복되지 않는다.
- 비밀번호와 비밀번호 확인 입력내용이 같아야 한다.
- 

##### 로그인

- 아이디와 비밀번호를 입력받는다.
- DB에서 확인 후 정보가 일치하면 로그인한다.
- 일치하지 않으면 안내메세지를 보인다.

##### 마이페이지

- 회원정보 표시(아이디, 간단한 스케줄표)
- 회원 정보 수정 으로 이동
- 나의 이전 회의록 로그
- 

##### 회원 탈퇴

- 로그인시 작동
- 비밀번호로 유저 확인

##### 회원 정보수정

- 로그인시 작동
- 비밀번호로 유저 확인
- 정보 수정(아이디, 비밀번호, 전번, 이름, 이메일정보 등)

##### 아이디/비번 찾기

- 비 로그인시 작동
- DB에 저장된 정보와 일치 여부 확인(ID 및 회원정보(전번, 이름, 이메일정보 등)

#### 팀관리

- 팀생성
- 팀해체
- 팀초대
- 회의관리
- 팀게시판(일정, 회의록 공유)

##### 팀생성

- 팀을 만드는 사람이 팀장이 된다.
- 팀장은 팀원 초대/팀해체/회의생성/회의종료권한을 갖는다.
- 팀장은 팀원에게 권한을 넘겨줄 수 있다.
- 권한을 넘겨받은 팀원은 팀장이 되고, 팀장은 팀원이 된다.
- 닉네임을 기준으로 팀원을 초대할 수 있다.
- 초대받은 사용자가 수락하면 팀원에 추가된다.

##### 팀해체

- 팀장만 해체권한을 갖는다.

##### 팀초대

- 팀장의 초대메시지를 통해 받은 링크로 입장기능
- 캘린더에 공지된 스케쥴 통해 입장

#### 회의관리

- 채팅창
- 회의록
- 투표기능



## [프로젝트 기획](https://www.notion.so/9b2407cdaaf34f829e2e67cfb56abe3a)

이번 프로젝트는 회의를 처음 접하는 학생들이나 회의에 어려움을 겪는 사용자들을 위한 회의 보조가 목적이다. 때문에 어떠한 회의 기법을 사용하는지가 중요하다. 그를 위해 아이디어 발상을 위한 다양한 회의 기법을 조사해 보았다.



## [와이어 프레임](https://www.notion.so/01-12-aa96d064deb74873ba001e1d5408fb65)

프로젝트의 와이어 프레임을 팀원들과 함께 제작해 보았다.



## [React](/react.md)

우리는 Vue.js를 사용하는 대신, 현재 프론트엔드 분야에서 가장많이 사용되는 React로 제작하기로 결정하였다. 그를 위해서 React에 대해 공부해 보는 시간을 가지게 되었다.