package EventingContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class ListnerObject implements ApplicationListener<ApplicationEvent>{

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		// Event별 실행
		if (arg0 instanceof ContextRefreshedEvent) {
			//context에 접근
			ApplicationContext context = ((ContextRefreshedEvent)arg0).getApplicationContext();
			SampleBean sBean = (SampleBean)context.getBean("samplebean");
			System.out.println(sBean.getMessage());
			sBean.setMessage("ContextRefreshedEvent에서 변경한 값" + sBean.getMessage());
			System.out.println(sBean.getMessage());
		}
		//contextStartEvnet 이용시작
		else if (arg0 instanceof ContextStartedEvent) {
			System.out.println("ListnerObject :onApplicationEvent- ContextStartedEvent");
		}
		else if (arg0 instanceof ContextStoppedEvent) {
			System.out.println("ListnerObject :onApplicationEvent- ContextStoppedEvent");
		}
		else if (arg0 instanceof ContextClosedEvent) {
			System.out.println("ListnerObject :onApplicationEvent- ContextClosedEvent");
		}
		
	}

	

}
