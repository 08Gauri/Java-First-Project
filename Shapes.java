package com.sapient.Shapes;

import java.util.*;
public class Shapes {

	private int noOfSides;
	private int sideLength;

	public Shapes(int noOfSides, int sideLength) {
		// TODO Auto-generated constructor stub
		this.noOfSides = noOfSides;
		this.sideLength = sideLength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number of sides");
		int noOfSides = s.nextInt();
		
		System.out.println("\nEnter the length of sides");
		int sideLength = s.nextInt();
		Shapes shape = new Shapes(noOfSides , sideLength);
		
		switch(noOfSides)
		{
			case 1:
			case 3:
			case 4:
				shape.calculateArea(noOfSides, sideLength);
				break;
			default:
				System.out.println("No shape Exists");
				
		}

	}

	private void calculateArea(int noOfSides2, int sideLength2) {
		// TODO Auto-generated method stub
		
		if(noOfSides == 1)
		{
			Circle c = new Circle(sideLength);
			c.calculateArea();
		}
		else if (noOfSides == 3)
		{
			Triangle t = new Triangle(sideLength);
			t.calculateArea();
		}
		
		else if (noOfSides == 4)
		{
			Square sq = new Square(sideLength);
			sq.calculateArea();
					
		}
		
	}

}
