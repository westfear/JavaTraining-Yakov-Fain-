package com.java.main;

public class Cat implements Sounds {
	private String name;

	public Cat(String name) {
		this.name=name;
	}
	public boolean MakeSound(int Magnitude) {
		if(Magnitude>MAGNITUDE) {
			System.out.println("ROOOARRRR!!!!  "+name);
			return true;
		}
		else {
			System.out.println("MEO^^");
			return true;
		}
		
		
		
	}

}
