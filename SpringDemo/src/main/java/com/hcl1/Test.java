package com.hcl1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee=context.getBean(Employee.class,"employee");
		employee.display();
		Address a=employee.getAddress();
		a.Display();
		((ClassPathXmlApplicationContext)context).close();
		

	}

}
