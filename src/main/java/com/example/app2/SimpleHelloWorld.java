package com.example.app2;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

//import com.example.app2.UserDetails.Address;

public class SimpleHelloWorld {
	
	public static void main(String[] args) {
		//pass the dependent class
		var context=new AnnotationConfigApplicationContext(UserDetails.class);
		//call the dependent beans
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean("address1"));
		//injecting one object to another
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2"));
//		Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);
//		System.out.println(context.getBeanDefinitionCount());
	}

}
