# 범위 1: HTTP + REST

## 목표

코드를 쓰기 전에, **클라이언트 ↔ 서버가 어떻게 대화하는지** 먼저 이해합니다.

```text
클라이언트 요청 → 서버 확인 → 비즈니스 로직 → DB 조회/저장 → JSON 응답
```

## 1. HTTP Request (요청)

클라이언트가 서버에 보내는 메시지입니다. 크게 4가지만 보면 됩니다.

| 구성             | 설명                    | 예시                               |
| -------------- | --------------------- | -------------------------------- |
| **Method**     | 무슨 행동을 할지             | GET, POST, PATCH, DELETE         |
| **URL (Path)** | 어떤 자원에 접근할지           | `/events`, `/events/1`           |
| **Header**     | 부가 정보                 | `Content-Type: application/json` |
| **Body**       | 보낼 데이터 (POST/PATCH 등) | JSON 객체                          |

### Method — 이번 프로젝트에서 쓸 것만

| Method | 의미 | 관제 이벤트 API 예시 |
| --- | --- | --- |
| **GET** | 조회 (읽기) | 이벤트 목록/상세 보기 |
| **POST** | 생성 | 새 이벤트 등록 |
| **PATCH** | 일부 수정 | 이벤트 상태만 변경 (NEW → IN_PROGRESS) |
| **DELETE** | 삭제 | 이벤트 삭제 |

> PUT은 "전체 교체", PATCH는 "일부 수정". 상태만 바꿀 때는 PATCH가 맞습니다.

---

## 2. HTTP Response (응답)

서버가 클라이언트에게 돌려주는 메시지입니다.

| 구성 | 설명 | 예시 |
| --- | --- | --- |
| **Status Code** | 결과 상태 (숫자) | 200, 201, 404, 500 |
| **Header** | 부가 정보 | `Content-Type: application/json` |
| **Body** | 응답 데이터 | JSON 객체 |

### Status Code — 자주 쓰는 것

| 코드 | 의미 | 언제? |
| --- | --- | --- |
| **200** | OK | 조회/수정/삭제 성공 |
| **201** | Created | 새 리소스 생성 성공 (POST) |
| **400** | Bad Request | 요청 형식이 잘못됨 (필수값 누락 등) |
| **404** | Not Found | 해당 ID의 이벤트가 없음 |
| **500** | Internal Server Error | 서버 내부 오류 |

---

## 3. REST API 기본 규칙

REST는 "URL = 자원, Method = 행동"으로 API를 설계하는 방식입니다.

```text
/events        → 이벤트라는 "자원"
GET  /events   → 목록 조회
POST /events   → 새로 만들기
GET  /events/1 → id=1 상세 조회
PATCH /events/1/status → id=1의 status만 변경
DELETE /events/1 → id=1 삭제
```
