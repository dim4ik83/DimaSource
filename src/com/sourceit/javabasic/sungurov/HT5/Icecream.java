package com.sourceit.javabasic.sungurov.HT5;


public class Icecream extends MilkFactory {
	
	private String chocolate ;
	private String vanilla;
	private String fruit;
	private String cream;
	
	
	public void getChocolate() {
		System.out.print(chocolate= super.setIcecream("шоколадное мороженое на палочке "));
	}
	
	
	public void getVanilla() {
		System.out.print(vanilla= super.setIcecream("ванильный рожок "));
	}

	public void getFruit() {
		System.out.print(vanilla= super.setIcecream ("фруктовое мороженое "));
	}

	public void getCream() {
		System.out.print(vanilla= super.setIcecream("молочный пломбир "));
	}
	
}
