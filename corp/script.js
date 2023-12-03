gsap.timeline({
	scrollTrigger: {
		trigger: '.one',
		pin: true,
		pinSpacing: false,
		start: () => (self.offsetHeight < window.innerHeight ? 'top top' : 'bottom bottom'),
		snap: {
			snapTo: (progress, self) => {
				const starts = self.start;
				const snapScroll = gsap.utils.snap(starts, self.scroll());
				return gsap.utils.normalize(0, ScrollTrigger.maxScroll(window), snapScroll);
			},
		},
		duration: 0.5,
		markers: true,
		id: 'one',
	},
});

gsap
	.timeline({
		scrollTrigger: {
			trigger: '.two',
			scrub: true,
			pin: true,
			pinSpacing: false,
			start: 'top top',
			end: '+=100%',
		},
		markers: true,
		id: 'two',
	})
	.from('.line', {
		scaleX: 0,
		transformOrigin: 'left center',
		ease: 'none',
	});
