package com.sneha.ds;

import java.util.Scanner;

public class Results {
	public static void main(String[] args) {
		int eng,kan,hin;
		System.out.println("Enter the marks of English");
		System.out.println("Enter the marks of Kannada");
		System.out.println("Enter the marks of Hindi");
		Scanner scan=new Scanner(System.in);
		eng=scan.nextInt();
		kan=scan.nextInt();
		hin=scan.nextInt();
		scan.close();
		if(eng>=60)
		{
			if(kan>=60 & hin>=60)
			{
				System.out.println("Passed");
			}
			else if(kan>=60 | hin>=60)
			{
				System.out.println("Promoted");
			}
			else if(kan<60 & hin<60)
			{
				System.out.println("failed");
			}
		}
		else if(eng<60)
		{
			if(kan>=60 & hin>=60)
			{
				System.out.println("Promoted");
			}
			else if(kan<60 | hin<60)
			{
				System.out.println("failed");		
			}				
		}			
		}		
}


			
		
		



