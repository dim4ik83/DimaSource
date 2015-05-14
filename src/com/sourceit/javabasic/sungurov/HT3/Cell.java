package com.sourceit.javabasic.sungurov.HT3;

public class Cell {
	
	boolean leftBorder;
	boolean rightBorder;
	boolean topBorder;
	boolean bottomBorder;
	
	BoolRand B = new BoolRand ();
	
	public boolean [] setCell ()   {
		
		leftBorder = B.BoolRand();	
		rightBorder = B.BoolRand();
		topBorder = B.BoolRand();
		bottomBorder = B.BoolRand();
		
		boolean [] Mas = new boolean [] {leftBorder, rightBorder, topBorder, bottomBorder};
		return Mas;
		
		
	}

}
