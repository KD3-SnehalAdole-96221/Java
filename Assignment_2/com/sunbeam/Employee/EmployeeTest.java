package com.sunbeam.Employee;

import java.util.Scanner;

public class EmployeeTest {

	Employee emp1 = new Employee();
	

	void acceptRecord() {
	 Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String F_name = sc.nextLine();
		emp1.setF_Name(F_name);
		

		System.out.println("Enter Last Name: ");
		String L_name = sc.nextLine();
		emp1.setL_Name(L_name);
		

		System.out.println("Enter Salary: ");
		double Salary = sc.nextDouble();
		emp1.setSalary(Salary);
		

		emp1.YearlySal(Salary);
		emp1.IncreSal(Salary);
	}

	void PrintRecord() {
		System.out.println(" first name: " + emp1.getF_Name());
		System.out.println(" Last Name: " + emp1.getL_Name());
		System.out.println(" monthly Salary: " + emp1.getSalary());
		System.out.println(" salary: " + emp1.YearlySal(0));
		System.out.println("Increamented Salary: " + emp1.IncreSal(0));

	}

	public static void main(String args[]) {
		EmployeeTest empT = new EmployeeTest();
		empT.acceptRecord();
		empT.PrintRecord();
	}

}
