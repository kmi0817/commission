package spring.desserts.repository.Dessert;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import org.mybatis.spring.SqlSessionTemplate;

import spring.desserts.domain.Dessert;

public class SqlSessionTemplateDessertRepository implements DessertRepository {
	
	@Inject
	@Named("sqlSessionTemplate")
	private SqlSessionTemplate sqlSession;
	
	@Override
	public Optional<Dessert> findById(Long id) {
		Dessert dessert = sqlSession.selectOne("Dessert.findById", id);
		return Optional.ofNullable(dessert);
	}
	
	@Override
	public List<Dessert> findAll() {
		return sqlSession.selectList("Dessert.findAll");
	}

}
