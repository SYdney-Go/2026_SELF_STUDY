$(function () {
	var $boxVertical = $('#box-vertical');
	var $boxBoth = $('#box-both');

	// ── 읽기(getter): scrollTop() / scrollLeft() — 인자 없음 ──
	function updateVerticalReadout() {
		var top = $boxVertical.scrollTop();
		$('#read-vertical').text(top);
	}

	function updateBothReadout() {
		$('#read-top-both').text($boxBoth.scrollTop());
		$('#read-left-both').text($boxBoth.scrollLeft());
	}

	// 스크롤할 때마다 현재 위치 갱신
	$boxVertical.on('scroll', updateVerticalReadout);
	$boxBoth.on('scroll', updateBothReadout);

	updateVerticalReadout();
	updateBothReadout();

	// ── 쓰기(setter): scrollTop(n) / scrollLeft(n) — 인자 있음 ──
	$('.controls button').on('click', function () {
		var $target = $($(this).data('target'));
		var action = $(this).data('action');

		switch (action) {
			case 'top':
				$target.scrollTop(0);
				break;

			case 'middle-v':
				$target.scrollTop(120);
				break;

			case 'bottom-v':
				// scrollHeight(전체 내용 높이) - clientHeight(보이는 높이) = 최대 scrollTop
				$target.scrollTop($target[0].scrollHeight - $target[0].clientHeight);
				break;

			case 'top-left':
				$target.scrollTop(0).scrollLeft(0);
				break;

			case 'scroll-right':
				$target.scrollLeft(150);
				break;

			case 'scroll-down':
				$target.scrollTop(100);
				break;

			case 'bottom-right':
				$target
					.scrollTop($target[0].scrollHeight - $target[0].clientHeight)
					.scrollLeft($target[0].scrollWidth - $target[0].clientWidth);
				break;
		}
	});
});
