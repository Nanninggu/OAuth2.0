# Google SSO 인증 구현
1. 구글에 Application 등록
https://console.cloud.google.com/

 
Google 클라우드 플랫폼

로그인 Google 클라우드 플랫폼으로 이동

accounts.google.com
- 프로젝트 생성

"프로젝트 만들기 또는 선택" 을 클릭하여 새로운 플젝을 하나 만든다.

이름은 아무거나 입력.


2. Application 등록
- API 및 서비스 검색 > 사용자 인증 정보 > 사용자 인증 정보 만들기 > OAuth 클라이언트 ID 클릭.

- 동의 화면 구성 > User Type : 외부 > 만들기 클릭.

- 앱 정보(앱 이름, 사용자 지원 이메일) 입력 + 개발자 연락처 정보 입력 > 저장 후 계속.

- 범위 추가 또는 삭제 클릭 > 범위는 기본값 email, profile, openid 선택  > 저장 후 계속.

- 테스트 사용자는 패스 (추가하지 않고 저장 후 계속 진행.

3. Application 등록
- 사용자 인증 정보 > 사용자 인증 정보 만들기 > OAuth 클라이언트 ID 클릭

- 애플리케이션 유형(웹 애플리케이션) 선택 > 이름 입력 > 승인된 리디렉션 URI 입력 > 만들기

승인된 리디렉션 URI는 아래와 같다.

{baseUrl}/login/oauth2/code/{registrationId}

http://localhost:8080/login/oauth2/code/google
- 화면은 아래와 같다.


4. 클라이언트 ID, 클라이언트 Secret 발급
- 아래와 같이 발급 되었다.


- Spring 코드에 부여받은 id와 secret 정보를 할당하자.


- 그리고 테스트를 해보자.

