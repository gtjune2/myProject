package member;

public class MemberService {
	private IMember iMember;
	
	public MemberService(IMember iMember) {
		this.iMember = iMember;
	}
	
	public IMember getIMember() {
		return iMember;
	}
	public void setIMember(IMember iMember) {
		this.iMember = iMember;
	}
}
