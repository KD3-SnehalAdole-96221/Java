package com.sunbeam;

import java.util.Iterator;
import java.util.Scanner;



class StringPallindrome
{
	
	public StringPallindrome()
	{
		
	}
	
	public void StringPallindrome(String str)
	
	{
		char c[]=str.toCharArray();
		String reverse="";
		
		for(int i=c.length-1;i>=0;i--)
		{
			reverse+=c[i];
		}
		
		System.out.println(reverse);
		if(reverse.equalsIgnoreCase(str))
		{
			System.out.println("String is Pallindrome");
		}
		else
		{
			System.out.println("Not a Pallindrome");
		}
		
	
		
	}
	
}



public class Pallindrome {
	
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String: ");
	String str=sc.nextLine();
	StringPallindrome sp = new StringPallindrome();
	
	sp.StringPallindrome(str);
	
	
}
	
	
}
