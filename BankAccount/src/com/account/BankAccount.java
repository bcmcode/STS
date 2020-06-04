package com.account;
import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	
	private static int numberOfAccounts;
	private static double allTheMoney;
	
	private String generateAccountNumber() {
		Random rand = new Random();
		long accountNum = 0;
		long mult = 1;
		for(int i=0; i<10; i++) {
			if(i==9) {
				int num = rand.nextInt(9)+1;
				accountNum += num*mult;
			}
			else {
				int num = rand.nextInt(10);
				accountNum += num*mult;
			}
			mult *= 10;
		}
		String accountNumb = String.valueOf(accountNum);
		return accountNumb;
	}
	
	public BankAccount() {
		this.accountNumber = generateAccountNumber();
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		numberOfAccounts++;
	}
	
	public double getCheckingBalance() {
		return this.checkingBalance;
	}
	public double getSavingsBalance() {
		return this.savingsBalance;
	}
	
	public void depositToSavings(double amount) {
		this.savingsBalance += amount;
		allTheMoney += amount;
	}
	public void depositToChecking(double amount) {
		this.checkingBalance += amount;
		allTheMoney += amount;
	}
	public void withdrawFromSavings(double amount) {
		if(amount < this.savingsBalance) {
			this.savingsBalance -= amount;
			allTheMoney -= amount;
		}
	}
	public void withdrawFromChecking(double amount) {
		if(amount < this.checkingBalance) {
			this.checkingBalance -= amount;
			allTheMoney -= amount;
		}
	}
	public double totalBalance() {
		return this.checkingBalance + this.savingsBalance;
	}
	public void displayAccountNumber() {
		System.out.println("Account Number: "+this.accountNumber);
	}
	public static void displayAllTheMoney() {
		System.out.println(allTheMoney);
	}
}
