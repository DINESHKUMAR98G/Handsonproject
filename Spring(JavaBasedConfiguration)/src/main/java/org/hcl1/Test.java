package org.hcl1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Course course1=context.getBean("course1",Course.class);
		Course course2=context.getBean("course2",Course.class);
		Course course3=context.getBean("course3",Course.class);
		course1.display();
		course2.display();
		course3.display();
		((ClassPathXmlApplicationContext)context).close();
	}

}      
