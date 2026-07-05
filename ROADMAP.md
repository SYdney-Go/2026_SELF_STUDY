# 학습 로드맵

주차 없음. **순서대로 하나씩.**

## 저장소 구조

```text
2026_SELF_STUDY/
├── 01_Data/                    ← 데이터, SQL, PostgreSQL (예정)
├── 02_Backend/
│   ├── 02.0_Basic/             ← Java 기초 + HTTP, REST, Layer, DB, 예외, 인증, 운영
│   │   ├── 00-java/            ← Chapter01~19 (md + src/ 실습)
│   │   ├── 01-http-rest.md
│   │   └── ...
│   ├── 02.1_Spring/            ← Spring Framework / Boot (예정)
│   └── 02.2_Flask/             ← Flask (예정)
├── 03_Architecture/            ← API 서버가 시스템에서 하는 역할
├── 04_AX_DX/                   ← (예정)
├── 05_Projects/
│   └── event-api-server/       ← 실제 코드 + 실습 기록
└── 99_Notes/                   ← (예정)
```

## 전체 순서

```text
[개념]  02_Backend/02.0_Basic/01-http-rest.md
        03_Architecture/01-api-server-role.md
              ↓
[Java]  02_Backend/02.0_Basic/00-java/Chapter01~  (교재 예제 실습)
              ↓
[코드]  05_Projects/event-api-server — 메모리 Event API (5개 CRUD)
        + 02_Backend/02.0_Basic/02-layer-structure.md
              ↓
[코드]  05_Projects — PostgreSQL 연결
        + 02_Backend/02.0_Basic/03-database-postgresql.md
        + 01_Data/ (PostgreSQL 개념)
              ↓
[코드]  05_Projects — 예외 처리, 공통 응답
        + 02_Backend/02.0_Basic/04-exception-response.md
              ↓
[코드]  05_Projects — 인증
        + 02_Backend/02.0_Basic/05-auth-basics.md
              ↓
[코드]  05_Projects — 로그, 헬스체크
        + 02_Backend/02.0_Basic/06-operations.md
              ↓
[맥락]  03_Architecture/02-from-api-to-system.md
```

## 지금 할 것

1. `02_Backend/02.0_Basic/01-http-rest.md` — HTTP/REST
2. `03_Architecture/01-api-server-role.md` — API 서버 역할
3. `02_Backend/02.0_Basic/00-java/Chapter01~` — Java 기초 실습
4. 체크리스트 풀고 `05_Projects/event-api-server/notes/`에 기록

## 하지 말 것 (지금)

Spring 80강, JPA 깊파, JWT, MSA, Kafka, Docker/K8s 먼저 — **나중에.**
