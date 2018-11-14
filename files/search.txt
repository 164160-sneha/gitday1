package com.sneha.ds;

import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		int i,key,flag=0;
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		for(i=0;i<15;i++)
		{
			System.out.println(""+arr[i]);
		}
		System.out.println("Enter the value to be searched");
		Scanner scan =new Scanner(System.in);
		key=scan.nextInt();
		scan.close();
		for(i=0;i<15;i++)
		{
			if(arr[i]==key)
			{
				flag=1;	
			}
		}
		if(flag==1)
		{
			System.out.println("Found at index " +i);
		}
		else
			System.out.println("Not found");
		
		}

}


