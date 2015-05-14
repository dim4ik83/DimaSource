package com.sourceit.javabasic.sungurov.HT10;

public class Programm {

	public static void main(String[] args) {

		Bank bank_A = new Bank("Prihvat", 10000000.0);

		Client Cl_A = new Client(bank_A, "Peter", 28, 5000);
		Client Cl_B = new Client(bank_A, "Mary", 25, 100);

		Account ac_A1 = new Account(Cl_A, 262045321);
		Account ac_B1 = new Account(Cl_B, 262056210);

		bank_A.giveLoan(ac_A1, 6000);
		Cl_A.payMoneyCl(ac_A1, Cl_A, 3000);
		Cl_A.sendMoney(ac_A1, ac_B1, 3620);
		Cl_B.removeMoney(ac_B1, Cl_B, 500);

		System.out.println("Fund of bank is: " + bank_A.fundBank);
		System.out.println("Account balance client A is: " + ac_A1.saldoAc);
		System.out.println("Account balance client B is: " + ac_B1.saldoAc);
		System.out.println("Cash balance client A is: " + Cl_A.cashCl);
		System.out.println("Cash balance client B is: " + Cl_B.cashCl);

	}

}
