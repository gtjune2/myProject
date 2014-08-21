package annotation.qualifier;

import gss.Spring;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QualifierBean qualifierBean = (QualifierBean)Spring.getBean("qualifier.xml", "qualifierBean");
		System.out.println(qualifierBean.getAlist());

	}

}
