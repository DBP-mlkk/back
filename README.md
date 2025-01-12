# 관세청 공공데이터 활용･분석

### 🏆수상 내역

<div align="center">2024년 관세청 공공데이터 활용·분석 경진대회 🥉장려상</div>

<p align="center"><img src="https://github.com/user-attachments/assets/d50bcfcb-e287-4425-84df-606d96b722a1" width="300" height="400"/></p>

![KakaoTalk_20250112_164020898](https://github.com/user-attachments/assets/51337fa9-c563-451d-a61e-5b8a45412429) | ![상장](https://github.com/user-attachments/assets/d50bcfcb-e287-4425-84df-606d96b722a1)
---|---|

![KakaoTalk_20240604_170937622-horz](https://github.com/DBP-mlkk/back/assets/123048828/77d99a81-de89-4d98-a43d-a6afe4bd7804)
▲메인페이지ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ▲검색페이지

### 🍔주제
중소기업 해외 진출 지원 사업을 통한 공공데이터 분석, 교육 빛 지원사업 개선 방안 제안

### 🍔기획개요
글로벌 시장의 빠른 변화와 개방은 중소기업에게 다양한 수출 기회를 제공하고 있으나, 이를 적극적으로 활용하기 위해서는 충분한 정보와 지원이 필수적임. 또한 중소기업이 해외 시장에 효과적으로 진출하기 위해서는 시장 분석, 마케팅 전략, 법률적 지원 등 다방면에서의 지원이 필요함. 이에 우리는 현재 시행 중인 중소기업 지원 사업의 내용을 면밀히 분석하고, 2017년부터 2019년까지 실행된 지원 사업의 결과를 바탕으로 향후 실행 결과를 예측하여 보완할 점을 찾아내고 개선된 정책을 제안함. 이를 통해 중소기업이 해외 시장의 빠른 변화와 확장에 효과적으로 대응할 수 있도록 지원하고자 함. 따라서 중소기업의 글로벌 경쟁력을 강화하고, 국가 경제의 성장에 기여하는 것을 목표함.

### 🍔분석·활용의 배경 및 목적
1️⃣ 글로벌 시장의 빠른 변화와 개방은 중소기업에게 다양한 수출 기회를 제공하고 있으나, 이를 적극적으로 활용하기 위해서는 충분한 정보와 지원이 필수적임

2️⃣ 중소기업이 해외 시장에 효과적으로 진출하기 위해서는 시장 분석, 마케팅 전략, 법률적 지원 등 다방면에서의 지원이 필요함

3️⃣ 이에 현재 시행 중인 중소기업 지원 사업의 내용을 면밀히 분석하고, 2017년부터 2019년까지 실행된 지원 사업의 결과를 바탕으로 향후 실행 결과를 예측하여 보완할 점을 찾아내고 개선된 정책을 제안함

4️⃣ 이를 통해 중소기업이 해외 시장의 빠른 변화와 확장에 효과적으로 대응할 수 있도록 지원하고자 함

5️⃣ 따라서 중소기업의 글로벌 경쟁력을 강화하고, 국가 경제의 성장에 기여하는 것을 목표함

### 🍔기대효과
1️⃣ 중소기업의 역량 강화로 경쟁력을 확보하여 변화하는 시장 환경에서 기술 발전, 소비자 트렌드변화 경쟁심화를 더 빠르게 이해 할 수 있음

2️⃣ 차별화된 강점으로 세계시장에서 경쟁우위 확보가 되고 지속가능한 성장 동력을 확보할 수 있음

3️⃣ 중소기업들이 역량 강화를 위한 자료를 찾을 때 드는 수고와 비용이 줄어들음

### 🍔ERD
![KakaoTalk_20240610_214118961](https://github.com/DBP-mlkk/.github/assets/123048828/dd92a128-1766-4690-bbdd-86375aaf5540)

### 🍔개발 스택
Front-End
- html
- CSS
- JavaScript

Back-End
- Java 17
- JDK 19
- Spring Boot 2.7.12
- Swagger
- MariaDB

Data-Analysis
- Python

Production
- Discord

### 🍔Repo소개
- front : front-end용 Repo
- back  : back-end용 Repo
- data_analysis : 데이터분석용 Repo

### 🍔구조
```
📦 
-front
.DS_Store
.idea
│  ├─ .gitignore
│  ├─ front.iml
│  ├─ misc.xml
│  ├─ modules.xml
│  └─ vcs.xml
README.md
SignUp.css
├─ SignUp.html
├─ images
│  ├─ DBP 로고.jpg
│  ├─ 돋보기.png
│  ├─ 배경 이미지.png
│  ├─ 버튼.png
│  └─ 체크.png
├─ login.css
├─ login.html
├─ login.js
├─ login_complete.css
├─ login_complete.html
├─ login_complete.js
├─ main.css
├─ main.html
├─ main.js
├─ subpage.css
├─ subpage.html
└─ subpage.js
```
▲Front-End

```
📦 
├─ .gitignore
├─ README.md
├─ build.gradle
├─ gradle
│  └─ wrapper
│     ├─ gradle-wrapper.jar
│     └─ gradle-wrapper.properties
├─ gradlew
├─ gradlew.bat
├─ settings.gradle
└─ src
   ├─ main
   │  ├─ java
   │  │  ├─ com
   │  │  │  └─ example
   │  │  │     └─ dbpmkk
   │  │  │        ├─ Controller
   │  │  │        │  ├─ educate
   │  │  │        │  │  └─ EducateController.java
   │  │  │        │  ├─ member
   │  │  │        │  │  └─ MemberController.java
   │  │  │        │  └─ policy
   │  │  │        │     └─ PolicyController.java
   │  │  │        ├─ DTO
   │  │  │        │  └─ MemberDTO.java
   │  │  │        ├─ DbpMkkApplication.java
   │  │  │        ├─ Domain
   │  │  │        │  ├─ educate
   │  │  │        │  │  └─ EducateEntity.java
   │  │  │        │  ├─ member
   │  │  │        │  │  └─ MemberEntity.java
   │  │  │        │  └─ policy
   │  │  │        │     └─ PolicyEntity.java
   │  │  │        ├─ Repository
   │  │  │        │  ├─ educate
   │  │  │        │  │  └─ EducateEntityRepository.java
   │  │  │        │  ├─ member
   │  │  │        │  │  └─ MemberRepository.java
   │  │  │        │  └─ policy
   │  │  │        │     └─ PolicyEntityRepository.java
   │  │  │        └─ Service
   │  │  │           ├─ educate
   │  │  │           │  └─ EducateService.java
   │  │  │           ├─ member
   │  │  │           │  └─ MemberService.java
   │  │  │           └─ policy
   │  │  │              └─ PolicyService.java
   │  │  └─ sql
   │  │     └─ txt
   │  └─ resources
   │     └── application.properties
   └─ test
      └─ java
         └─ com
            └─ example
               └─ dbpmkk
                  └─ DbpMkkApplicationTests.java
```
▲Back-End

```
📦 
├─ Business_results.py
└─ data.csv
```
▲Data-Analysis

### 🍔팀원 소개
[강민지](https://github.com/alswl0912)

[강형진](https://github.com/rapidswap)

[문경만](https://github.com/MunKyungMan)

[임한규](https://github.com/ekrndjaak)

### 🍔활용 데이터 정보
관세청 공공데이터
- 관세청 전국 세관별 세수실적
- 관세청 월별 품목별 국가별 수출입실적
- 관세청 우리나라 무역수지 및 수출입통계

공공포털데이터
- 중소벤처기업진흥공단 중소기업 컨설팅지원사업 지원성과(2019.12.31)
- 한전케이피에스주식회사 중소기업 지원사업 정보(2023.08.31)
- 한국남부발전(주) 중소기업 지원사업 목록(2023.07.27)
- 2023년 중소기업지원사업 현황(지자체)
- 중소벤처기업진흥공단 온라인수출플랫폼 지역별 지원현황(2022.12.31)
- 중소벤처기업진흥공단 정책자금 업종별 지원 현황(2023.12.31)
- 한국자산관리공사 중소기업 정상화 지원을 위한 협업기관 현황(2023.12.31)
- 중소기업기술정보진흥원중소기업기술개발사업 동영상 강의정보(2023.12.06)

©generated by [Project Tree Generator](https://woochanleee.github.io/project-tree-generator)
