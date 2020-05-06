import java.util.Scanner;

public class Exercise06_07 {
	//main method
	public static void main (String[]args) { 
		Scanner scan = new Scanner (System.in);
		final int numberofYears = 30;
		
		System.out.print("The amount invested: " );
		double investmentAmount = scan.nextDouble();
		
		System.out.print("\nAnnual interest rate: ");
		double annualInterestRate = scan.nextDouble();
		double monthlyInterestRate = annualInterestRate/1200;
		
		System.out.println("Years   Future Value");
		for (int year = 1; year <= numberofYears; year++) {
			System.out.printf("%-10d", year);
			System.out.printf("%11.2f\n", futureInvestmentValue(investmentAmount, monthlyInterestRate, year)); //calls on the method below
		}
	}
	//futureInvestmentValue method that computes the future value of an investment today
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}
}

