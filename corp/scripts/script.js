import { animate, hide } from './reveal-animation.js';

// one
gsap.timeline({
	scrollTrigger: {
		trigger: '.one',
		pin: true,
		pinSpacing: false,
		start: () => (self.offsetHeight < window.innerHeight ? 'top top' : 'bottom bottom'),
		snap: 1,
		duration: 0.5,
		markers: true,
		id: 'one',
	},
});

// two
gsap
	.timeline({
		scrollTrigger: {
			trigger: '.two',
			scrub: true,
			pin: true,
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

// three
document.addEventListener('DOMContentLoaded', () => {
	gsap.registerPlugin(ScrollTrigger);

	const reveals = gsap.utils.toArray('.reveal');
	reveals.forEach((e) => {
		hide(e);

		ScrollTrigger.create({
			trigger: e,
			markers: true,
			onEnter: () => animate(e),
			onEnterBack: () => animate(e, -1),
			onLeave: () => hide(e),
		});
	});
});
