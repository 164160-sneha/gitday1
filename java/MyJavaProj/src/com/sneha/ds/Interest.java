package com.sneha.ds;

import java.util.Scanner;

public class Interest {
	public static void main(String[] args) {
		int principle, rate, period,si,amt,ci;
		System.out.println("Enter the value of principle amt");
		System.out.println("Enter the value of rate");
		System.out.println("Enter the value of period");
		Scanner scan=new Scanner(System.in);
		principle=scan.nextInt();
		rate=scan.nextInt();
		period=scan.nextInt();
		scan.close();
		amt=(principle*((1+(rate/100))^period));
		System.out.println("Compound amt is "+amt);
		si=(principle*rate*period/100);
		System.out.println("Simple Interest is "+si);
		ci=amt-principle;
		System.out.println("Compound Interest is "+ci);
	}

}
