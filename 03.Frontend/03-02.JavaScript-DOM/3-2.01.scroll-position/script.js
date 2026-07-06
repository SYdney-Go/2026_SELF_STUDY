document.addEventListener('DOMContentLoaded', function () {
	var boxVertical = document.getElementById('box-vertical');
	var boxBoth = document.getElementById('box-both');
	var readVertical = document.getElementById('read-vertical');
	var readTopBoth = document.getElementById('read-top-both');
	var readLeftBoth = document.getElementById('read-left-both');

	// ── 읽기: element.scrollTop / element.scrollLeft (속성) ──
	function updateVerticalReadout() {
		readVertical.textContent = boxVertical.scrollTop;
	}

	function updateBothReadout() {
		readTopBoth.textContent = boxBoth.scrollTop;
		readLeftBoth.textContent = boxBoth.scrollLeft;
	}

	boxVertical.addEventListener('scroll', updateVerticalReadout);
	boxBoth.addEventListener('scroll', updateBothReadout);

	updateVerticalReadout();
	updateBothReadout();

	// ── 쓰기: element.scrollTop = n / element.scrollLeft = n ──
	document.querySelectorAll('.controls').forEach(function (controls) {
		controls.addEventListener('click', function (event) {
			var button = event.target.closest('button[data-action]');
			if (!button) {
				return;
			}

			var target = document.querySelector(button.dataset.target);
			var action = button.dataset.action;

			switch (action) {
				case 'top':
					target.scrollTop = 0;
					break;

				case 'middle-v':
					target.scrollTop = 120;
					break;

				case 'bottom-v':
					target.scrollTop = target.scrollHeight - target.clientHeight;
					break;

				case 'top-left':
					target.scrollTop = 0;
					target.scrollLeft = 0;
					break;

				case 'scroll-right':
					target.scrollLeft = 150;
					break;

				case 'scroll-down':
					target.scrollTop = 100;
					break;

				case 'bottom-right':
					target.scrollTop = target.scrollHeight - target.clientHeight;
					target.scrollLeft = target.scrollWidth - target.clientWidth;
					break;
			}
		});
	});
});
