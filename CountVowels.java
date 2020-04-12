// Group 21
// Cevon, Rafi, Muhammed
// Group Exercise 4

import java.util.Scanner;
public class CountVowels {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter a string: ");
	String string = scan.nextLine();       

	int vowels = 0;				// Count the number of vowels				
	int consonants = 0;	        // "   " of consonants

	// Count the number of vowels and consonants in the string
	for (int i = 0; i < string.length(); i++) {   //for method to simplify the process by adding i and completing the loop when i equals the string's length
		if (Character.isLetter(string.charAt(i))) {     //confirming if each character in the string is a letter or not
			if (Character.toUpperCase(string.charAt(i)) == 'A' ||        //if method to add 1 to the vowel variable
				 Character.toUpperCase(string.charAt(i)) == 'E' ||
				 Character.toUpperCase(string.charAt(i)) == 'I' ||
				 Character.toUpperCase(string.charAt(i)) == 'O' ||
				 Character.toUpperCase(string.charAt(i)) == 'U') {
				vowels++;
			}
			else
				consonants++;
		}
	}
	System.out.println("The number of vowels is " + vowels);
	System.out.println("The number of consonants is " + consonants);
	}
	}


	
