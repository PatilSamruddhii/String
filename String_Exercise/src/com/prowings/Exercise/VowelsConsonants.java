package com.prowings.Exercise;

import java.util.Scanner;

public class VowelsConsonants 
{
  public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s =sc.next();
		
		s=s.toLowerCase();
		countVowelConsonats(s);

	}
		
	private static String countVowelConsonats(String s)
	{			
		int vowelcount=0;
		int consonantcount=0;
	
		for(int i=0; i<s.length();++i)
		{
			char s1= s.charAt(i);
			
			if(s1>='a' && s1<='z') 
			{
				if(s1=='a' || s1=='e' || s1=='i' || s1=='o' || s1=='u') 
				{
					vowelcount++;
				}
				else
				{consonantcount++;}
			}	
				
			}
		System.out.println("Vowel count Of Given String:"+vowelcount);
		System.out.println("consonant count of GivenString:"+consonantcount);
		return s;
	}

	
	}

