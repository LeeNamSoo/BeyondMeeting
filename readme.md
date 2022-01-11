### mysql 환경변수 설정하는 법

- https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=jin93hj&logNo=221118160512

### 폴더의 경로로 cmd 켜기

![image-20220111155616570](readme.assets/image-20220111155616570.png)



---



![image-20220111140852028](readme.assets/image-20220111140852028.png)

명세서에 나와있는데로 진행을했는데 파일명이 backend-java 로 되어있어서

빌드가 새롭게 backend 폴더로 되어서 문제가 발생합니다...

그래서 폴더명을 다시 변경해 주면

![image-20220111120655740](readme.assets/image-20220111120655740.png)

![image-20220111141059598](readme.assets/image-20220111141059598.png)

![image-20220111141113288](readme.assets/image-20220111141113288.png)

생전처음 스프링본 모습!!

![image-20220111141133844](readme.assets/image-20220111141133844.png)

![image-20220111141158552](readme.assets/image-20220111141158552.png)

행복하게 잘 작동하는 모습을 볼 수 있다.

---

프론트엔드 부분도 역시



잘 빌드되어 백엔드의 빌드 libs폴더로 잘 생성되었다.

다만 조금 생소했던 부분은

```
npm run serve 
```

를 하기 전에도 백엔드에서 본 모습과 프론트의 모습이 이미 같았던 부분이다.

이후

```
npm run build
```

를 하면 산출물이 

![image-20220111141238592](readme.assets/image-20220111141238592.png)

와 같이 잘 생성되어있다.

---

통합빌드, 실행을 하면

![image-20220111141220010](readme.assets/image-20220111141220010.png)

와 같이 생성이 되는데 구동 명령어는 

```
java -jar ssafy-web-project-1.0-SNAPSHOT.jar
```

이라고 하면 

실행까지 잘 된다.

---

# git 정리

![image-20220111144847108](readme.assets/image-20220111144847108.png)

### Git이란? 소스코드를 효과적으로 관리하기 위해 개발된 '분산형 버전 관리 시스템'입니다. 원래는 Linux 소스코드를 관리할 목적으로 개발 되었습니다.

- Git으로 파일을 관리하면, 업데이트 이력이 Git에 저장
- 매번 백업용 파일 복사본을 만들 필요가 없다.

---



### repository 란?  파일이나 폴더를 저장해 두는 곳

![image-20220111145300299](readme.assets/image-20220111145300299.png)

- 원격 저장소(Remote Repository): 파일이 원격 저장소 전용 서버에서 관리되며 여러 사람이 함께 공유하기 위한 저장소입니다.
- 로컬 저장소(Local Repository): 내 PC에 파일이 저장되는 개인 전용 저장소입니다.

![image-20220111145342516](readme.assets/image-20220111145342516.png)

#### 저장소 만드는 법

1. 첫 번째, 아예 저장소를 새로 만들거나 
2. 이미 만들어져 있는 원격 저장소를 로컬 저장소로 복사해온다.

---

### commit이란? 파일 및 폴더의 추가/변경 사항을 저장소에 기록

- 커밋 버튼을 누르면 이전 커밋 상태부터 현재 상태까지의 변경 이력이 기록된 커밋(혹은 리비전)이 만들어짐
- 시간순으로 저장

- 최근 커밋부터 거슬러 올라가면 과거 변경 이력과 내용을 알 수 있다.

![image-20220111145722234](readme.assets/image-20220111145722234.png)

---

### 작업트리와 인덱스 ? 

- Git 에서는 우리가 흔히 말하는 폴더를 '작업 트리'(Work Tree)
- 작업 트리 사이에 존재하는 공간을 '인덱스'

![image-20220111145914887](readme.assets/image-20220111145914887.png)

##### Git의 '커밋' 작업은 '작업 트리'에 있는 변경 내용을 저장소에 바로 기록하는 것이 아니라 그 사이 공간인 '인덱스'에 파일 상태를 기록(stage - 스테이징 한다고 표현하기도 합니다)하게 되어 있습니다. 따라서 저장소에 변경 사항을 기록하기 위해서는, 기록하고자 하는 모든 변경 사항들이 '인덱스'에 존재해야 합니다.

##### 예를 들어, 10개의 파일을 수정했지만 그 중에 7개만 저장소에 공개하고 싶을 때를 생각해 보세요. 변경한 10개의 파일 중 7개를 선택하는 작업이 바로 '인덱스에 등록' 또는 '스테이징(stage)'이라 표현하는 작업 입니다.

##### 이렇게 인덱스란 공간(가상이지만요!)이 중간에 있는 덕분에 작업 트리 안에 있는 커밋이 필요 없는 파일들을 커밋에 포함하지 않을 수 있고, 파일에서 내가 원하는 일부 변경 사항만 인덱스에 등록해 커밋할 수 있습니다.

---

### 원숭이도 하는 커밋

![image-20220111153332894](readme.assets/image-20220111153332894.png)

![image-20220111153833617](readme.assets/image-20220111153833617.png)

![image-20220111155034550](readme.assets/image-20220111155034550.png)

푸쉬하고

클론을 해봄

![image-20220111155224817](readme.assets/image-20220111155224817.png)

잘 진행되는 모습을 볼 수 있다.

웹저장소에도 잘 푸쉬된 모습

![image-20220111160454312](readme.assets/image-20220111160454312.png)

![image-20220111160735514](readme.assets/image-20220111160735514.png)

---

### merge

![image-20220111154155217](readme.assets/image-20220111154155217.png)

- 끌어온 저장소가 최신 버전이 아닌 경우, 즉 내가 pull 을 실행한 후 다른 사람이 push 를 하여 원격 저장소를 업데이트 해버린 경우에는 위의 그림과 같이 내 push 요청이 거부

![image-20220111154229455](readme.assets/image-20220111154229455.png)

- 병합(merge)이라는 작업을 진행하여 다른 사람의 업데이트 이력을 내 저장소에도 갱신 해야함

- 만약 병합하지 않은 채로 이력을 덮어쓰게 되면 다른 사람이 push 한 업데이트 내역(그림의 커밋C)이 사라져 버리기 때문