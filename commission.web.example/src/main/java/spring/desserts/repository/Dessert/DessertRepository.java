package spring.desserts.repository.Dessert;

import java.util.List;
import java.util.Optional;

import spring.desserts.domain.Dessert;

public interface DessertRepository {
	
	Optional<Dessert> findById(Long id);
	List<Dessert> findAll();
	
}
