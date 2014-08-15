package beanLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCycleObject2 implements ApplicationContextAware, BeanNameAware {

	private String objectName;
	private ApplicationContext context;
	
	public void start() {
		System.out.println("LifeCycleObject2 - start()");
	}
	public void end() {
		System.out.println("LifeCycleObject2 - end()");
	}
	
	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("LifeCycleObject2 - setBeanName()" + arg0);
		this.objectName = arg0;
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("LifeCycleObject2 - setApplicationContext()" + arg0);
		this.context = arg0;
	}
	
	public void BloodMessage() {
		System.out.println("LifeCycleObject2 - BloodMessage()");
		OtherObjectClass other = (OtherObjectClass)this.context.getBean("otherobjectclass");
		other.otherMsg();
	}
	
}
