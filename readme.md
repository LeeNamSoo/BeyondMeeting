### mysql 환경변수 설정하는 법

- https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=jin93hj&logNo=221118160512



![image-20220111140852028](C:\Users\multicampus\AppData\Roaming\Typora\typora-user-images\image-20220111140852028.png)

명세서에 나와있는데로 진행을했는데 파일명이 backend-java 로 되어있어서

빌드가 새롭게 backend 폴더로 되어서 문제가 발생합니다...

그래서 폴더명을 다시 변경해 주면

![image-20220111120655740](C:\Users\multicampus\AppData\Roaming\Typora\typora-user-images\image-20220111120655740.png)

![image-20220111141059598](C:\Users\multicampus\AppData\Roaming\Typora\typora-user-images\image-20220111141059598.png)

![image-20220111141113288](C:\Users\multicampus\AppData\Roaming\Typora\typora-user-images\image-20220111141113288.png)

생전처음 스프링본 모습!!

![image-20220111141133844](C:\Users\multicampus\AppData\Roaming\Typora\typora-user-images\image-20220111141133844.png)

![image-20220111141158552](C:\Users\multicampus\AppData\Roaming\Typora\typora-user-images\image-20220111141158552.png)

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

![image-20220111141238592](C:\Users\multicampus\AppData\Roaming\Typora\typora-user-images\image-20220111141238592.png)

와 같이 잘 생성되어있다.

---

통합빌드, 실행을 하면

![image-20220111141220010](C:\Users\multicampus\AppData\Roaming\Typora\typora-user-images\image-20220111141220010.png)

와 같이 생성이 되는데 구동 명령어는 

```
java -jar ssafy-web-project-1.0-SNAPSHOT.jar
```

이라고 하면 

실행까지 잘 된다.