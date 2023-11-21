package com.prowings.Exercise;

import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s1 =sc.next();
		System.out.println("Original String:"+s1);
		
		String result=(isPalindrome(s1))?"Palindrome":"NotPalindrome";
		
		System.out.println("Given String s1 is:"+result);
	}
	
	
		private static boolean isPalindrome(String s1) 
	{
		StringBuffer sb = new StringBuffer(s1);
		String reversed=sb.reverse().toString();
		System.out.println("revrsed String:"+reversed);
	    if(s1.equals(reversed)) 
		{
		  return true;
		}
		else 
		  return false;	
	}


}
