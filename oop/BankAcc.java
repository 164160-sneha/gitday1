package com.sneha.oop;

public class BankAcc {
	public String AccountHolderName;
	protected double AccountBalance;
	private double AccountNo;

	public BankAcc(String AccountHolderName, double AccountBalance, double AccountNo) {

		this.AccountHolderName = AccountHolderName;
		this.AccountBalance = AccountBalance;
		this.AccountNo = AccountNo;

	}

	public static void main(String[] args) {

		System.out.println("This is for fixed deposit in saving account");
		SavingAcc savingacc = new SavingAcc("Ashna", 50000, 123);
		savingacc.FixedDeposit(200000, 7);
		System.out.println("--------------------------------------------");
		System.out.println("This is for cash credit in current account");
		CurrentAccount currentacc = new CurrentAccount("Baby", 400000, 321);
		currentacc.CashCredit(450000);
	}

}
