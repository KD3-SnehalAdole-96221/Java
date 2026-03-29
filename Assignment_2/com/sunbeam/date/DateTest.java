package com.sunbeam.date;
import java.util.Scanner;
public class DateTest {
    	Date dt1=new Date();
    	void acceptRecord()
    	{	Scanner sc=new Scanner(System.in);
    		System.out.println("Enter day: ");
    		int day=sc.nextInt();
    		dt1.setDay(day);
    		System.out.println("Enter month: ");
    		int month=sc.nextInt();
    		dt1.setMonth(month);
    		System.out.println("Enter Year: ");
    		int year=sc.nextInt();
    		dt1.setYear(year);    		
    		
    	}
    	
    	
    	void displayRecord()
    	{
    		dt1.displayDate();
    	}
    	
    	public static void main(String[] args) 
    	{
    		DateTest dtt1=new DateTest();
    		dtt1.acceptRecord();
    		dtt1.displayRecord();
		}
    	
    	
    	
    	
}