package com.Sapient.Numbers;

import java.util.*;
public class NumbersRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = args.length;
		int[] arr = new int[n];
		int i = 0;
		System.out.print("The input is ");
		for(String str : args)
		{
			arr[i] = Integer.parseInt(str);
			System.out.print(arr[i] + "   ");
			i++;
		}
		
		CommandLine1 cl = new CommandLine1();
		cl.performOperations(arr);
		
		KeyReadLine2 kr = new KeyReadLine2();
		kr.performOperations();
		
		NumberToString.convert();
		
	}	
}
