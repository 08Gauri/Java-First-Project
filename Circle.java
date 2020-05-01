package com.sapient.Shapes;

public class Circle {

	private int radius;
	private double area;

	public Circle(int sideLength) {
		// TODO Auto-generated constructor stub
		this.radius = sideLength;
	}

	public void calculateArea() {
		// TODO Auto-generated method stub
		area = 3.14*radius*radius;
		System.out.println("The area of the circle is " + area);
		
	}

}
