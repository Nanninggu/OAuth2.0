### **\# Google SSO 인증 구현**

### **1\. 구글에 Application 등록**

[https://console.cloud.google.com/](https://console.cloud.google.com/)

 [Google 클라우드 플랫폼

로그인 Google 클라우드 플랫폼으로 이동

accounts.google.com](https://console.cloud.google.com/)

\- 프로젝트 생성

"프로젝트 만들기 또는 선택" 을 클릭하여 새로운 플젝을 하나 만든다.

이름은 아무거나 입력.

![img1 daumcdn {"originWidth":809,"originHeight":582,"style":"alignLeft","width":481,"height":346}](https://github.com/Nanninggu/OAuth2.0/assets/54211801/12cfd35c-4667-41b7-94f7-f4a9d8d5828f)


[##_Image|kage@NlE6H/btsHsQ9GZgp/l5OFMnvFZrhX8mffOf7RVK/img.png|CDM|1.3|{"originWidth":809,"originHeight":582,"style":"alignLeft","width":481,"height":346}_##]

### **2\. Application 등록**

\- API 및 서비스 검색 > 사용자 인증 정보 > 사용자 인증 정보 만들기 > OAuth 클라이언트 ID 클릭.

\- 동의 화면 구성 > User Type : 외부 > 만들기 클릭.

\- 앱 정보(앱 이름, 사용자 지원 이메일) 입력 + 개발자 연락처 정보 입력 > 저장 후 계속.

\- 범위 추가 또는 삭제 클릭 > 범위는 기본값 email, profile, openid 선택  > 저장 후 계속.

\- 테스트 사용자는 패스 (추가하지 않고 저장 후 계속 진행.

### **3\. Application 등록**

\- 사용자 인증 정보 > 사용자 인증 정보 만들기 > OAuth 클라이언트 ID 클릭

\- 애플리케이션 유형(웹 애플리케이션) 선택 > 이름 입력 > 승인된 리디렉션 URI 입력 > 만들기

승인된 리디렉션 URI는 아래와 같다.

```
{baseUrl}/login/oauth2/code/{registrationId}

http://localhost:8080/login/oauth2/code/google
```

\- 화면은 아래와 같다.

[##_Image|kage@cQ8zUt/btsHtYlfa98/dEoUQtVSxvEa1rRFvJ1Y8K/img.png|CDM|1.3|{"originWidth":792,"originHeight":1250,"style":"alignLeft","width":537,"height":848}_##]

### **4\. 클라이언트 ID, 클라이언트 Secret 발급**

\- 아래와 같이 발급 되었다.

[##_Image|kage@b0uVqe/btsHubSbGQX/PR6U04rQlVUwStfDJ02bZ0/img.png|CDM|1.3|{"originWidth":735,"originHeight":817,"style":"alignLeft","width":450,"height":500}_##]

\- Spring 코드에 부여받은 id와 secret 정보를 할당하자.

[##_Image|kage@bKC9Eu/btsHtLNBQxA/fEybkdzpE19TfvzP20doqk/img.png|CDM|1.3|{"originWidth":1614,"originHeight":179,"style":"alignLeft"}_##]

\- 그리고 테스트를 해보자.

[##_Image|kage@qoWqK/btsHuo5cFay/gWYDzilDktdtjl5bnxmq31/img.gif|CDM|1.3|{"originWidth":1912,"originHeight":2088,"style":"alignCenter","filename":"Google_SSO_Test_Springboot.gif"}_##]

\- 구현 코드는 아래에 git hub에 올려놓았다.

[https://github.com/Nanninggu/OAuth2.0/blob/master/README.md](https://github.com/Nanninggu/OAuth2.0/blob/master/README.md)

 [OAuth2.0/README.md at master · Nanninggu/OAuth2.0

About OAuth2.0 Example Code. Contribute to Nanninggu/OAuth2.0 development by creating an account on GitHub.

github.com](https://github.com/Nanninggu/OAuth2.0/blob/master/README.md)

\- 끝 -
