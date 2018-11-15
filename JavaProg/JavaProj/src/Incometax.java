import java.util.Scanner;


public class Incometax {
	public static void main(String[] args) {
		int ctc,tax;
		System.out.println("Enter your CTC");
		Scanner scan= new Scanner(System.in);
		ctc=scan.nextInt();
		scan.close();
		if(ctc<=180000)
		{
			System.out.println("No tax");
		}
		else if(ctc>=180001 & ctc<=300000)
		{
			tax=ctc*10/100;
			System.out.println("Income tax is " +tax);
		}
		else if(ctc>=300001 & ctc<=500000)
		{
			tax=ctc*20/100;
			System.out.println("Income tax is " +tax);
		}
		else if(ctc>=500001 & ctc<=1000000)
		{
			tax=ctc*30/100;
			System.out.println("Income tax is " +tax);
		}
		else
			System.out.println("invald");
	}

}
