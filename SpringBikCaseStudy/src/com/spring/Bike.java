package com.spring;
public class Bike {
private String model,col;
private double price;
public Bike() {
	super();
	// TODO Auto-generated constructor stub
}
public Bike(String model, String col, double price) {
	super();
	this.model = model;
	this.col = col;
	this.price = price;
}

public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getCol() {
	return col;
}
public void setCol(String col) {
	this.col = col;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public void display()
{
	System.out.println("Bike model="+model);
	System.out.println("bike col="+col);
	System.out.println("Bike Price="+price);
}
}
