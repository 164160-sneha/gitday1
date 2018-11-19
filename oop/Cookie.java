package com.sneha.oop;

import java.util.Scanner;

public class Cookie extends DessertItems {

	Scanner scan = new Scanner(System.in);

	void getCost() {
		Candy cookie = new Candy();
		System.out.println("Enter the quantity");
		int quantity = scan.nextInt();
		double cookieprice = 2;
		double tax = 0.15;
		double cookiecost=cookieprice * quantity;
		double totaltax = cookiecost*tax;
		double totalamt = totaltax + cookiecost;
		double finalamt = totalamt * 70;
		System.out.println("Amount to be paid is " + finalamt);

	}
}
