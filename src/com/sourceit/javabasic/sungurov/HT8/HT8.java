package com.sourceit.javabasic.sungurov.HT8;

public class HT8 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Employee [] emp = new Employee [6];
		
		FinDepRate finP = new FinDepRate (01, "Pete", 45);
		finP.setSalary(30);
		emp [0] = finP;
		
		FinDepRate finT = new FinDepRate (02, "Tom", 27);
		finT.setSalary(35.6);
		
		FinDepRate finJ = new FinDepRate (03, "John", 31);
		finJ.setSalary(29.7);
		

		
		TradeDepMon trJ = new TradeDepMon(04, "Johny", 26);
		trJ.setSalary(4600);
		
		TradeDepMon trS = new TradeDepMon(05, "Sarrah", 19);
		trS.setSalary(7000);
		
		TradeDepMon trM = new TradeDepMon(06, "Mike", 28);
		trM.setSalary(6500);
		
//		Employee [] emp = new Employee [6];
		
		System.out.println(emp[0]);
		
//		int element=0;
		
	//	for (Employee element: emp) {
//			System.out.println(finP.getSalary(finP));
//			
			
//		};
		
		
		
	}
	
		public void Sort (Employee emp) {
		
	}
	

}
