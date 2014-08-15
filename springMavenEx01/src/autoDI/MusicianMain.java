package autoDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicianMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		MusicianService service = (MusicianService)context.getBean("musicianService");
		
		System.out.println(service.musicians.song.name);
		
		for (String name : service.musicians.musicians) {
			System.out.println(name);
		}
	}

}
