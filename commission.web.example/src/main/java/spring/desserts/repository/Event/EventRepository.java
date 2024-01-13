package spring.desserts.repository.Event;

import java.util.List;
import java.util.Optional;

import spring.desserts.domain.Event;

public interface EventRepository {

	Event save(Event event);
	Optional<Event> findById(Long id);
	List<Event> findAll();
	Long deleteById(Long id);
	
}
