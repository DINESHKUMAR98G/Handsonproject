package com.hcl5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(OwnerConfig.class);
		Owner owner1=context.getBean(Owner.class,"bean");
		owner1.display();
		
		((AnnotationConfigApplicationContext)context).close();

	}

}
