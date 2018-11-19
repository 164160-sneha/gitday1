package com.sneha.oop;

import java.util.Scanner;

public class Candy extends DessertItems {
	Scanner scan = new Scanner(System.in);	
	void getCost() {
		Candy candy = new Candy();
		System.out.println("Enter the quantity");
		int quantity=scan.nextInt();
		double candyprice = 1;
		double tax=0.15;
		double candycost= candyprice*quantity;
		double totaltax=  candycost*tax;
		double totalamt=totaltax+candycost;
		double finalamt=totalamt*60;
		System.out.println("Amount to be paid is " +finalamt);
	}

}
