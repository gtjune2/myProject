package Lookup;

public class DBOracle implements IDB {

	@Override
	public String doConnection() {
		// TODO Auto-generated method stub
		return "오라클 연결";
	}

	@Override
	public IDB getDb() {
		// TODO Auto-generated method stub
		return this;
	}

}
