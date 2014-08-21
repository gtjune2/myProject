package member;

public class Player implements IMember {
	
	public String name;
	public int age;
	
	public Player() {}
	public Player(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String GetMember() {
		// TODO Auto-generated method stub
		return this.name+" ( "+ this.age +" )"; 
	}

}
