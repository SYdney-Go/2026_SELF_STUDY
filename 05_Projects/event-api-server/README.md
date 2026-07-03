# 관제 이벤트 API 서버

Spring Boot + PostgreSQL로 만드는 **실습 프로젝트**.

> 목표: 멋진 백엔드 개발자 ❌ / **API 서버가 시스템에서 뭐 하는지 몸으로 이해** ⭕

## v1 기능 (5개)

| 기능 | Method | URL |
| --- | --- | --- |
| 이벤트 등록 | POST | `/events` |
| 이벤트 목록 조회 | GET | `/events` |
| 이벤트 상세 조회 | GET | `/events/{id}` |
| 이벤트 상태 변경 | PATCH | `/events/{id}/status` |
| 이벤트 삭제 | DELETE | `/events/{id}` |

## 진행 순서 (범위)

주차 없음. **위에서 아래로 하나씩.**

| # | 범위 | 읽을 문서 | 만들 것 | 상태 |
| --- | --- | --- | --- | --- |
| 1 | HTTP/REST | `02_Backend/02.0_Basic/01-http-rest.md` | (코드 없음) 요청/응답 이해 | 진행 중 |
| 2 | API 서버 역할 | `03_Architecture/01-api-server-role.md` | (코드 없음) 시스템 관점 | 진행 중 |
| 3 | Java 기초 | `02_Backend/02.1_Spring/Chapter01~` | 교재 예제 실습 | 진행 중 |
| 4 | 메모리 API | `02_Backend/02.0_Basic/02-layer-structure.md` | Controller + Service + List | 대기 |
| 5 | PostgreSQL | `02_Backend/02.0_Basic/03-database-postgresql.md`, `01_Data/` | Entity + Repository + JPA | 대기 |
| 6 | 예외/응답 | `02_Backend/02.0_Basic/04-exception-response.md` | GlobalExceptionHandler | 대기 |
| 7 | 인증 | `02_Backend/02.0_Basic/05-auth-basics.md` | 토큰 기본 흐름 | 대기 |
| 8 | 운영 | `02_Backend/02.0_Basic/06-operations.md` | health, log, actuator | 대기 |

## 폴더 (코드 생기면)

```text
05_Projects/event-api-server/
├── notes/              ← 기능마다 학습 기록
├── src/                ← Spring Boot 코드 (범위 4부터)
└── README.md
```

## 학습 기록

`notes/TEMPLATE.md` 복사 → 기능 만들 때마다 요청/응답/헷갈린 점 적기.

## 데이터 구조 (DB 붙일 때)

```text
events
- id, event_type, title, description, location
- severity, status, occurred_at, created_at, updated_at
```
