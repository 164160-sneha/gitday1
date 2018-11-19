package com.sneha.oop;

import java.util.Scanner;

public class IceCream extends DessertItems {

	Scanner scan = new Scanner(System.in);

	void getCost() {
		Candy icecream = new Candy();
		System.out.println("Enter the quantity");
		int quantity = scan.nextInt();
		double icecreamprice = 25;
		double tax = 0.15;
		double icecreamcost =icecreamprice * quantity;
		double totaltax = icecreamcost*tax;
		double finalamt = totaltax + icecreamcost;
		System.out.println("Amount to be paid is " + finalamt);

	}
}
