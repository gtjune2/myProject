package member;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		MemberService memberService = (MemberService)appContext.getBean("memberPlayer");
		
		memberService.setIMember(new Player("김동주", 18));
		System.out.println(memberService.getIMember().GetMember());
	}

}
