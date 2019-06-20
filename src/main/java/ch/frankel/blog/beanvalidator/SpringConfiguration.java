package ch.frankel.blog.beanvalidator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@Configuration
public class SpringConfiguration {

	@Bean
	public MyClass myClass() {

		return new MyClass();
	}
	
	@Bean
	public static MethodValidationPostProcessor methodValidationPostProcessor() {
		
		return new MethodValidationPostProcessor();
	}
}
