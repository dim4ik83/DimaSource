package com.sourceit.javabasic.sungurov.HT5;

public class Activity implements DoSmth {
	
	private String gnaw ;
	private String savour;
	private String еат;
	private String bite;
	
	public void getGnaw() {
		System.out.print("грызет ");
		
	}

	public String getSavour() {
		System.out.print("смакует ");
		return savour;
	}

	public String getЕат() {
		System.out.print("лопает ");
		return еат;
	}

	public String getBite() {
		System.out.print("кусает ");
		return bite;
	}

	
	public String someActivity(String s) {
		s = "чем-то занят";
		return s;
	}

}
