package com.sapient.Shapes;

public class Triangle {

	private int side;
	private double area;

	public Triangle(int sideLength) {
		// TODO Auto-generated constructor stub
		this.side = sideLength;
	}

	public void calculateArea() {
		// TODO Auto-generated method stub
		area = 0.433*side*side;
		System.out.println("The area of the Triangle is " + area );
		
	}

}
