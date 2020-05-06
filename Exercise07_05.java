import java.util.Scanner;
public class Exercise07_05 {
	public static void main (String []args) {
		Scanner scan = new Scanner(System.in);
		int[] distinctNum = new int[10];
		int count = 0;
		int num;
		
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			num = scan.nextInt();
			
			if (isInNumbers(distinctNum, num)) {
				distinctNum[count] = num;
				count++;
			}
		}
		
		System.out.println("The number of distinct numbers is " + count);
		System.out.print("The distinct numbers are");
		for (int i = 0; i < distinctNum.length; i++) {
			if (distinctNum[i] > 0)
				System.out.print(" " + distinctNum[i]);
		}
		System.out.println();
	}
	
	public static boolean isInNumbers(int[]numbers, int value) {
		for (int i = 0; i < numbers.length; i++)
		{
			if (value == numbers[i])
				return false;
		}
		return true;
	}
	
}
