package com.prowings.Exercise;

public class ReplaceCharacter 
{
	public static void main(String[] args)
	{
		String s1 ="acbsba";
		System.out.println("Original String:"+s1);
		replace(s1);
	}

	private static void replace(String s1) 
	{
		System.out.println("After replacement:"+s1.replaceAll("a","b"));
	}
}
