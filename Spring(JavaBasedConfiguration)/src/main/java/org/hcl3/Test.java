package org.hcl3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationcontext3.xml");
		Box b=context.getBean("box",Box.class);
		b.display();
		((ClassPathXmlApplicationContext)context).close();

	}

}
