package com.Sapient.Numbers;
import java.util.*;
public class KeyReadLine2 {

	private int[] arr;
	private int index;

	public void performOperations() {
		// TODO Auto-generated method stub
		KeyReadLine2 kr = new KeyReadLine2();
		kr.read();
		kr.find();
		kr.sort();
		kr.display();
		
	}

	private void read() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter numbers of the array seperated by space");
		String[] t = s.nextLine().split(" ");
		int n = t.length;
		this.arr = new int[n];
		int i = 0;
		for(String str : t)
		{
			this.arr[i] = Integer.parseInt(str);
			i++;
		}
	}

	private void sort() {
		// TODO Auto-generated method stub
		Arrays.sort(this.arr);
		
	}

	private void find() {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i : arr)
			al.add(i);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to be searched : ");
		int x = s.nextInt();
		this.index = al.indexOf(x); 
		
	}

	private void display() {
		// TODO Auto-generated method stub
		
		System.out.println("The index is " + this.index);
		System.out.println("The sorted array is ");
		for (int i : arr)
			System.out.print(" " + i);
		
	}

}
