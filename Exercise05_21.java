import java.util.Scanner;

public class Exercise05_21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double amount, years, month; 
		
		System.out.print("Loan Amount: "); 
		amount = scan.nextDouble();
		System.out.print("Number of Years: "); 
		years = scan.nextDouble();
		month = years * 12;
		
		System.out.println("\nInterest Rate     Monthly Payment      Total Payment\n");
		 
		double monthPay = amount/month;
		double total;
		
		for (double rate = 5.0; rate <= 8.0;rate += 1.0/8) {
			double monthlyRate = rate/1200; 
			System.out.printf("%-5.3f",rate); System.out.print("%            ");
			monthPay = amount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, month));
			total = monthPay * month;
			System.out.printf("%-9.2f",monthPay);System.out.print("            ");
			System.out.printf("%-8.2f\n",total);
		}
	}
}

