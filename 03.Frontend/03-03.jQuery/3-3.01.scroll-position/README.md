# scrollTop / scrollLeft (jQuery)

## API 정리

### scrollTop()

| 호출 | 동작 |
|------|------|
| `$('.box').scrollTop()` | **읽기** — 요소 안에서 위에서부터 몇 px 스크롤했는지 |
| `$('.box').scrollTop(120)` | **쓰기** — 세로 스크롤 위치를 120px로 이동 |

### scrollLeft()

| 호출 | 동작 |
|------|------|
| `$('.box').scrollLeft()` | **읽기** — 왼쪽에서부터 몇 px 스크롤했는지 |
| `$('.box').scrollLeft(150)` | **쓰기** — 가로 스크롤 위치를 150px로 이동 |

### 공통

- **인자 없음** → getter (현재 위치 반환)
- **숫자 인자** → setter (해당 위치로 스크롤)
- 스크롤이 생기지 않는 요소(내용이 넘치지 않음)에서는 보통 `0`
- **창 전체** 스크롤: `$(window).scrollTop()` / `$(document).scrollTop()`

### 스크롤이 생기는 CSS

```css
.scroll-box {
  height: 160px;
  overflow: auto;
}
```

### 맨 아래 / 맨 오른쪽으로 이동

```javascript
$box.scrollTop($box[0].scrollHeight - $box[0].clientHeight);
$box.scrollLeft($box[0].scrollWidth - $box[0].clientWidth);
```

- `scrollHeight` — 전체 내용 높이
- `clientHeight` — 보이는 높이
- 차이 = 최대 `scrollTop`

---

## 실무에서 쓰는 경우

### scrollTop — 세로

| 요청 / 기능 | 구현 예 |
|-------------|---------|
| **채팅·CS 상담** — 새 메시지 올 때 맨 아래로 | 메시지 추가 후 `$chat.scrollTop($chat[0].scrollHeight)` |
| **무한 스크롤** — 목록 끝 근처면 다음 페이지 로드 | `scroll` 이벤트에서 `scrollTop + clientHeight >= scrollHeight - 100` 이면 API 호출 |
| **맨 위로 버튼** | `scrollTop() > 300`일 때 버튼 표시, 클릭 시 `scrollTop(0)` |
| **폼 검증** — 첫 번째 에러 필드로 이동 | `$('.error').first().closest('.panel').scrollTop(오프셋)` |
| **약관 동의** — 끝까지 읽었는지 확인 | `scrollTop + clientHeight >= scrollHeight`일 때만 동의 버튼 활성화 |
| **뒤로가기** — 이전 스크롤 위치 복원 | 페이지 이탈 전 `sessionStorage`에 `scrollTop` 저장, 재진입 시 복원 |

### scrollLeft — 가로

| 요청 / 기능 | 구현 예 |
|-------------|---------|
| **관리자 테이블** — 컬럼 많은 엑셀형 그리드 | 가로 스크롤 영역에서 특정 컬럼이 보이도록 `scrollLeft` 조정 |
| **캘린더·타임라인** — 오늘 날짜 열로 이동 | `$timeline.scrollLeft(오늘칸offsetLeft)` |
| **탭/칩 목록** — 선택 탭이 잘리면 가로 스크롤 | 활성 탭이 보이도록 `scrollLeft` 계산 |

### 둘 다

| 요청 / 기능 | 구현 예 |
|-------------|---------|
| **대형 대시보드** — 특정 셀(행·열)로 포커스 | `scrollTop` + `scrollLeft` 동시 설정 |
| **지도·캔버스 UI** — 특정 좌표 영역 표시 | 스크롤 컨테이너 기준으로 두 값 조합 |
