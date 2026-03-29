//2)  (Credit Limit Calculator) 
//Develop a Java application that determines whether any of several 
//department-store customers has exceeded the credit limit on a 
//charge account. 
//For each customer,the following facts are available: 
//a) account number 
//b) balance at the beginning of the month 
//c) total of all items charged by the customer this month 
//d) total of all credits applied to the customer’s account this 
//month 
//e) allowed credit limit. 
//The program should input all these facts as integers, calculate 
//the new balance (= beginning balance+ charges – credits), 
//display the new balance and determine whether the new balance 
//exceeds the customer’s credit limit. For those customers whose 
//credit limit is exceeded, the program should display 
//the message "Credit limit exceeded". 


package sunbeam.calculator;

import java.util.Scanner;

public class Customer {
	
		int accounNumber;
		int beginningBalance;
		int totalCharges;
		int totalCredits;
		int creditLimit;

		public Customer(int accounNumber, int beginningBalance, int totalCharges, int totalCredits, int creditLimit) {
			this.accounNumber = accounNumber;
			this.beginningBalance = beginningBalance;
			this.totalCharges = totalCharges;
			this.totalCredits = totalCredits;
			this.creditLimit = creditLimit;
		}

		public int calculateNewBalance() {
			int newBalance = beginningBalance + totalCharges - totalCredits;
			return newBalance;
		}

		public void checkCreditLimit() {
			if (calculateNewBalance() > creditLimit) {
				System.out.println("Credit limit exceeded");
			}
		}
	

		
		
	}
	
	
	
	
	

	


