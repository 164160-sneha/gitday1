import java.util.Scanner;

public class Averagemarks {
	public static void main(String[] args) {
		int sub1, sub2, sub3, i, avg, total;
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter your marks of sub1");
			sub1 = scan.nextInt();
			System.out.println("Enter your marks of sub2");
			sub2 = scan.nextInt();
			System.out.println("Enter your marks of sub3");
			sub3 = scan.nextInt();

			avg = (sub1 + sub2 + sub3) / 3;
			System.out.println("Average=" + avg);
			total = sub1 + sub2 + sub3;
			System.out.println("Total=" + total);
		}
	}
