# scrollTop / scrollLeft (순수 JavaScript)

jQuery 없이 DOM API만으로 스크롤 위치를 읽고 쓰는 실습.

## jQuery vs 순수 JS

jQuery `scrollTop()` / `scrollLeft()`는 **DOM 속성을 감싼 메서드**입니다.  
순수 JS에서는 **처음부터 DOM 속성**으로 다룹니다.

| 동작 | jQuery | 순수 JavaScript |
|------|--------|-----------------|
| 요소 선택 | `$('#box-vertical')` | `document.getElementById('box-vertical')` |
| 세로 위치 읽기 | `$box.scrollTop()` | `box.scrollTop` |
| 세로 위치 쓰기 | `$box.scrollTop(120)` | `box.scrollTop = 120` |
| 가로 위치 읽기 | `$box.scrollLeft()` | `box.scrollLeft` |
| 가로 위치 쓰기 | `$box.scrollLeft(150)` | `box.scrollLeft = 150` |
| 스크롤 이벤트 | `$box.on('scroll', fn)` | `box.addEventListener('scroll', fn)` |
| 텍스트 갱신 | `$('#read').text(n)` | `el.textContent = n` |
| data 속성 | `$(btn).data('action')` | `btn.dataset.action` |
| DOM 준비 후 실행 | `$(function () { ... })` | `document.addEventListener('DOMContentLoaded', ...)` |

**하는 일은 같고, 문법만 다릅니다.**

### 맨 아래 / 맨 오른쪽

```javascript
box.scrollTop = box.scrollHeight - box.clientHeight;
box.scrollLeft = box.scrollWidth - box.clientWidth;
```

jQuery에서는 `$target[0].scrollHeight`처럼 `[0]`으로 DOM을 꺼내야 하지만, 순수 JS는 처음부터 DOM 요소를 쓰므로 **불필요**합니다.

---

## 스크롤이 생기는 CSS

```css
.scroll-box {
  height: 160px;
  overflow: auto;
}
```

내용 높이(또는 너비) > 보이는 영역 → 스크롤 가능.

---

## 실무에서 쓰는 경우

| 기능 | 순수 JS 예 |
|------|------------|
| 채팅 맨 아래 | `chat.scrollTop = chat.scrollHeight` |
| 무한 스크롤 | `scroll` 이벤트에서 `scrollTop + clientHeight >= scrollHeight - 100` |
| 맨 위로 | `window.scrollTo({ top: 0, behavior: 'smooth' })` |
| 약관 끝까지 읽음 | `box.scrollTop + box.clientHeight >= box.scrollHeight` |
| 관리자 그리드 가로 이동 | `container.scrollLeft = offset` |

---

## 코드 포인트

- `getElementById` — ID로 요소 선택
- `addEventListener('scroll', ...)` — 스크롤 시 숫자 갱신
- `querySelector(button.dataset.target)` — `data-target`으로 대상 찾기
- `querySelectorAll('.controls')` — 패널마다 버튼 영역이 있으면 각각 이벤트 연결
