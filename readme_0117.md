### git 문제 발생

```
git clone --mirror {기존 리파지토리 주소}
cd {기존 리파지토리 명}.git
git remote set-url --push origin {신규 리파지토리 주소}
git push --mirror
```

로 인한 문제의 발생이었다.

12C101 레퍼지토리에는 readme.md 파일이 존재하는데 

mirror를 해온 나의 로컬 폴더에도 또한 readme.md 파일이 존재했기 때문에 충돌이 발생했고 

merging 하라는 메시지가 나왔다. 나의 로컬 readme.md를 파일명을 바꿔주는 것으로 문제를 해결했다.

하지만 최선의 방법은 아니었던것 같다.

여튼 git mirror를 하면서 브랜치에 있던 것을 로컬로 그대로 가져오는 작업에서 생긴 문제는 

다음의 명령어로 해결할 수 있었다.

```
git pull origin 브런치명 --allow-unrelated-histories
```

이 명령 옵션은 이미 존재하는 두 프로젝트의 기록(history)을 저장하는 드문 상황에 사용된다고 한다. 즉, git에서는 서로 관련 기록이 없는 이질적인 두 프로젝트를 병합할 때 기본적으로 거부하는데, 이것을 허용해 주는 것이다. 이렇게 최초의 문제를 해결했고, 위의 merge오류를 해결할 수 있었다.