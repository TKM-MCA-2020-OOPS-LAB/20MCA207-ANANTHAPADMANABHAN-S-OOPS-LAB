package areas;
import java.util.Scanner;

public class method
{int area,area1;
float area2;
void area(int a)
{area=a*a;
System.out.println("Area of Square:"+area);
}
void area(int a,int b)
{area1=a*b;
System.out.println("Area of Rectangle:"+area1);
}
void area(int a,int b,float c)
{area2=a*b*c;
System.out.println("Area of Triangle:"+area2);
}
public static void main(String[] args) {
	int a,b;
	float c=(float) 0.5;
	Scanner x = new Scanner(System.in);
	method ob = new method();
	System.out.println("Enter values for a,b");
	a=x.nextInt();
	b=x.nextInt();
	ob.area(a);
	ob.area(a,b);
	ob.area(a,b,c);
}
}