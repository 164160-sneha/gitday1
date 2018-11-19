package com.sneha.oop;

import java.util.Scanner;

public abstract class DessertItems {
	public  int candy;
	public int cookies;
	public int icecream;
	
	public DessertItems() {
		int candy=0;
		int cookies=0;
		int icecream=0;
	}
	void getCost() {
		// TODO Auto-generated method stub
		
	}
	
	static Scanner scan= new Scanner(System.in);	
	
	static void addStorage() {
		Candy candy = new Candy();
		Cookie cookie = new Cookie();
		IceCream icecream = new IceCream();
		System.out.println("Enter storage to be added");
		System.out.println("Select \n 1.Candy  2.Cookie  3.Ice cream");
		int storage=scan.nextInt();
		
		switch(storage) {
		case 1:
			System.out.println("Candy added");
			break;
		case 2:
			System.out.println("Cookie added");
			break;
		case 3: 
			System.out.println("Ice cream added");
			break;
		}
		if(storage==1) {
			candy.getCost();
		}
		else if(storage==2) {
			cookie.getCost();
		}
		else if(storage==3) {
			icecream.getCost();
		}
		else
			System.out.println("Invalid input");
	}
	
	static void placeOrder() {
		Candy candy = new Candy();
		Cookie cookie = new Cookie();
		IceCream icecream = new IceCream();
		System.out.println("Enter storage to be added");
		System.out.println("Select \n 1.Candy  2.Cookie  3.Ice cream");
		int order=scan.nextInt();
		switch(order) {
		case 1:
			System.out.println("Candy ordered");
			break;
		case 2:
			System.out.println("Cookie ordered");
			break;
		case 3: 
			System.out.println("Ice cream ordered");
			break;
		}
		if(order==1) {
			candy.getCost();
		}
		else if(order==2) {
			cookie.getCost();
		}
		else if(order==3) {
			icecream.getCost();
		}
	}
		
	public static void main(String[] args) {
		System.out.println("Role details");
		System.out.println("Select \n 1.Owner 2.Customer");
		int role=scan.nextInt();
		switch(role) {
		case 1:
			System.out.println("Welcome Owner");
			break;
		case 2:
			System.out.println("Welcome Customer");
			break;
		}
		if(role==1) {
			addStorage();
		}
		else if(role==2) {
			placeOrder();
		}
		else
			System.out.println("Invalid input");
	}

}
