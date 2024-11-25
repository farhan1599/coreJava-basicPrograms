import java.util.Scanner;

public class PalindromeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		isPalindrome(num);
	}

	private static void isPalindrome(int num) {
		int temp, remainder, sum = 0;
		temp = num;
		while (num > 0) {
			remainder = num % 10;
			sum = (sum * 10) + remainder;
			num /= 10;
		}
		if (temp == sum) {
			System.out.println("palindrome number");

		} else {
			System.out.println("not a palindrome number");
		}
	}
}
