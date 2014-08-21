package annotation.resource;

import java.util.ArrayList;

import javax.annotation.Resource;

public class ResourceBean {
	@Resource(name="heros")
	ArrayList<String> heros;
	
	@Resource(name="people")
	ArrayList<String> people;

	public ArrayList<String> getHeros() {
		return heros;
	}

	public void setHeros(ArrayList<String> heros) {
		this.heros = heros;
	}

	public ArrayList<String> getPeople() {
		return people;
	}

	public void setPeople(ArrayList<String> people) {
		this.people = people;
	}
	
}
