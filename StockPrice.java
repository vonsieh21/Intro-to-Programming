import java.util.Scanner;
public class StockPrice {
	public static void main (String []args) {
		 Scanner scan = new Scanner(System.in) ;              // The stock's symbol
		System.out.println("Enter the number of stocks");
		int num = scan.nextInt();
		String []stockName = new String [num];
		int [] stockPrice = new int [num];
		
		System.out.println("What is each stock name?");
		for (int i = 0; i < num; i++) {
		  String name = scan.next();
		  stockName [i] = name;
		}
		System.out.println("What is each stock price?");
		for (int i = 0; i < num; i++) {
			  int price = scan.nextInt();
			  stockPrice [i] = price;
			}
		
		getAverage(stockName,stockPrice);
		
}
	public static void getAverage(String[]a, int []b) {
		for (int i = 0; i < a.length; i++) {
			  System.out.println("Stock "+ (i + 1) + " name: " + a[i]);
			  System.out.println("Stock "+ (i + 1) + " price: " + b[i]);
			}
		int total = 0;
		for(int i=0; i<b.length; i++){
        	total = total + b[i];
        }
		int avg = total / b.length;
		System.out.println("Average stock price is "+ avg);
		
		for (int i = 0; i < a.length; i++) {
		if (b[i]> avg) {
			System.out.println(a[i]+" is above average");
		}
	}
}
}
