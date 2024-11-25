package temperatureConversion;

import java.util.Scanner;

public class ConvertTemperature {
	public static void main(String[] args) {

		float celsius = 0.0f;
		float fahrenhite = 0.0f;

		System.out.println("celsius to fahrenhite is (" + convertToFahrenhite(celsius));
		System.out.println("farhrenhite to celsius is " + converToCelsius(fahrenhite));
	}

	private static float converToCelsius(float fahrenhite) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenhite :");
		fahrenhite = sc.nextFloat();
		float celsius = ((fahrenhite - 32) * 5) / 9;
		return celsius;

	}

	private static float convertToFahrenhite(float celsius) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in celsius :");
		celsius = sc.nextFloat();
		float fahrenhite = ((celsius * 9) / 5 + 32);
		return fahrenhite;

	}
}
