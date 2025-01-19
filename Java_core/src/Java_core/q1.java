package Java_core;

import java.util.Scanner;

public class q1 
{
	public static void main(String[] args)
	{
		Scanner num = new Scanner(System.in);
		System.out.println("enter a number:");
		int a= num.nextInt();
		
		if(a>=0)
		{
			System.out.println(a+ "is a positive number");
			
		}
		else
		{
			System.out.println(a + "  "+ "is a odd number");
		}
		
	}
}
