//Display food menu to user. User will select items from menu along with the 
//quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed 
//prices to food items(hard code the prices)  When user enters 'Generate Bill' 
//option , display total bill & exit.

import java.util.Scanner;

public class Assign1Q3 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("0.Exit:");
		System.out.println("1.Dosa  price:10rs");
		System.out.println("2.Samosa price :20rs");
		System.out.println("3.Idli price :30rs");
		System.out.println("4.Generate Bill: ");
		int choice;
		int quantity = 0;
		int DTotal_bill = 0;
		int STotal_bill = 0;
		int ITotal_bill = 0;
		int Total_bill = 0;
		do {

			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			

			switch (choice) {
			case 1: {
				System.out.println("Enter quantity for Dosa: ");
				quantity = sc.nextInt();
				DTotal_bill += 10 * quantity;
				System.out.println("Total Bill: " + DTotal_bill);
				break;
			}
			case 2: {
				System.out.println("Enter quantity Samosa: ");
				quantity = sc.nextInt();
				STotal_bill += 20 * quantity;
				System.out.println("Total Bill: " + STotal_bill);
				break;
			}
			case 3: {
				System.out.println("Enter quantity Idli: ");
				quantity = sc.nextInt();
				ITotal_bill += 30 * quantity;
				System.out.println("Total Bill: " + ITotal_bill);
				break;
			}
			case 4:
					{
						Total_bill = DTotal_bill + STotal_bill + ITotal_bill;
					System.out.println("************************");
					System.out.println("TOTAL BILL: "+Total_bill);
					System.out.println("*************************");}
			

			}

		}while(choice!=0);

}

}
