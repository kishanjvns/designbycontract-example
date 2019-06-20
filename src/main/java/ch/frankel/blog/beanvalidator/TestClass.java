package ch.frankel.blog.beanvalidator;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Locale.setDefault(Locale.CANADA_FRENCH);
		MyClass myClass=ctx.getBean(MyClass.class);		
		//System.out.println(myClass.returnStringNotNull());  
		myClass.doSomethingNotNull(null);
	}
}
