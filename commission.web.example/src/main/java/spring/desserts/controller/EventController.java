package spring.desserts.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.desserts.domain.Event;
import spring.desserts.service.EventService;

@Controller
public class EventController {
	
	private final EventService eventService;
	
	public EventController(EventService eventService) {
		this.eventService = eventService;
	}
	
	@GetMapping("/event")
	public String event(Model model) {
		List<Event> events = eventService.findEvents();
		model.addAttribute("events", events);
		return "event";
	}
	
	@PostMapping("/event")
	public String create(EventForm form) {
		Event event = new Event();
		event.setTitle(form.getTitle());
		event.setType(form.getType());
		event.setPeriod(form.getPeriod());
		
		eventService.create(event);
		
		return "redirect:/event/admin";
	}
	
	@DeleteMapping("/event/{id}")
	public void remove(@PathVariable("id") Long id) {
		eventService.remove(id);
	}
	
	@GetMapping("/event/admin")
	public String eventAdmin(@RequestParam(name = "offset", required = false, defaultValue = "1") int offset, @RequestParam(name = "limit", required = false, defaultValue = "7") int limit, Model model) {
		System.out.println("offset: " + offset + ", limit: " + limit);
		List<Event> events = eventService.findEvents();
		
		events.forEach(event -> System.out.println(event.getTitle()));
		
		int from = (offset - 1) * limit;
		int to = Math.min(from + limit,  events.size());
		int page = (int) Math.ceil((double) events.size() / limit);
		
		List<Event> subEvents = events.subList(from, to);
		model.addAttribute("page", page);
		model.addAttribute("events", subEvents);
		return "admin";
	}
	
}
