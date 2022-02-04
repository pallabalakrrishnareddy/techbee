package com.spring;

public class Product {
private int pid;
private String name;
private int qty;
private double unitprice;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int pid, String name, int qty, double unitprice) {
	super();
	this.pid = pid;
	this.name = name;
	this.qty = qty;
	this.unitprice = unitprice;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getUnitprice() {
	return unitprice;
}
public void setUnitprice(double unitprice) {
	this.unitprice = unitprice;
}
public double bill_amount_calc()
{ double billamount=qty*unitprice;
	return billamount;
	
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", name=" + name + ", qty=" + qty + ", unitprice=" + unitprice + "]";
}
public void display()
{
	System.out.println(pid);
	System.out.println(name);
	System.out.println(qty);
	System.out.println(unitprice);
}
}
