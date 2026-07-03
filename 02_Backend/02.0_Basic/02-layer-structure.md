# 범위 2: Layer 구조 (Controller / Service / Repository)

> 아직 작성 전. 프로젝트에서 메모리 API를 만들 때 같이 채웁니다.

## 미리 알아둘 것

```text
EventController   → HTTP 요청/응답만 담당
EventService      → 비즈니스 로직 (상태 변경 규칙 등)
EventRepository   → 데이터 저장/조회 (나중에 DB)
```

**왜 나누나?** 한 파일에 다 넣으면 처음엔 빠르지만, 기능이 늘수록 수정·테스트·역할 파악이 어려워집니다.

## 핵심 질문 (나중에 답할 것)

- Controller가 DB에 직접 접근하면 안 되는 이유는?
- Service 없이 Controller → Repository만 쓰면 언제 문제가 되나?
- DTO와 Entity의 차이는?
