package com.practicaljava.lesson7.tryit;

public class Contractor implements Payable {
	
	private String name;
	public Contractor(String name) {
		this.name= name;
		
	}
	public boolean increasePay(int percent ) {
		if(percent <Payable.INCREASE_CAP) {
			System.out.println("Increase hourly rate by more than " + Payable.INCREASE_CAP +"%."+ name);
			return true;
		}
		else {
			System.out.println("Sorry cant increase your hourly rate more than by " +Payable.INCREASE_CAP +"%."+ name);
			return false;
		}
	}
	

}
