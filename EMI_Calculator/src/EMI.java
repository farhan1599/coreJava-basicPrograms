import java.util.Scanner;

public class EMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double principleAmount;
		double rateOfInterest;
		double tenureInMonths;
		System.out.println("Enter principle amount :");
		principleAmount = sc.nextDouble();
		System.out.println("Enter rate of interest per anum :");
		rateOfInterest = sc.nextDouble();
		System.out.println("Enter tenure in months :");
		tenureInMonths = sc.nextDouble();

		// convert rate of interest from per anum to per month
		double r = rateOfInterest / 12 / 100;

		double emi = calculateEMI(principleAmount, r, tenureInMonths);
		System.out.println(emi);
	}

	private static double calculateEMI(double p, double rate, double t) {
		double res = (p * rate * Math.pow((1 + rate), t) / Math.pow((1 + rate), t) - 1);
		return res;

	}

}
