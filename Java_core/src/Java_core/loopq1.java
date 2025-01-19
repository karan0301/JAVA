package Java_core;

import java.util.Scanner;

public class loopq1 
{
	public static void main(String[] argv)
	{
		int arr[]= {2,3,4,5,6,7,8,9};
		int flag=0;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number to be searched\n");
		
		int num = n.nextInt();
		
		for(int i=0;i<=arr.length;i++)
		{
			if(arr[i]==num)
			{
				System.out.println("number is present");
				flag=1;
				break;
			}
			
		}
		if(flag==0)
		{
			System.out.println("number is not present");
		}
		
		
	}

}
