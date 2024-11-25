package demo.nestedIf;

import java.util.Scanner;

public class BloodDonationEligibility {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your blood group :");
		String bloodGroup = sc.next();
		System.out.println("Enter your weight :");
		int weight = sc.nextInt();
		System.out.println("Enter your age :");
		int age = sc.nextInt();

		if (age > 20) {

			if (weight >= 50 && weight <= 70) {

				if (bloodGroup.equalsIgnoreCase("A+") || bloodGroup.equalsIgnoreCase("B+")) {

					System.out.println("You are eligible to donate blood ");
				} else {
					System.out.println("blood group not matched");
				}

			} else {
				System.out.println("weight not matched");
			}
		} else {
			System.out.println("age not matched");
		}
		System.out.println("You are not eligible");

	}
}
