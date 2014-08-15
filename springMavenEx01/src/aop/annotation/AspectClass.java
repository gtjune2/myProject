package aop.annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectClass {
	@Pointcut("execution(public * aop.annotation..*(..))")
	private void doPointcut() {}
	
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void doAfterReturning(String name, String returnString) {
		System.out.println("name : "+name+", returnString : "+returnString);
	}
	
	@Before("doPointcut()")
	public void doBefore() {
		System.out.println("doBefore 실행");
	}
}
