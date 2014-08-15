package Lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LookupMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("lookupContext.xml");
		LookupService service = (LookupService)context.getBean("Lookupservice");
		service.DoLookUp();
		System.out.println(service.db.doConnection());
	}

}
