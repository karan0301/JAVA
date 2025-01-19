package Java_core;

import java.util.Scanner;

public class loopq1 
{
    public static void main(String[] argv)
    {
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9};
        int flag = 0;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number to be searched:");

        int num = n.nextInt();

        // Fix the loop condition to ensure valid array indices (0 to arr.length - 1)
        for (int i = 0; i < arr.length; i++)  // Use i < arr.length to avoid out-of-bounds error
        {
            if (arr[i] == num)
            {
                System.out.println("Number is present");
                flag = 1;
                break;  // Exit the loop once the number is found
            }
        }

        // If flag is still 0, the number is not present
        if (flag == 0)
        {
            System.out.println("Number is not present");
        }

        n.close(); // Close the scanner to prevent resource leak
    }
}
