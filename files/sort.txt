package com.sneha.ds;

public class Sort {
	public static void main(String[] args) {
		int i,j,temp;
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		for(i=0;i<15;i++)
		{
			System.out.println(""+arr[i]);
		}
		for(i=0;i<14;i++)
		{
			for(j=0;j<14;j++)
			{
			if(arr[j] > arr[j+1])
			{
				temp = arr[j];
			    arr[j] = arr[j+1];
			    arr[j+1] = temp;
			}		
		}
		}
		System.out.println("Sorted array");
		for(i=0;i<15;i++)
		{
			System.out.println(""+arr[i]);
		}
}
}
