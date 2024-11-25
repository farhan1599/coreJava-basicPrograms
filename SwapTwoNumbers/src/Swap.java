
public class Swap {
	public static void main(String[] args) {

		// swapping to numbers using third variable

		int num1 = 100;
		int num2 = 20;
		int c = num1;
		System.out.println("before swapping num1 is:" + num1);
		System.out.println("before swapping num2 is :" + num2);
		num1 = num2;
		num2 = c;
		System.out.println("_".repeat(40));
		System.out.println("after swapping num1 is :" + num1);
		System.out.println("after swapping num2 is  :" + num2);

		// swapping two numbers without using third variable
		System.out.println("=".repeat(40));
		int x = 10;
		int y = 20;
		System.out.println("before swapping x is:" + x);
		System.out.println("before swapping y is :" + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("_".repeat(40));
		System.out.println("after swapping x is :" + x);
		System.out.println("after swapping y is  :" + y);
	}
}
