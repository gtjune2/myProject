package aop.annotation;

import gss.Spring;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = (Member)Spring.getBean("aopAnnotation.xml", "member");
		member.setName("강성조");
		System.out.println("member.getName() : "+member.getName());
	}

}
