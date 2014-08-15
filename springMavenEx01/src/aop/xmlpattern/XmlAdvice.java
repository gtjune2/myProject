package aop.xmlpattern;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class XmlAdvice {

	// Object obj : 실행되는 메서드의 리턴값
	// <aop:after-returning>에서 returning="obj" 의 obj와 이름이 같아야 한다
	public void afterReturning(Object obj) {
		if (obj != null) {
			System.out.println("obj.toString() : "+obj.toString());
		}
	}
	
	public Object trace(ProceedingJoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		StopWatch sw = new StopWatch();
		sw.start("sw.start : "+methodName);
		System.out.println("[LOG] METHOD : "+methodName+"is calling");
		Object objRtn = null;
		
		try {
			// 메서드가 실행되는 시점
			objRtn = joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sw.stop();
			System.out.println("[LOG] METHOD : "+methodName+"is calling");
			System.out.println("[LOG] 처리시간 : "+sw.getTotalTimeMillis()+"Millis Second");
		}
		
		return objRtn;
	}
}
