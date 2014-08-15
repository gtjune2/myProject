package member;

public class CheerLeader implements IMember {

	public String name;
	public String team;
	public int age;
	
	public CheerLeader() {}
	public CheerLeader(String name, String team, int age) {
		super();
		this.name = name;
		this.team = team;
		this.age = age;
	}

	@Override
	public String GetMember() {
		// TODO Auto-generated method stub
		return this.name+" ( "+this.team +", " + this.age +" )"; 
	}

}
