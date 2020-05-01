package com.sapient.Shapes;

public class Square {

	private int side;
	private int area;

	public Square(int sideLength) {
		// TODO Auto-generated constructor stub
		this.side = sideLength;
	}

	public void calculateArea() {
		// TODO Auto-generated method stub
		area = side * side;
		System.out.println("The area of the Square is " + area);
	}

}
