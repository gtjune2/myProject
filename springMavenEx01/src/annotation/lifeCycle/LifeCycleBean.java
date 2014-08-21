package annotation.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class LifeCycleBean {
	@Autowired
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public void init() {
		
	}
	
	@PreDestroy
	public void close() {
		
	}
	
}
