package com.sunbeam;

import java.util.Scanner;

class Reverse {
	String str;

	public Reverse() {

	}

	public Reverse(String str) {
		this.str = str;
	}

	String rstr;
	
	public void pr()
	{
	System.out.println("Strig before reverse: ");
		for(int i = 0;i<str.length();i++)
		{
			System.out.print(str.charAt(i));
		}
		
		System.out.println(str.length());
		System.out.println("String after reverse: ");
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
}

public class Program {
	

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		
		Reverse r1 = new Reverse(str);
		r1.pr();
	}

}
