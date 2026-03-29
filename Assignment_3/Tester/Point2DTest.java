package Tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class Point2DTest {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter X and Y co-ordinates for point 1: ");
		Point2D pt1= new Point2D(sc.nextInt(),sc.nextInt());
		
		
		System.out.println("Enter X and Y co-ordinates for point 2:  ");
		Point2D pt2=new Point2D(sc.nextInt(),sc.nextInt());
		
		System.out.println("Point 1 details: " + pt1.getDetails());
		System.out.println("Point 2 details: " + pt2.getDetails());
		
		boolean res=pt1.isEqual(pt2);
		
		if(res)
		{
			System.out.println("No Distance");
		}
		else
		{
			System.out.println("Distance between X and Y: "+pt1.calculateDistance(pt2));
			
		}
		
	}
	

}
