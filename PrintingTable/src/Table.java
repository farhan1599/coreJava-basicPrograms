import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		getTable(num);
	}

	private static void getTable(int num) {
		for (int i = 1; i <= 10; i++) {
			int result = num * i;
			System.out.println(+num + "*" + i + "=" + result);
		}
	}
}
