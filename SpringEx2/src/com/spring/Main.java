package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
	Product p=(Product) c.getBean("prodobj");
	p.display();
	System.out.println("tot bil amount="+p.bill_amount_calc());
	}

}
