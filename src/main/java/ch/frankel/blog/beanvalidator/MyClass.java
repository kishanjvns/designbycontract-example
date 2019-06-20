package ch.frankel.blog.beanvalidator;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.springframework.validation.annotation.Validated;

@Validated
public class MyClass {

	public String returnString() {
		
		return null;
	}

	@NotNull
	public String returnStringNotNull() {
		
		return null;
	}
	
	public void doSomething(String string) {
		System.out.println(string);
	}
	
	public void doSomethingNotNull(@NotNull String string) {
		System.out.println(string);
	}
	
	public void doSomethingWithEmail(@Email String email) {
		System.out.println(email);
	}
}
