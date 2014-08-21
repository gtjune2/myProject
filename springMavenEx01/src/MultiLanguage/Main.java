package MultiLanguage;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		String strXml = "";
		ApplicationContext context = new ClassPathXmlApplicationContext("MultiLanguage.xml");
		Locale locale;
		locale = Locale.getDefault();
		System.out.println("hello:" + context.getMessage("hello", new Object[0], locale));
		System.out.println("bye:"+ context.getMessage("bye", new Object[0], locale));

	}

}
