package search;

import java.util.Scanner;

public class search{
	public static void main(String[] args)
	{int c=0;
		int arr[]=new int[] {50,51,52,5,78,8,2,63,64,59,89,52,13};
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the element to be searched");
	int s=x.nextInt();
	for(int i=0;i<arr.length;i++)
	{if(arr[i]==s)
	{System.out.println("Element Found at "+i+"th location");
		c++;
		}		
	}
	if(c==0)
	{System.out.println("Element not found");}
	
	
		
	}
	
}