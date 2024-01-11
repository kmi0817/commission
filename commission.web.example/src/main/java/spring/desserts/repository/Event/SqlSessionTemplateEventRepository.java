package spring.desserts.repository.Event;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import spring.desserts.domain.Event;

@Repository
public class SqlSessionTemplateEventRepository implements EventRepository {
	
	@Inject
	@Named("sqlSessionTemplate")
	private SqlSessionTemplate sqlSession;
	
	@Override
	public Event save(Event event) {
		sqlSession.insert("Event.save", event);
		return event;
	}
	
	@Override
	public Optional<Event> findById(Long id) {
		Event event = sqlSession.selectOne("Event.findById", id);
		return Optional.ofNullable(event);
	}
	
	@Override
	public List<Event> findAll() {
		return sqlSession.selectList("Event.findAll");
	}
	
	@Override
	public Long deleteById(Long id) {
		return (long) sqlSession.delete("Event.deleteById", id);
	}

}
