package com.sourceit.javabasic.sungurov.HT3;

/**
 * Make random boolean value
 */

public class BoolRand {
	
	public boolean BoolRand () {
		
		boolean a;
		double b = Math.random();
		
		if (b<0.51) {a= true;}
		else a= false;
				
		return a;
		
	}
	
}
