
public class Exercise05_07 {
	public static void main(String[] args) {
		double tution = 10000;
		int year = 1;
		int afterYear = 1;
		double total = 0;
		
		while (year <= 10) {
			tution = tution * 1.05;
			year ++;
		}
		System.out.println("Tution in ten years is "+ tution);
		
		while (afterYear <= 4) {
			total = tution + total;
			tution = tution * 1.05;
			afterYear ++;
		}
		System.out.println("The four-year total tution in ten years is "+ total);
	}
}
