package com.hcl5;
import org.springframework.context.annotation.Configuration;


import org.springframework.context.annotation.Bean;

@Configuration
public class OwnerConfig {
	@Bean(name="bean")
	public Owner setOwner()
	{
		Owner owner=new Owner();
		owner.setName("Adhithya ");
		owner.setPassword("adhikg1234 ");
		owner.setMobileNumber("9789097806");
		return owner;
	}
}
