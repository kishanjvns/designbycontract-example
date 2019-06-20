package ch.frankel.blog.beanvalidator;

import static org.testng.Assert.assertNull;

import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = SpringConfiguration.class)
public class MyClassTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private MyClass myClass;
	
	@Test
	public void myClassReturnStringShouldReturnNullWithNull() {
		
		assertNull(myClass.returnString());
	}
	
	@Test(expectedExceptions = ValidationException.class)
	public void myClassReturnStringNotNullShouldThrowExceptionWithNull() {
		
		myClass.returnStringNotNull();
	}
	
	@Test
	public void myClassDoSomethingShouldDoNothingWithNull() {
		
		// Nothing to test, just check it doesn't throw an exception
		myClass.doSomething(null);
	}
	
	@Test(expectedExceptions = ValidationException.class)
	public void myClassDoSomethingNotNullShouldThrowExceptionWithNull() {
		
		myClass.doSomethingNotNull(null);
	}

	@Test
	public void myClassDoSomethingWithEmailShouldDoNothingWithValidEmail() {
		
		myClass.doSomethingWithEmail("nicolas@frankel.ch");
	}

	@Test(expectedExceptions = ValidationException.class)
	public void myClassDoSomethingWithEmailShouldDoNothingWithBlankString() {
		
		myClass.doSomethingWithEmail("   ");
	}
	

	@Test(expectedExceptions = ValidationException.class)
	public void myClassDoSomethingWithEmailShouldDoNothingWithInvalidEmail() {
		
		myClass.doSomethingWithEmail("nicolas at frankel dot ch");
	}
}
