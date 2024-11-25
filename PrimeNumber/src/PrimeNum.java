import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		isPrime(num);
	}

	private static void isPrime(int num) {
		int count = 0;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println("Prime number");
		} else {
			System.out.println("not a prime number");
		}

	}
}
