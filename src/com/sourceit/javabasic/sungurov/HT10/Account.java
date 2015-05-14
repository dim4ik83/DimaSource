package com.sourceit.javabasic.sungurov.HT10;

public class Account {

	long numberAc;
	double saldoAc;
	String typeAc;

	public Account(Client cl, long number) {
		numberAc = number;
	}

	public double debtSaldo(Account ac, double sum) {
		return ac.saldoAc = ac.saldoAc + sum;
	}

	public void credSaldo(Account ac, double sum) {
		if (sum > ac.saldoAc) {
			System.out.println("You have not enough money to credit");
		} else {
			ac.saldoAc = ac.saldoAc - sum;
		}
	}

}
