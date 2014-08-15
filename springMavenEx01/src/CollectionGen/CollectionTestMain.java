package CollectionGen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		CollectionTestService service = (CollectionTestService)context.getBean("collectionService");
		
		for (String member : service.member) {
			System.out.println(member);
		}
		
		System.out.println("Map -----------------");
		for (String key : service.memberMap.keySet()) {
			System.out.println(service.memberMap.get(key));
		}
		
		System.out.println("Properties -----------------");
		for (Object key : service.memberProp.keySet()) {
			System.out.println(service.memberProp.get(key));
		}
		
		System.out.println("Set -----------------");
		for (String name : service.memberSet) {
			System.out.println(name);
		}
	}

}
