//2. Accept 2 double values from User (using Scanner). Check data type. If 
//arguments are not doubles, supply suitable error message & terminate. 
//If numbers are double values, print its average
import java.util.Scanner;

public class Assign1Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the double values: ");
		double num1 = 0;
		double num2 = 0;

		System.out.println("Enter Num1: ");

		if (!sc.hasNextInt() && sc.hasNextDouble())
		{

			num1 = sc.nextDouble();
			sc.nextLine();
			

		}

		else {
			System.out.println("Entered values are not double values Enter the Double values please: ");
		}
		
		
		if (!sc.hasNextInt() && sc.hasNextDouble())
		{
			System.out.println("ENter Num2:");

			num2 = sc.nextDouble();

		}

		else {
			System.out.println("Entered values are not double values Enter the Double values please: ");
		}


		double average;
		average = (num1 + num2) / 2;
		System.out.println("Average: " + average);

	}

}
