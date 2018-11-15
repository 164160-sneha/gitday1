package com.onkar.bank; // combination of logical classes

public class BankAccount {

	// static variable
	private static int autoAccountNo;

	// instance variable / class variable -- we cannot use instance variable
	// without the creating objects
	private int accountNo;
	private String accountHolderName;
	private double accountBalance;

	// init block
	{

		accountNo = ++autoAccountNo;
	}

	// construct overloading - when offering variaties
	// default constructor
	public BankAccount() { // initialization of class variables - it gets
							// automatically get called
		accountHolderName = "Unknow";
		accountBalance = 0;

	}

	// parameterize constructor
	public BankAccount(String accountHolderName, double accountBalace) {
	}

	// setter modifying or re initialize member variables
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	//getter methods
	public int getAccountNo(){
		return accountNo;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	//Service methods
	public void withdraw(double amount) {
		this.accountBalance-=amount;
	}
	
	public void depoist(double amount) {
		this.accountBalance+=amount;
	}

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		BankAccount acc2 = new BankAccount("Onkar", 5000);
	}
}
