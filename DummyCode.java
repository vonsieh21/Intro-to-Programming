import java.util.Scanner;
public class DummyCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int letter = 0, digit= 0;
		
		System.out.print("Enter a string: ");
		String s = scan.nextLine(); 
		
		for (int i = 0; i < s.length(); i++) {
			if(Character.isLetter(s.charAt(i))) 
				letter++;

			else if(Character.isDigit(s.charAt(i)))
				digit++;
		}
		
		if(letter > 0 || digit > 0) {
			System.out.println("# of letters is "+ letter);
			System.out.println("# of digits is "+ digit);
		}
		else 
			System.out.println("You did not type anything!!!");

	}
}
