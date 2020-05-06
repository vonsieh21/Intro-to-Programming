// Group 21
// Cevon, Muhammed, Rafi
// Section 006

import java.util.Scanner;
public class CountNum {
	public static void main (String []args) {
		Scanner scan = new Scanner (System.in);				//declare "scan" as a new scanner object
		
		System.out.print("Enter the intergers between 1 and 100: ");
		
		int [] myList = new int[100]; 						//created a new array 
		int numbers;										//declare values on line 9 and 10
		int count = 0;										
		
		do {  												//do-while loop to stop after 0 is entered
			numbers = scan.nextInt();						//input numbers 
			myList[count] = numbers;						//place numbers entered above in the value count
			count++;										//increases the  
		} while (numbers != 0);
		
		 countOccurence(myList); 							//calls upon a different method to handle code
    }

    public static void countOccurence(int[] list) {         //creates a new array using the numbers inputed from myList
        for (int i = 1; i <= 100; i++) 						// counts how many times each number appear in the array
        {     				
            int count = 0;
            
            for (int j = 0; j < list.length - 1; j++) 		// goes over each number in the array to check if it is printed again
            {		
                if (list[j] == i)							
                    count += 1;								// adds +1 if number in the array matches
            }
            
            if (count != 0)
                System.out.printf("%d occurs %d %s%n", 
                   i, count, count > 1 ? "times" : "time"); // prints out "time" or "times" if it is plural
        }
    }
}
	

