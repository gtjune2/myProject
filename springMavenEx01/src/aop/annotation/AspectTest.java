package aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;

@Aspect
public class AspectTest {
	@Pointcut("execution(public * aop.annotation..*(..))")
	private void profileTarget() {}
	
	@Around("profileTarget()")
	public Object trace(ProceedingJoinPoint jointPoint) {
		String methodName = jointPoint.getSignature().toShortString();
		StopWatch sw = new StopWatch();
		sw.start(methodName);
		System.out.println("[LOG] METHOD : "+methodName+" is calling");
		System.out.println("[패키지경로를 포함한 호출 메서드이름] joinPoint.getTarget() : "+jointPoint.getTarget());
		Object objects[] = jointPoint.getArgs();
		for (int i=0; i<objects.length; i++) {
			System.out.println("[호출 메서드의 인수 "+i+"] objects[i] "+objects[i]);
		}
		System.out.println("[호출 메서드이름] : "+jointPoint.getSignature().getName());
		
		Object objRtn = null;
		
		try {
			objRtn = jointPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sw.stop();
			System.out.println("[처리시간] sw.getTotalTimeMillis() : "+sw.getTotalTimeMillis()+"m초");
		}
		
		return objRtn;
	}
}
