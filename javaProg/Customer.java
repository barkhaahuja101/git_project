package javaProg;

import java.util.Scanner;



public class Customer {

	public static void main(String[] args) {
		ShoppingCart c1=new ShoppingCart();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the details of data:");
		int productId=sc.nextInt();
		String productName=sc.next();
		String desc=sc.next();
		double price=sc.nextDouble();
		ShoppingCart  c2=new ShoppingCart (productId,productName,desc,price);

		
		sc.close();
	}

}
