package demo.ifElseLadder;

import java.util.Scanner;

public class ZipZapHurray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("hurray !");
		} else if (num % 3 == 0) {
			System.out.println("zip");
		} else if (num % 5 == 0) {
			System.out.println("zap");

		} else {
			System.out.println("done");
		}

	}

}