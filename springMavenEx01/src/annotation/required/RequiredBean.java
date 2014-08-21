package annotation.required;

import org.springframework.beans.factory.annotation.Required;

public class RequiredBean {
	private String name;

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}
	
	
}
