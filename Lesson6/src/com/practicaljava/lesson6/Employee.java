package com.practicaljava.lesson6;

public class Employee extends Person implements Payable {

	public Employee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
    public  boolean increasePay(int percent) {
    	System.out.println("Incrrease salary by " + percent + "%. "+ getName());
    	return true;
    	
    }


}
