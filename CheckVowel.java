// Group 21
// Cevon, Rafi, Isaac, Muhammed
// Group Exercise 3

import java.util.Scanner; //import java scanner tool

public class CheckVowel {
	public static void main(String[] args) {    //main method
		Scanner scan = new Scanner(System.in);  //declaring scan as a new scanner
        
        System.out.print("Enter a letter : ");  //prompts user to enter a letter
        String letter = scan.next();  			//reads input
        
        char ch = Character.toLowerCase(letter.charAt(0));  //return the first character of the string and make sure it is lowercase
        
        if (Character.isLetter(ch))  //determine if the specified character is a letter
        {  
        	switch(ch) {  //switch statement to replace a nested if statment
                case 'a': 
                case 'e': 
                case 'i': 
                case 'o': 
                case 'u': System.out.println(letter + " is a vowel"); break;  //displays this if the letter input is a vowel
                default:
                    System.out.println(letter + " is a consonant");  //displays this is the letter is a consonant
        	}
        }
        else    //else statement 
        	System.out.println(ch + " is invalid input.");   //inputs this if anything but a letter is inputed
	}
}
