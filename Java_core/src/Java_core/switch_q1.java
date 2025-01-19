package Java_core;

import java.util.Scanner;

public class switch_q1 
{
	public static void main(String argv[])
	{
		Scanner n= new Scanner (System.in);
		System.out.println("Enter the first number");
		int num = n.nextInt();
		
		Scanner n1= new Scanner (System.in);
		System.out.println("enter the Second number");
		int num1 = n1.nextInt();
		
		Scanner n3= new Scanner(System.in);
		System.out.println("Enter the operation");
		System.out.println("1: + ");
		System.out.println("2: - ");
		System.out.println("3: * ");
		System.out.println("4: / ");
		System.out.println("5: % ");
		int operator = n3.nextInt();
		
		switch(operator)
		{
			case 1:
			{
				System.out.println(num+num1);
				break;
			}
			case 2:
			{
				System.out.println(num-num1);
				break;
			}
			case 3:
			{
				System.out.println(num*num1);
				break;
			}
			case 4:
			{
				System.out.println(num/num1);
				break;
			}
			case 5:
			{
				System.out.println(num%num1);
				break;
			}
			default:
			{
				System.out.println("invalid output");
			}
		
		}
		
		
		
	}
	
	
}
