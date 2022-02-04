package com.spring;

import java.util.ArrayList;

public class BikeList {
ArrayList<Bike> bikelist=new ArrayList();
public void insert(Bike b)
{
	bikelist.add(b);
}
public Bike search(String key)
{
	Bike b=new Bike();
	if(key.equalsIgnoreCase("ktm"))
	{
	b.display();
	}
	else if(key.equalsIgnoreCase("Hero"))
	{
	b.display();
	}
	else if(key.equalsIgnoreCase("TVS"))
	{
	b.display();
	}
	else
	{
		System.out.println("no bike info avl");
	}
	return b;
	
}
}
