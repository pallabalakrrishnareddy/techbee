package com.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c=new ClassPathXmlApplicationContext("applicationContext.xml");
		Bike bike1=(Bike) c.getBean("bike1");
		Bike bike2=(Bike) c.getBean("bike2");
		Bike bike3=(Bike) c.getBean("bike3");
		BikeList  bikeList=new BikeList ();
		bikeList.insert(bike1);
		bikeList.insert(bike2);
		bikeList.insert(bike3);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Bike name u wanted?");
		String s=sc.next();
		if(s.equalsIgnoreCase("ktm"))
		{
			bike1.display();
		}
		else if(s.equalsIgnoreCase("Hero"))
		{
			bike2.display();
		}
		else if(s.equalsIgnoreCase("TVS"))
		{
			bike3.display();
		}
		else
		{
			System.out.println("no Bike is find");
		}
	}

}
