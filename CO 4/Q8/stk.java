package Q8;

import java.util.Scanner;

public class stk{
	public static void main(String[] args) {
		int i,n,o,d,r = 0;
		String ch = "y";
		int top=-1;
		int[] stack = new int[200];
		Scanner x =new Scanner(System.in);
		stk ob=new stk();
		System.out.print("Enter range : \n");
		n=x.nextInt();
		
		do {
		System.out.print("Enter the option: \n");
		System.out.print("1.Push \n");
		System.out.print("2.Pop \n");
		System.out.print("3.Display \n");
		o=x.nextInt();
		
		switch(o)
		{
		
		case 1:
			
			r=n;
			if(top==n-1) {
				System.out.print("Stack is full");
			}
			else {
				System.out.print("Enter elements: \n");
			
				top++;
				stack[top]=x.nextInt();
			}
			break;
		case 2:
			if(top==-1)
				System.out.print("Stack Empty \n");
			else {
			d=stack[top];
			top--;
			System.out.print("Deleted element: "+d+"\n");	}		
		break;
		case 3:
		System.out.print("Stack is: \n");
		for(i=0;i<r;i++)
		{ System.out.print(stack[i]+"\n");
			
		
		}
		break;
		default:
			{System.out.print("Invalid Option !!! \n");}
			
			System.out.print("Do you want to continue: y/n");
			
		ch=x.next();			
			}}while(ch=="y");
		
		
	}
}