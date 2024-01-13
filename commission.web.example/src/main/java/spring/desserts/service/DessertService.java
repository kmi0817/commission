package spring.desserts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.desserts.domain.Dessert;
import spring.desserts.repository.Dessert.DessertRepository;

@Service
public class DessertService {

	private final DessertRepository dessertRepository;
	
	public DessertService(DessertRepository dessertRepository) {
		this.dessertRepository = dessertRepository;
	}
	
	public Dessert findOne(Long dessertId) {
		return dessertRepository.findById(dessertId)
				.orElseThrow(() -> new IllegalStateException("존재하지 않는 디저트입니다."));
	}
	
	public List<Dessert> findDesserts() {
		return dessertRepository.findAll();
	}
	
}
