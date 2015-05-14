package com.sourceit.javabasic.sungurov.HT5;

public class Children extends Kindergarten {
	
	
	String vano;
	String mary;
	String asya;
	String pete;
	
	public  void getVano() {
		System.out.print(vano= super.setChild("Ваня "));
	}
	
	public  void getMary() {
		System.out.print(mary= super.setChild("Маша "));
	}
	
	public  void getAsya() {
		System.out.print(asya= super.setChild("Ася "));
	}
	
	public  void getPete() {
		System.out.print(pete= super.setChild("Петя "));
	}
	 
}
