package com.sunbeam.invoice;

import java.util.Scanner;

public class InvoiceTest {
	Invoice ic = new Invoice();

	void acceptRecord() {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Part Number: ");
		String PartNumber = sc.nextLine();
		ic.setPartNumber(PartNumber);

		System.out.println("Enter PartDescription: ");
		String partDescription = sc.nextLine();
		ic.setPartNumber(partDescription);

		System.out.println("Enter Quantity: ");
		int Quantity = sc.nextInt();
		ic.setQuantity(Quantity);

		System.out.println("Enter Part Price: ");
		double Price = sc.nextDouble();
		ic.setPrice(Price);

	}

		public void printRecord() {
			System.out.println("PartNumber : " + ic.getPartNumber());
			System.out.println("partDescription : " + ic.getPartDescription());
			System.out.println("Quantity : " + ic.getQuantity());
			System.out.println("Price : " + ic.getPrice());
			System.out.println("Calculate_Bill : " + ic.Calculate_Bill());
		
		}
	

	public static void main(String[] args) {
		
		InvoiceTest It=new InvoiceTest();
		It.acceptRecord();
		It.printRecord();

	}

}
