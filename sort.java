package sort;

import java.util.Scanner;

public class sort{
	public static void main(String[] args) {
		int c;
		String tp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements");
		c=sc.nextInt();
		
		String str[]= new String[c];
		System.out.println("Enter elements");
		for(int i=0;i<c;i++)
		{str[i]=sc.nextLine();}
		for(int i=0;i<c;i++)
		{for(int j=i+1;j<str.length;j++)
		{if(str[i].compareTo(str[j])>0)
		{tp=str[i];
		str[i]=str[j];
		str[j]=tp;}
		}}
		System.out.println("Sorted Array: \n");
		for(int i=0;i<c;i++)
		{System.out.println(str[i]);}
		
		
		
	}
	
}