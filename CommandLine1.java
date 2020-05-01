package com.Sapient.Numbers;

public class CommandLine1 {

	private int[] arr;
	private int sum;
	private int max;
	private int min;
	private float avg;

	public void setData(int[] arr) {
		// TODO Auto-generated constructor stub
		int n = arr.length;
		this.arr = new int[n];
		for(int i = 0 ;  i < arr.length ; i++)
		{
			this.arr[i] = arr[i];
			
		}
	}

	public void calData() {
		// TODO Auto-generated method stub
		sumOfNumbers();
		averageOfNumbers();
		maxNumber();
		minNumber();
	}
	
	public void displayData()
	{
		System.out.println("The minimum number is " + this.min);
		System.out.println("The minimum number is " + this.max);		
		System.out.println("The average is " + this.avg);
		System.out.println("The Sum of numbers is " + this.sum);

	}

	private void minNumber() {
		// TODO Auto-generated method stub
		int n = arr.length;
		int min = arr[0];
		
		for(int i = 1 ; i < n ; i++)
		{
			if(min > arr[i])
				min = arr[i];
		}
		this.min = min;
		
	}

	private void maxNumber() {
		// TODO Auto-generated method stub
		int n = arr.length;
		int max = arr[0];
		
		for(int i = 1 ; i < n ; i++)
		{
			if(max < arr[i])
				max = arr[i];
		}
		this.max = max;
		
	}

	private void averageOfNumbers() {
		// TODO Auto-generated method stub
		int sum = this.sum;
		int n = arr.length;
		float avg = sum/n;
		this.avg = avg;
	}

	private void sumOfNumbers() {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int num : arr)
			sum += num;
		this.sum = sum;
		
	}

	public void performOperations(int[] arr2) {
		// TODO Auto-generated method stub
		System.out.println(arr2[2]);
		CommandLine1 cl = new CommandLine1();
		cl.setData(arr2);
		cl.calData();
		cl.displayData();
		
	}

}
