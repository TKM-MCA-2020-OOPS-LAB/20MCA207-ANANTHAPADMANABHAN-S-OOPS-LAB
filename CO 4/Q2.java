package Q4;

import java.util.Scanner;

//Create an Arithmetic package that has classes and interfaces for the 4 basic arithmetic 
//operations. Test the package by implementing all operations on two given numbers 
interface operation
{ public void add();
public void sub();
public void mul();
public void div();
	
}
class operate implements operation{

	
	public void add(int a,int b) {
		// TODO Auto-generated method stub
		int sum =a+b;
		System.out.print("Addition : "+sum+"\n");
	}

	public void sub(int a,int b) {
		// TODO Auto-generated method stub
		int subt=a-b;
		System.out.print("Substraction : "+subt+"\n");

	}

	
	public void mul(int a,int b) {
		// TODO Auto-generated method stub
		int pdt=a*b;
		System.out.print("Multiplication : "+pdt+"\n");
	}

	
	public void div(int a,int b) {
		// TODO Auto-generated method stub
		float dv=a/b;
		System.out.print("Division : "+dv+"\n");
	}
	
}
public class main{
	public static void main(String[] args)
	{int x,y;
	Scanner x1=new Scanner(System.in);
	System.out.print("Enter 1st no: ");
	x=x1.nextInt();
	System.out.print("Enter 2nd no: ");
	y=x1.nextInt();
	operate b =new operate();
	b.add(x,y);
	b.sub(x,y);
	b.mul(x,y);
	b.div(x,y);
	
		
	}
}