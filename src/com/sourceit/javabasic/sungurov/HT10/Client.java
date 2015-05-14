package com.sourceit.javabasic.sungurov.HT10;

public class Client {

	String nameCl;
	int ageCl;
	double cashCl;

	public Client(Bank bank, String name, int age, double cash) {
		nameCl = name;
		ageCl = age;
		cashCl = cash;
	}

	/**
	 * Client can send money from his account to another ckient's account
	 */

	public void sendMoney(Account send, Account receive, double sum) {

		if (sum > send.saldoAc) {
			System.out.println("You have not enough money to send");

		} else {
			send.saldoAc = send.saldoAc - sum;
			receive.debtSaldo(receive, sum);
		}

	}

	/**
	 * Client put his own money on his account
	 */

	public double payMoneyCl(Account ac, Client cl, double sum) {

		cl.cashCl = cl.cashCl - sum;
		return ac.saldoAc = ac.saldoAc + sum;
	}

	/**
	 * Client take his money back from his account
	 */
	public void removeMoney(Account send, Client cl, double sum) {

		if (sum > send.saldoAc) {
			System.out.println("You have not enough money to send");

		} else {
			send.saldoAc = send.saldoAc - sum;
			cl.cashCl = cl.cashCl + sum;
		}

	}

}
