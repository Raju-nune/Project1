package com;

public class TryAndCatch
{
    
	public static void main(String[] args)
	{
		System.out.println("Hello");
		int a=1000;
		int b=0;
		try
		{
			int res=a/b;
			System.out.println("Result is"+res);
		}catch (Exception e) {
			System.out.println("Problem Solved");
		}
		System.out.println("Simple TryAndCatch Block");
	}

}
