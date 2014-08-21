package EventingContext;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main : main");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"EventingContext.xml");
		context.start();
		context.stop();
		context.start();
		context.close();
	}

}
