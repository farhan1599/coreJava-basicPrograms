package demo.ifExample;

import java.util.Scanner;

public class LoginValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your username");
		String username = sc.next();
		System.out.println("Please enter your password :");
		String password = sc.next();
		if (username.equals("Farhan") && password.equals("Admin")) {
			System.out.println("Login Successfully");
		} else {
			System.out.println("Incorrect username or password !!");
		}
	}

}
