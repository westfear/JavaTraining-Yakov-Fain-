package com.practicaljava.lesson6;

public class Contractor extends Person implements Payable {

	public Contractor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public boolean increasePay(int percent) {
		if(percent < INCREASE_CAP) {
			System.out.println("Increase salary by " + percent +"%. "+getName());
		}
		else {
			System.out.println("we cannot increase your salary rate more than by 20%,"+ getName());
		}
	
		return true;
	}

}
