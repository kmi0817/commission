package spring.desserts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.desserts.domain.Event;
import spring.desserts.repository.Event.EventRepository;

@Service
public class EventService {

	private final EventRepository eventRepository;
	
	public EventService(EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}
	
	public Event create(Event event) {
		return eventRepository.save(event);
	}
	
	public Event findOne(Long eventId) {
		return eventRepository.findById(eventId)
				.orElseThrow(() -> new IllegalStateException("존재하지 않는 이벤트입니다."));
	}
	
	public List<Event> findEvents() {
		return eventRepository.findAll();
	}
	
	public Long remove(Long eventId) {
		return eventRepository.deleteById(eventId);
	}
	
}
