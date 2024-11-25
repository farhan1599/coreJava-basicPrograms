import java.util.Scanner;

public class FindSimpleInterest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double principleAmount;
		double ratePerAnum;
		double timeInYears;
		System.out.println("Enter principle amount :");
		principleAmount = sc.nextDouble();
		System.out.println("Enter rate per anum :");
		ratePerAnum = sc.nextDouble();
		System.out.println("Enter years :");
		timeInYears = sc.nextDouble();
		double simpleInterest = (principleAmount * ratePerAnum * timeInYears) / 100;
		System.out.println("Your principle amount is =" + principleAmount);
		System.out.println("Your total interest for :" + timeInYears + " year is = " + simpleInterest);
		System.out.println("Your total amount is =" + (principleAmount + simpleInterest));

	}
}
