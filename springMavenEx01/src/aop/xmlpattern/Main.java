package aop.xmlpattern;

import gss.Spring;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = (Member)Spring.getBean("xmlpattern.xml", "member");
		member.setName("홍길동");
		System.out.println("member.getName() : "+member.getName());
	}

}
