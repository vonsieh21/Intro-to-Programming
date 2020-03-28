import java.util.Scanner;
public class GuessANumber {
	public static void main(String[] args) {
		
		int number = (int) (Math.random()*101); 
		//math.random() generates a number between 0 -1, we mulitply by 101 to generate 0-100
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Guess a random number between 0 and 100");
		
		int guess = -1;
		//Use -1 for guess as on line 5 will never generate a negative number
		
		while (guess != number) {  
		//the while is used to execute code until we get the right number
			
			System.out.print("\nEnter your guess: ");
			guess = input.nextInt();
			
			if (guess == number) 
				System.out.println("You got it right! The number is " + number);
				
			else if(guess > number) 
				System.out.println("Your guess is too high");
					
			else 
				System.out.println("Your guess is too low");}
			}
		}
