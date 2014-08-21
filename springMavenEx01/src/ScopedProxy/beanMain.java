package ScopedProxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("ScopedProxy.xml");
		DoPlayGame doplaygame = (DoPlayGame)context.getBean("doplaygame");
		doplaygame.doGame();
		doplaygame.doGame();
		doplaygame.doGame();
		System.out.println("----------------------------------------------------------");
		FootBall football = (FootBall)context.getBean("football");
		football.Play();
		football.Play();
		football.Play();
		System.out.println("----------------------------------------------------------");
		BasketBall basketball = (BasketBall)context.getBean("basketball");
		basketball.Play();
		basketball.Play();
		basketball.Play();
		System.out.println("----------------------------------------------------------");
	}

}
