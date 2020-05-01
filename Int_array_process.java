package com.Sapient.Week4;

import java.util.Arrays;

public class Int_array_process {

	private int[] array;
	private int size;
	private int sum;
	private int largest;
	private Object smallest;
	private int secondLargest;

	public Int_array_process() {
		// TODO Auto-generated constructor stub
		array = new int[10];
		this.size = 10;
	}
	
	public Int_array_process(int i) {
		// TODO Auto-generated constructor stub
		array = new int[i];
		this.size = i;
	}
	
	public Int_array_process(int[] arr) {
		array = new int[arr.length]; 
		this.size = arr.length;
		int i = 0;
		for(int x : arr)
		{
			array[i] = x;
			i++;
		}
		
	}
	
	public void readArray()
	{
		Read read = new Read();
		
		for(int i = 0 ; i < this.size ; i++)
			array[i] = read.nextIntegerInput();
	}
	
	public void displayVertically()
	{
		for(int element : array)
			System.out.println(element);
	}
	
	public void displayHorizontally()
	{
		for(int element : array)
			System.out.print(element + "  ");
	}
	
	
	public void sortArray()
	{
		Arrays.parallelSort(this.array);
	}
	
	public void sum()
	{
		for(int element : array)
			this.sum += element;
	}
	
	public void largestElement()
	{
		sortArray();
		this.largest = array[0];
	}
	
	public void smallestElement()
	{
		sortArray();
		this.smallest = array[this.size - 1];  
	}
	
	public void secondLargest()
	{
		largestElement();
		for(int i = this.size - 2 ; i >= 0 ; i--)
		{
			if(array[i] != this.largest)
				this.secondLargest = array[i];
		}
	}
}
