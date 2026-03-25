
//Create a class called Employee that includes three instance variables—a 
//first name (type String), a last name (type String) and a monthly salary 
//(double). Provide a constructor that initializes the three instance variables. 
//Provide a set and a get method for each instance variable. If the monthly 
//salary is not positive, do not set its value. Write a test application named 
//EmployeeTest that demonstrates class Employee’s capabilities. Create two 
//Employee objects and display each object’s yearly salary. Then give each 
//Employee a 10% raise and display each Employee’s yearly salary again.package com.sunbeam.Employee;
package com.sunbeam.Employee;
public class Employee {
	private String F_Name;
	private String L_Name;
	private double Salary;
	
	Employee()
	{
		
	}
	
	public Employee(String F_Name, String L_Name, double Salary) 
	{
		setF_Name(F_Name);
		setL_Name(L_Name);
		setSalary(Salary);
		
		
	}

	public String getF_Name() {
		return F_Name;
	}

	public void setF_Name(String f_Name) {
		F_Name = f_Name;
	}

	public String getL_Name() {
		return L_Name;
	}

	public void setL_Name(String l_Name) {
		L_Name = l_Name;
	}

	public double getSalary() {
		return Salary;
	}
	

	public void setSalary(double salary) {
		if(salary>0)
		{
			Salary = salary;
		}
		else
		{
			System.out.println("Enter valid Positive salary: ");
		}
	}
	double yearSal=0.0;
	
	public double YearlySal(double salary)
	{
		yearSal=12*Salary;
		return yearSal;
	}
	double incSal=0.0;
	public double IncreSal(double salary)
	{
		incSal=Salary+Salary*0.1;
		return incSal;
	}
	
	

	

}
