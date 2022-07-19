package com.exception;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CheckingAccount c=new CheckingAccount(101);
		c.checkBalance();
		System.out.print("Enter Deposit Amount : ");
		double amount=sc.nextDouble();
		c.deposit(amount);
		c.checkBalance();
		try {
			System.out.print("Enter Withdraw Amount : ");
			amount=sc.nextDouble();
			c.withdraw(amount);
			c.checkBalance();
		} catch (InSufficientFund e) {
			System.out.println("Sorry You Need Another "+e.getAmount()+" Rs.");
			c.checkBalance();
		}
	}
}
