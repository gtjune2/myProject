package annotation.component;

import org.springframework.stereotype.Component;

@Component("productBean")
public class Product {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
