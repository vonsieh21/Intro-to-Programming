import java.util.Scanner;
public class Exercise07_01 {
	public static void main (String []args) 
	{
		Scanner scan = new Scanner(System.in);
		int best;
		
		System.out.print("Enter the number of students: ");
		int numOfStudents = scan.nextInt();
		int[]scores = new int[numOfStudents];
		
		System.out.print("Enter "+ numOfStudents + " scores:");
		for (int i = 0; i < numOfStudents; i++) {
			scores[i] = scan.nextInt();
		}
		displayGrades(findBestScore(scores), scores);
	}
		
	public static int findBestScore(int[] scores) 
	{
	    int best = scores[0];
	    for (int i = 0; i < scores.length; i++) {
	        if (scores[i] > best) 
	            best = scores[i];
	    }
	    return best;
	}
	
	public static void displayGrades(int best, int[] scores ) 
	{

	    char grade = ' ';
	    for (int i = 0; i < scores.length; i++) {
	        if (scores[i] >= best-10)
	            grade = 'A';
	        else if (best - 10 > scores[i] && scores[i] >= best - 20)
	            grade = 'B';
	        else if (best - 20 > scores[i] && scores[i] >= best -30)
	            grade = 'C';
	        else if (best - 30 > scores[i] && scores[i] >= best -40)
	            grade = 'D';
	        else if (best - 40 > scores[i])
	            grade = 'F';

	        System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
	    }
	}
}
