import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number");
		int x = sc.nextInt();
		System.out.println("Please enter second number");
		int y = sc.nextInt();
		double z = Math.pow(x, y);
		System.out.println("Power = " + z);
	}
}
