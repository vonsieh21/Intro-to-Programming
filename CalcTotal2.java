import java.util.Scanner;

public class CalcTotal2 {

	public static void main(String[] args) 
	{
		CalcTotal Calculator = new CalcTotal();
		System.out.println("Enter the subtotal and a gratuity rate:");
		CalcTotal.calSubtotal();
		CalcTotal.percGratuity();
		System.out.println("Tip is " + gratuity + " subtoal is " + subTotal);
	}
}
