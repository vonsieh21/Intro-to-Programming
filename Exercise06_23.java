import java.util.Scanner;
public class Exercise06_23 {
	public static void main (String []args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter a string: ");
		String str = scan.nextLine();
		
		System.out.print("\nEnter a character: ");
		char ch = scan.next().charAt(0);
		
		System.out.println("\nThe number of " + ch + " in " + str + " is " + count(str, ch));
	}
	
	public static int count(String str, char ch) {  // for each i from 1 to str.length() - 1, if str.charAt(i) == a, increase count by 1.
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch)
				count++;
				}
		return count;
	}
}
