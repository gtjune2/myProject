package annotation.component;

import org.springframework.stereotype.Component;

@Component
public class Parent {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
