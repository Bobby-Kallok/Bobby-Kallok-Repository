package edu.monmouth.cs176.s1332932.mp0;

public class Greeting{
	
	private String message = "Default";
	
	public Greeting(String abc) {
		message = abc;
	}
	
	public void print() {
		System.out.println(message);
	}
}
