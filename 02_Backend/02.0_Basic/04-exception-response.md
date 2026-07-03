# 범위 4: 예외 처리 + 응답 규격

> 예외 처리 범위에서 채웁니다.

## 좋은 에러 응답 예시

```json
{
  "code": "EVENT_NOT_FOUND",
  "message": "해당 이벤트를 찾을 수 없습니다.",
  "status": 404
}
```

## 핵심 질문 (나중에 답할 것)

- GlobalExceptionHandler는 어디서 동작하나?
- Validation 실패는 400으로 어떻게 통일하나?
