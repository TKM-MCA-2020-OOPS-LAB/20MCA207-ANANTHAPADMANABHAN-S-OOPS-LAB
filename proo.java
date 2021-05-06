package pro;
public class proo
{int pcode,price;
String pname;
	public static void main(String args[])
{
	proo x = new proo();
proo y = new proo();
proo z = new proo();
  x.pcode=1; 
  x.pname="first";
  x.price=20;
  
  y.pcode=2; 
  y.pname="second";
  y.price=50;
		
  
  z.pcode=3; 
  z.pname="third";
  z.price=15;
  System.out.println("Products are:");
  System.out.println(x.pcode+"\t"+x.pname+"\t"+x.price);
  System.out.println(y.pcode+"\t"+y.pname+"\t"+y.price);
  System.out.println(z.pcode+"\t"+z.pname+"\t"+z.price+ "\n \n");
  if(x.price<y.price&&x.price<z.price)
  {System.out.println("first product is lowest");}
  else if(y.price<x.price&&y.price<z.price)
  {System.out.println("second product is lowest");}
  else
  {System.out.println("third product is lowest");}
}
}
