package org.lynda.common;
import org.springframework.*;
import org.springframework.context.*;
import org.springframework.context.annotation.*;;

@Configuration
public class HelloConfig {

	@Bean
	public String greeting ()
	{
		return "World ";
	}
	
	/**
	 * Will Create an Instance of IoC Container 
	 * and Call the Beans which are Congigyureed to it
	 * @param args
	 */
	public static void main (String args []){
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(
						//"org.lynda.common" // by package name 
						HelloConfig.class // by class name
						);
		String strText = (String) context.getBean("greeting");
		System.out.println("strText: "+strText);
	
	}
}
