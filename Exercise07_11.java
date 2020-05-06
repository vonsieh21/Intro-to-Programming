import java.util.Scanner;
public class Exercise07_11 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		double nums;
		double[]sum = new double[10];
		
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < sum.length; i++) 
			sum[i] = scan.nextDouble();

		
		System.out.println("The mean is: " + getMean(sum));
		System.out.println("The mean is: " + getDeviation(sum));
	}
	
	public static double getDeviation(double[] x) {

        double mean = getMean(x);
        double deviation = 0;
        for (int i = 0; i < x.length; i++) {
            deviation += Math.pow(x[i] - mean, 2);
        }
        return Math.sqrt(deviation / (x.length - 1));
    } 
	
	public static double getMean(double[]arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum / arr.length;
	}
}
	
