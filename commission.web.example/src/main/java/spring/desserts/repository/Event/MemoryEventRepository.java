package spring.desserts.repository.Event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import spring.desserts.domain.Event;

public class MemoryEventRepository implements EventRepository {

	private final Map<Long, Event> store = new HashMap<>();
	private static long sequence = 0L;
	
	public MemoryEventRepository() {
		Event event = new Event();
		event.setId(++sequence);
		event.setTitle("임시 제목");
		event.setType("임시 종류");
		event.setPeriod("임시 기간");
		store.put(event.getId(), event);
	}
	

	@Override
	public Event save(Event event) {
		store.put(++sequence, event);
		return event;
	}
	
	@Override
	public Optional<Event> findById(Long id) {
		return Optional.ofNullable(store.get(id));
	}
	
	@Override
	public List<Event> findAll() {
		return new ArrayList<>(store.values());
	}
	
	@Override
	public Long deleteById(Long id) {
		store.remove(id);
		return id;
	}
	
}
