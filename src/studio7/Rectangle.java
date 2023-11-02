package studio7;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	double length;
	double width;
	public Rectangle (double length, double width) {
		
		this.length = length;
		this.width = width;
		
			
	}
		
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return length * 2 + width * 2;
	}
	
	public boolean CompareWith(Rectangle other) {
		return this.getArea() < other.getArea();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("length of rectangle a:");
		double lengtha = in.nextInt();
		System.out.println("width of rectangle a:");
		double widtha = in.nextInt();
		
		
		Rectangle a = new Rectangle(lengtha, widtha);
		System.out.println("perimeter of rectangle a:" + a.getPerimeter());
		System.out.println("area of rectangle a:" + a.getArea());
		
		
		System.out.println("length of rectangle b:");
		double lengthb = in.nextInt();
		System.out.println("width of rectangle b:");
		double widthb = in.nextInt();
		Rectangle b = new Rectangle(lengthb, widthb);
		a.CompareWith(b);
			
		
	}

}
