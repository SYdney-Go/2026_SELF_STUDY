# 학습 로드맵

주차 없음. **순서대로 하나씩.**

## 저장소 구조

```text
2026_SELF_STUDY/
├── 01_Data/              ← 데이터, SQL, PostgreSQL
├── 02_Backend/           ← HTTP, REST, Layer, DB, 예외, 인증
│   └── Spring/           ← Spring Boot 처음 배우기
├── 03_Architecture/      ← API 서버가 시스템에서 하는 역할
├── 04_AX_DX/
├── 05_Projects/
│   └── event-api-server/ ← 실제 코드 + 실습 기록
└── 99_Notes/
```

## 전체 순서

```text
[개념]  02_Backend/01-http-rest
        03_Architecture/01-api-server-role
              ↓
[환경]  02_Backend/Spring/00-setup  (JDK, IDE)
              ↓
[개념]  02_Backend/Spring/01-spring-boot-intro
              ↓
[코드]  05_Projects/event-api-server — 메모리 Event API (5개 CRUD)
        + 02_Backend/02-layer-structure
        + 02_Backend/Spring/02-project-structure
              ↓
[코드]  05_Projects — PostgreSQL 연결
        + 02_Backend/03-database-postgresql
        + 01_Data/ (PostgreSQL 개념)
        + 02_Backend/Spring/04-jpa-and-repository
              ↓
[코드]  05_Projects — 예외 처리, 공통 응답
        + 02_Backend/04-exception-response
              ↓
[코드]  05_Projects — 인증
        + 02_Backend/05-auth-basics
              ↓
[코드]  05_Projects — 로그, 헬스체크
        + 02_Backend/06-operations
              ↓
[맥락]  03_Architecture/02-from-api-to-system
```

## 지금 할 것

1. `02_Backend/01-http-rest.md` — HTTP/REST
2. `03_Architecture/01-api-server-role.md` — API 서버 역할
3. 체크리스트 풀고 `05_Projects/event-api-server/notes/`에 기록
4. 다음: `02_Backend/Spring/00-setup.md` → JDK 설치 → 코드 시작

## 하지 말 것 (지금)

Spring 80강, JPA 깊파, JWT, MSA, Kafka, Docker/K8s 먼저 — **나중에.**
