package com.example.app2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Address(String addLine1,String addLine2) {};

record Person(String name,int age,Address address)
{}
@Configuration
public class UserDetails {
	
	
	@Bean
	public String name()
	{
		return "suhas";
	}
	
	@Bean
	public int age()
	{
		return 1;
	}
	
	
	@Bean
	
	public Address address1()
	{
		return new Address("GangaSamruddhi","pune");
	}
	
	@Qualifier
	@Bean
	public Address address()
	{
		return new Address("karegoan park","pune");
	}
	
	@Bean(name="person")
	public Person personDetails(String name,int age,@Qualifier Address address1)
	{
		return new Person(name, age, address1);
	}
	
	@Bean(name="person2")
	public Person personDetails2(String name,int age,Address address)
	{
		return new Person(name, age, address);
	}

}
