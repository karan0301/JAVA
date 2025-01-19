package star_pattern;

public class sq1
{

	public static void main(String[] args)
	{
		for(int i=1;i<=6;i++)
		{
			for(int sp1=6;sp1>=i;sp1--)
			{
				System.out.print(" ");
			}
			for(int st=1;st<=i;st++)
			{
				System.out.print("*");
			}
			for(int sp2=2;sp2<=i;sp2++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
