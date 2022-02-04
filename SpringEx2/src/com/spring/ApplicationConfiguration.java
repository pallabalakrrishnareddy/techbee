package com.spring;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;

public class ApplicationConfiguration {
@Bean(name="prodobj")
public Product getPrice()
{Scanner sc=new Scanner(System.in);
System.out.println("enter pid,pname,qty,unitprice");
int pid=sc.nextInt();
String pname=sc.next();
int qty=sc.nextInt();
double unitprice=sc.nextDouble();
	return new Product(pid,pname,qty,unitprice);
	
}
}
