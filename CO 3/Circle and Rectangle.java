package shapes;

import java.util.Scanner;

interface rc
{ public void area();
 public void perimeter();	
}
class rectangle implements rc
{	int l,b,ra,rp;
 rectangle(){
	 Scanner x=new Scanner(System.in);
	 System.out.print("Enter Length");
	 l=x.nextInt();
	 System.out.print("Enter Breadth");
	 b=x.nextInt();
 }

public void area()
{
	ra=l*b;
	System.out.print("Area of Rectangle:"+ra+"\n");
	
}

public void perimeter()
{
	rp=2*(l+b);
	System.out.print("Perimeter of Rectangle:"+rp+"\n");
}
}
class circle implements rc
{int r;
float ca,cp;
circle()
{ Scanner x=new Scanner(System.in);
        System.out.print("Enter Radius");
           r=x.nextInt();
}

public void area() 
{
	ca=(float) ((3.14)*r*r);
	System.out.print("Area of Circle:"+ca+"\n");
}
public void perimeter()
{
	cp=(float) (2*3.14*r);
	System.out.print("Perimeter of Circle"+cp+"\n");
}	
}
public class main
{public static void main(String[] args)
	{int op; 
	Scanner x=new Scanner(System.in);
    System.out.print("1.Rectangle \n");
    System.out.print("2.Circle \n");
    System.out.print("Enter Option \n");
    op=x.nextInt();
    if(op==1)
    {rectangle ob1=new rectangle();
    ob1.area();
    ob1.perimeter();
    }
    else if(op==2)
    {circle ob2=new circle();
    ob2.area();
    ob2.perimeter();
    }
    
	
	}
	
}
