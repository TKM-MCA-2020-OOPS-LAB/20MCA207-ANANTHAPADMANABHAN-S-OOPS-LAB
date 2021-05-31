package over;
public class main{
	int a1,a2;
	double a3;
	void area(int s)
	{
	a1=s*s;
	System.out.println("Area of Square: "+a1+"\n");
	}
	void area(int l,int b) {
		a2=l*b;
		System.out.println("Area of Rectangle: "+a2+"\n");
	}
	void area(double r) {
		a3=3.14*r*r;
		System.out.println("Area of Circle: "+a3+"\n");
	}
public static void main(String[] args) {
	int s,l,b;
	double r;
	main x = new main();
	x.area(5);
	x.area(5,10);
	x.area(10.55);
	
}
}