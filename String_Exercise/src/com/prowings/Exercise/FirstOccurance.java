package com.prowings.Exercise;

public class FirstOccurance
{
	public static void main(String[] args)
	{
		String s1="SamruddiPatil";
		findFirstOccurance(s1);
		
	}

	private static int findFirstOccurance(String s1) 
	{
	    s1=s1.substring(8,12);
	   int result =s1.indexOf("t");
	   System.out.println("First Occurance Of Given Substring:"+result);
		return result;
	}
}
