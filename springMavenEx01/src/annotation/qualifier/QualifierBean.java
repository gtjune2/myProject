package annotation.qualifier;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class QualifierBean {
	@Autowired
	@Qualifier("hero")
	ArrayList<String> alist;

	public ArrayList<String> getAlist() {
		return alist;
	}

	public void setAlist(ArrayList<String> alist) {
		this.alist = alist;
	}
}
