package CollectionGen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;

public class CollectionTestService {
	public ArrayList<String> member;
	public HashMap<String, String> memberMap;
	public Properties memberProp;
	public HashSet<String> memberSet;
	
	public void setMemberProp(Properties memberProp) {
		this.memberProp = memberProp;
	}

	public void setMemberSet(HashSet<String> memberSet) {
		this.memberSet = memberSet;
	}

	public void setMember(ArrayList<String> member) {
		this.member = member;
	}

	public void setMemberMap(HashMap<String, String> memberMap) {
		this.memberMap = memberMap;
	}
	
	
}
