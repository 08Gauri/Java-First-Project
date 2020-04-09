package com.sapient.week1;


import java.util.*;
import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{

	public static boolean checkEven(int a)
	{
		if(a%2 == 0)
			return true;
		return false;
	}

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

		System.out.println("Inside Main. Enter the number. Calling checkEven Method");

		Scanner s = new Scanner(System.in);
		int input = s.nextInt();

		if(checkEven(input))
			System.out.println("The Number is Even");
		else
			System.out.println("The Number is odd");	
	}
}

