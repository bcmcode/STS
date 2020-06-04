package com.account;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		BankAccount.displayAllTheMoney();
		b.displayAccountNumber();
		b.depositToChecking(500);
		b.depositToSavings(100000);
		System.out.println(b.totalBalance());
		b.withdrawFromChecking(250);
		b.withdrawFromSavings(400);
		System.out.println(b.getCheckingBalance());
		System.out.println(b.getSavingsBalance());
		System.out.println(b.totalBalance());
	}

}
