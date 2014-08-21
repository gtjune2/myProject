package Lookup;

public class LookupService {
	protected IDB db;
	
	public void DoLookUp() {
		this.db = getDb();	// 컴파일 오류
	}
	
	// 컴파일 오류 방지 위한 형식적인 메소드
	// 접근제한자는 public or protected 그리고 void불가, 파라미터 불가, 추상메소드 가능
	public IDB getDb() {
		return null;
	}
}
