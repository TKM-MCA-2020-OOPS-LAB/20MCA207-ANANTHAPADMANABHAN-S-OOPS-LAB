package shapes1;
import java.util.Scanner;
interface rct
{
public void rectangle();
public void square();
public void circle();
public void triangle();}
public class shapes implements rct {
	public void rectangle()
	{	int l,b,ra;
	 
		 Scanner x=new Scanner(System.in);
		 System.out.print("Enter Length");
		 l=x.nextInt();
		 System.out.print("Enter Breadth");
		 b=x.nextInt();
		 ra=l*b;
			System.out.print("Area of Rectangle:"+ra+"\n");
	 }


	public void square(){
	int s,sa;

		Scanner x=new Scanner(System.in);
	    System.out.print("Enter Side");
	      s=x.nextInt();
	      sa=s*s;
			System.out.print("Area of Square:"+sa+"\n");
		
		


	}
	public void circle()
	{int r;
	float ca;

	 Scanner x=new Scanner(System.in);
	        System.out.print("Enter Radius");
	           r=x.nextInt();
	           ca=(float) ((3.14)*r*r);
	       	System.out.print("Area of Circle:"+ca+"\n");

	}

	public void triangle()
	{
		int b,h;
		float ta;
		
			Scanner x=new Scanner(System.in);
			System.out.print("Enter base:");
	        b=x.nextInt();
	        System.out.print("Enter height:");
	        h=x.nextInt();
	        ta=(float) ((0.5)*b*h);
			System.out.print("Area of Square:"+ta+"\n");
			
		}

	}

