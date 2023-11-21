package com.prowings.Exercise;

public class RemoveWhiteSpaces
{
	public static void main(String[] args) 
	{
		String s1=" Samru ddhi ";
		System.out.println("Original String:" +s1);
		removeSpaces(s1);
    }

	private static void removeSpaces(String s1) 
	{
		s1=s1.trim().replaceAll(" ", "");
		System.out.println("After Remove Spaces:"+s1);	
	}
}
