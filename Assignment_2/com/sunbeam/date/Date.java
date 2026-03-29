package com.sunbeam.date;

public class Date {
	private int day;
	private int month;
	private int year;
	public Date()
	{
		
	}
	
	public Date(int day, int month, int year)
	{
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
		public void displayDate() {
		// TODO Auto-generated method stub
//		System.out.println("Day: "+getDay()+"/"+ " Month: "+getMonth()+"/"+" Year: "+getYear());
		String formatted = String.format("%02d/%02d/%d", getMonth(), getDay(), getYear());
	    System.out.println("Date: "+formatted);

	}

}
