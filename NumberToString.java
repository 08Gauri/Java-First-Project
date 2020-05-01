package com.Sapient.Numbers;

import java.util.HashMap;
import java.util.Scanner;

public class NumberToString {

	public static void convert() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("\n\nEnter the number");
		int number  = s.nextInt();
		
		HashMap<Integer,String> twoDigit = new HashMap<>();
		twoDigit.put(10,"ten");
		twoDigit.put(20,"twenty");
		twoDigit.put(30,"thirty");
		twoDigit.put(40,"forty");
		twoDigit.put(50,"fifty");
		twoDigit.put(60,"sixty");
		twoDigit.put(70,"seventy");
		twoDigit.put(80,"eighty");
		twoDigit.put(90,"ninty");
		
		HashMap<Integer,String> oneDigit = new HashMap<>();
		oneDigit.put(1,"one");
		oneDigit.put(2,"two");
		oneDigit.put(3,"three");
		oneDigit.put(4,"four");
		oneDigit.put(5,"five");
		oneDigit.put(6,"six");
		oneDigit.put(7,"seven");
		oneDigit.put(8,"eight");
		oneDigit.put(9,"nine");
		
		String numberAsString = "";
		int x;
		int thousand = number / 1000;
		x = thousand;
		String temp = "";
		thousand = thousand % 10;
		x -= thousand;
		if(twoDigit.containsKey(x))
			temp = twoDigit.get(x);
		
		numberAsString += temp + " ";
		temp = "";
		x  = thousand;
		if(oneDigit.containsKey(x))
			temp = oneDigit.get(x);
		
		numberAsString += temp + " ";
		if(temp != "")
			numberAsString += "thousand ";
		temp = "";
		int hundred = number%1000;
		x = hundred;
		hundred %= 100;
		
		x -= hundred;
		if(oneDigit.containsKey(x))
			temp = oneDigit.get(x);
		
		numberAsString += temp;
		if(temp != "")
			numberAsString += " hundred ";
		temp = "";
		int tens = number%100;
		x = tens;
		tens %= 10;
		
		x -= tens;
		if(twoDigit.containsKey(x))
			temp = twoDigit.get(x);
		
		numberAsString += temp + " ";
		
		temp = "";
		if(oneDigit.containsKey(tens))
			temp = oneDigit.get(tens);
		
		numberAsString += temp ;
		
		
		
		
		System.out.println(numberAsString);
		
		
	}

}
