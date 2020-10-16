package org.hcl2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee emp1=context.getBean("employee",Employee.class);
		emp1.display();
		((AnnotationConfigApplicationContext)context).close();

	}

}
