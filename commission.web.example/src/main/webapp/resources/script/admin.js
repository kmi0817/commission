document.querySelectorAll(".event-delete").forEach((btn) => {
	btn.addEventListener("click", (event) => {
	
		const confirmed = confirm("해당 이벤트를 삭제하시겠습니까?");
		
		if (confirmed) {
			const eventId = event.target.id;
		
			fetch(`/event/${eventId}`, {
				method: "DELETE"
			})
			.then((res) => {
				location.reload();
			})
			.catch((err) => {
				alert(err);
			}); 
		} 
	});
});