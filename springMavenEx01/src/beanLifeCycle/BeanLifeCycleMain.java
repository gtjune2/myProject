package beanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycle.xml");
		LifeCycleObject2 bean = (LifeCycleObject2)context.getBean("lifecycleobject2");
		bean.BloodMessage();
		context.close();
	}

}
