package demo.nestedIf;

import java.util.Scanner;

public class DividesOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1 = sc.nextInt();
		System.out.println("Enter second number :");
		int num2 = sc.nextInt();
		if (num1 >= num2) {
			if (num1 % num2 == 0) {
				System.out.println("Second number divides the first number ");
			} else {
				System.out.println("Second number can not divide first number");

			}

		} else {
			System.out.println("The first number is not greater than or equal to the second number."
					+ " So second number can not divide the first number ");
		}
	}
}
