package aop.xmlpattern;

public class Member {
	String name = "홍길동";
	
	public String getName() {
		for (int i=0; i<1000000000; i++) {
			
		}
		return name;
	}
	public void setName(String name) {
		for (int i=0; i<1000000000; i++) {
			
		}
		this.name = name;
	}
}
