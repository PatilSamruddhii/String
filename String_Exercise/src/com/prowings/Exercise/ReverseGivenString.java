package com.prowings.Exercise;

import java.util.Scanner;

public class ReverseGivenString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s1 = sc.next();
		System.out.println("Original String:"+s1);
		isReverse(s1);
	}
		
	private static String isReverse(String s1)
	{
		StringBuffer sb =new StringBuffer(s1);
		System.out.println("Reversed String:"+sb.reverse());
		return s1;

	}
		
	}

