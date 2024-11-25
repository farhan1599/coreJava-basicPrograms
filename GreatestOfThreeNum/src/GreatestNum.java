import java.util.Scanner;

public class GreatestNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1 = sc.nextInt();
		System.out.println("Enter second number :");
		int num2 = sc.nextInt();
		System.out.println("Enter third number :");
		int num3 = sc.nextInt();
		int greatest = findGreatest(num1, num2, num3);
		System.out.println(greatest);
	}

	private static int findGreatest(int num1, int num2, int num3) {
		return ((num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3);

	}
}
