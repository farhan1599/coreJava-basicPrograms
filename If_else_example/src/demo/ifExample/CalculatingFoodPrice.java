package demo.ifExample;

import java.util.Scanner;

public class CalculatingFoodPrice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer type(Regular/Guest)");
		String customerType = sc.nextLine();
		System.out.println("Enter food name (Biryani/Chapathi)");
		String foodType = sc.nextLine();
		System.out.println("Enter quantity");
		double quantity = sc.nextDouble();

		double biryaniPricePerUnit = 200.0;
		double chapathiPricePerUnit = 60.0;
		double totalPrice = 0.0;

		if (foodType.equalsIgnoreCase("biryani")) {
			totalPrice = quantity * biryaniPricePerUnit;
		}
		if (foodType.equalsIgnoreCase("chapathi")) {
			totalPrice = quantity * chapathiPricePerUnit;
		}
		totalPrice = totalPrice - totalPrice * 0.05;

		if (customerType.equalsIgnoreCase("regular")) {
			totalPrice = totalPrice - totalPrice * 0.10;
		}
		System.out.println("Customer type :" + customerType);
		System.out.println("Food name :" + foodType);
		System.out.println("Quantity :" + quantity);
		System.out.println("Total Price :" + totalPrice);
	}

}
