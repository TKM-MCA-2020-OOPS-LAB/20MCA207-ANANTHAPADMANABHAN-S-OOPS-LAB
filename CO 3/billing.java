package billing;

import java.util.Scanner;

interface calculate
{
	void find();
}
class bill implements calculate
{int pid,price,qty;
long total;
String name;
 bill()
 {
	 Scanner x = new Scanner(System.in);
	 System.out.print("Enter Product Id: \n");
	 pid=x.nextInt();
	 System.out.print("Enter Name: \n");
	 name=x.next();	 
	 System.out.print("Enter Price: \n");
	 price=x.nextInt();
	 System.out.print("Enter Quantity: \n");
	 qty=x.nextInt();
	 
	 
	 
 }

	@Override
	public void find() {
		// TODO Auto-generated method stub
		total=price*qty;
		
	}
	void display()
	{
		 
		 System.out.print(pid+"\t\t"+name+"\t\t"+qty+"\t\t"+price+"\t\t"+total+"\n");
		
	}
	
}
public class billing{
	public static void main(String[] args) {
		int n;
		Scanner x = new Scanner(System.in);
		System.out.print("Enter no.of items: \n");
		n=x.nextInt();
		
		bill ob[]=new bill[n];
		for (int i=0; i<n;i++) {
			ob[i]=new bill();
		}
		System.out.print("BILL \n");
		System.out.print("PRODUCT ID\t"+"NAME\t"+"   QUANTITY\t"+"    PRICE\t"+"    TOTAL\n");
		System.out.print("______________________________________________________________________________ \n");
		for (int i=0; i<n;i++) {
			ob[i].find();
			ob[i].display();
		}
		
	}
}