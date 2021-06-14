package q41;

import java.util.Scanner;

class negative extends Exception
{
	negative()
	{
		super("Negative numbers not allowed \n");
	}
}
public class main {

	public static void main(String[] args) {
		
		int n,a,s=0;
		System.out.println("Enter the range");
		Scanner x=new Scanner(System.in);
		n=x.nextInt();
		
		for(int i=0;i<n;i++)
		{
			try
			{
				System.out.println("Enter number: ");
				a=x.nextInt();
				
				if(a<0)
				{
					i--;
					throw new negative();
				}
				else
				{
					s=s+a;
				}
				
			}
			catch(negative e)
			{
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Average: "+(s/n));
	}

}