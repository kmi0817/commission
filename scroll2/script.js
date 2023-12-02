const t1 = gsap.timeline({
	scrollTrigger: {
		trigger: '.two',
		start: '0% 95%',
		end: '70% 50%',
		scrub: 1, // reverse animation
		markers: true,
	},
});

t1.to(
	'#icecream3',
	{
		width: '25%',
		top: '105%',
		left: '12%',
	},
	'best'
);

t1.to(
	'#candy1',
	{
		width: '5%',
		top: '125%',
		left: '53%',
	},
	'best'
);

t1.to(
	'#americano',
	{
		rotate: '-150deg',
	},
	'best'
);

const t2 = gsap.timeline({
	scrollTrigger: {
		trigger: '.three',
		start: '0% 95%',
		end: '20% 50%',
		scrub: 1,
		markers: true,
	},
});

t2.from(
	'#strawberry',
	{
		rotate: '-90deg',
		left: '-50%',
		top: '10%',
	},
	'popular'
);

t2.from(
	'#cake1',
	{
		rotate: '-90deg',
		top: '10%',
	},
	'popular'
);

t2.from(
	'#lime',
	{
		rotate: '90deg',
		right: '-50%',
		top: '10%',
	},
	'popular'
);

t2.from(
	'#cupcake3',
	{
		rotate: '90deg',
		top: '10%',
	},
	'popular'
);

t2.to(
	'#icecream3',
	{
		width: '14%',
		left: '43%',
		top: '205%',
	},
	'popular'
);
