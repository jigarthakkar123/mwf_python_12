package com.exception;

public class CheckingAccount {

	int acno;
	double balance=0.0;
	
	public CheckingAccount(int acno) {
		this.acno=acno;
	}
	public void deposit(double amount) {
		this.balance=this.balance+amount;
	}
	public void withdraw(double amount) throws InSufficientFund{
		if(amount<=this.balance) {
			this.balance=this.balance-amount;
		}else {
			double needs=amount-this.balance;
			throw new InSufficientFund(needs);
		}
	}
	public void checkBalance() {
		System.out.println("Current Balance : "+this.balance);
	}
}
