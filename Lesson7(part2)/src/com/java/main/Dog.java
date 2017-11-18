package com.java.main;

public class Dog implements Sounds {
	private String name;
	public Dog(String name) {
		this.name = name;
		
	}
	public boolean MakeSound(int Magnitude) {
		if(Magnitude>MAGNITUDE) {
			System.out.println("WOOF WOOF!!!!  "+name);
			return true;
		}
		else {
			System.out.println("Gav Gav");
			return false;
		}
	}

}
