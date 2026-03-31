package com.sunbeam;

import java.util.Scanner;



class StringCount
{
	
	
	public StringCount(){
		
	}
	
	public void CountWordsInString(String str)
	{	//str=str.trim();
		char ch[]=str.toCharArray();
		int count=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ' && (i==0 || ch[i-1]==' '))
			{
				count++;
			}
			
		}
		System.out.println("number of words in String are "+(count));
		
	}
	
	
	public void CountWords(String str)
	{
		str=str.trim();
		String words[]=str.split("\\s");
		System.out.println("No.Of Words in String are: "+words.length);
	}

}






public class CountNum {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		StringCount sp = new StringCount();
		
		sp.CountWordsInString(str);
		
		sp.CountWordsInString(str);
		
		
	}
	

}
