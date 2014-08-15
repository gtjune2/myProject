package annotation.required;

import gss.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext context = new ClassPathXmlApplicationContext("required.xml");
//		RequiredBean requiredBean = (RequiredBean)context.getBean("requiredBean");
		
		RequiredBean requiredBean = (RequiredBean)Spring.getBean("required.xml", "requiredBean");
		System.out.println(requiredBean.getName());
	}

}
