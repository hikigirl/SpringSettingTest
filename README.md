# Project

- new - spring legacy project - spring mvc project
- project name: `Project`
- root package: `com.test.project`

---

#### 자바 버전과 pom.xml 수정

- 프로젝트 우클릭 -> Project Facets -> Java 11
- properties 태그에 있는 java-version 11
- 그 아래 스프링 버전 5.0.7.RELEASE로
- 맨 아래쪽 plugin 태그 -> maven plugin 내부
  - configuration 태그 내부 source, target 내부 11로 변경
- 의존성 추가 필요

---

#### MyBatis 세팅
SecurityTest의
- pom.xml 복붙
- root-context.xml

#### Tiles 세팅
TilesTest의
- pom.xml 복붙
- servlet-context 복붙
- tiles.xml 복붙

#### Security 세팅
SecurityTest의
- pom.xml 복붙(의존성)
- web.xml에 필터작업(인코딩 필터도 겸사겸사 복사)
- security-context.xml
- Handler 복사

#### DB 설계
- script.sql
- security 설계를 위해 일단 회원 테이블 스키마부터 설계
- UserDTO.java
- CustomUser.java

#### MyBatis 세팅 마무리
- 단위테스트

#### Tiles 세팅
- views/layout/main.jsp
- com.test.project.controller.MainController.java
- tiles.xml

#### 파일업로드 세팅
FileTest의
- 의존성은 따로 없음(pom.xml)
- web.xml