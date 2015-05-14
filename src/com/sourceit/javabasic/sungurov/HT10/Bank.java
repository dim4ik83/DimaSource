package com.sourceit.javabasic.sungurov.HT10;

public class Bank {

	String nameBank;
	String adrBank;
	double fundBank;

	public Bank(String name, double fund) {
		nameBank = name;
		fundBank = fund;
	}

	public void giveLoan(Account ac, double sum) {
		if (sum > fundBank) {
			System.out.println("Our bank is BANKROT!!!");
			System.exit(0);
		} else {
			fundBank = fundBank - sum;
			ac.debtSaldo(ac, sum);
		}

	}

}
