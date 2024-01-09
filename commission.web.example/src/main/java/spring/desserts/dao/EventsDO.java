package spring.desserts.dao;

public class EventsDO {
	private int id;
	private String type;
	private String title;
	private String period;
	
	public EventsDO(int id, String type, String title, String period) {
		this.id = id;
		this.type = type;
		this.title = title;
		this.period = period;
	}
	
	public int getId() {
		return id;
	}
	
	public String getType() {
		return type;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getPeriod() {
		return period;
	}
}
