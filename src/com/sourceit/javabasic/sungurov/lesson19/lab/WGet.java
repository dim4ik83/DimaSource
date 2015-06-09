package com.sourceit.javabasic.sungurov.lesson19.lab;

public class WGet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		System.out.println("Hi");
		
		if (args.length==0) {
			System.out.println("Usage: some web address.");
			System.out.println("           or -i");
			System.out.println("Example: http//google.com");
			return;
			
		}
		
		String command = args[0];
		
		if ("-i".equals (command)) {
			// TODO ask for URL
			System.out.println("Enter an URL: ");
		} else if (!command.startsWith("http")) {
			System.out.println(getInstructions());
			return;
			
		}
		
		System.out.println("Select what to do next: ");
		System.out.println("1) Save page");
		System.out.println("2) Display title");
		System.out.println("3) Find a word");
		System.out.println("4) List all url's on the page");
		
		
		
		
	}

	
	public static String getInstructions () {
		return "Usage: some web address\n" + "           or -i\n" + "Example: http//google.com\n";
	}
	
	
	
}
