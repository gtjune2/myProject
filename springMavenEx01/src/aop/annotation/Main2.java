package aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AopConfiguration.class);
		Member member = context.getBean("member", Member.class);
		member.setName("유라");
		System.out.println("member.getName() : "+member.getName());
	}

}
