import java.util.Scanner;
public class Exercise08_01 {
	public static void main (String []args) {
		double [][] table = getMatrix();
		
		for(int i = 0; i < table[0].length; i ++) {
			System.out.println("Sum of the elements at column "+ i + " is " + sumColumn(table, i));
		}
	}
	
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for(int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		return sum;	
	}
	
	//invoke the getMatrix method
	public static double[][] getMatrix() {    
		Scanner scan = new Scanner (System.in);
		final int ROWS = 3, COLUMNS = 4;
	
		double [][] table = new double [ROWS][COLUMNS];
	
		System.out.println("Enter a " + ROWS + "-by-" + COLUMNS + " matrix row by row:");
		
		for (int row = 0; row < table.length; row++) {
			for (int col = 0; col < table[row].length; col++) {
				table[row][col] = scan.nextDouble();
			}
		}
		return table;
	}
}
