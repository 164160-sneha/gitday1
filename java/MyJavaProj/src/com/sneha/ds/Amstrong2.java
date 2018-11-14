package com.sneha.ds;

public class Amstrong2 {
	public static void main(String[] args) {
		int num,temp,total=0,i;
		for(i=100;i<=999;i++)
		{
			num=i;
			while(num>0)
			{
				temp=num%10;
				total=total+temp*temp*temp;
				num=num/10;
			}
			if (total==i) {
				System.out.println("Armstrong numbers are");
				System.out.println(""+i);	
			}
			total=0;
		}
	}
}
