package aop.annotation;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AopConfiguration {
	@Bean
	public Member member() {
		return new Member();
	}
	
	@Bean
	public AspectClass aspectClass() {
		return new AspectClass();
	}
	
	@Bean
	public AnnotationAwareAspectJAutoProxyCreator annotationAwareAspectJAutoProxyCreator() {
		return new AnnotationAwareAspectJAutoProxyCreator();
	}
}
