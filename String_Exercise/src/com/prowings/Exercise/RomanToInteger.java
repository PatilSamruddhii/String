package com.prowings.Exercise;

import java.util.Scanner;

public class RomanToInteger 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("choose roman number:'I','IV','V','IX','X',"
				+ "'XL','L','XC','C','CD','D','CM','M'");
		String roman=sc.next();

		switch(roman) 
		{
		case"I":
			System.out.println(1);
			break;
		case"IV":	
			System.out.println(4);
			break;
		case"V":
			System.out.println(5);
			break;
		case"IX":
			System.out.println(9);
			break;
		case"X":
			System.out.println(10);
			break;
		case"XL":
			System.out.println(40);
			break;
		case"L":
			System.out.println(50);
			break;
		case"XC":
			System.out.println(90);
			break;
		case"C":		 
			System.out.println(100);
			break;
		case"CD":
			System.out.println(400);
			break;
		case"D":
			System.out.println(500);
			break;
		case"CM":
			System.out.println(900);
			break;
		case"M":
			System.out.println(1000);
			break;	
		default:
			System.out.println("invalid case");
		}
	}

}
