package Student;

import java.util.Scanner;

class student
{
	int rollno;
	String name;
	public student()
	{Scanner x = new Scanner(System.in);
	System.out.println("Enter ROLL NO: ");
	rollno=x.nextInt();
	System.out.println("Enter NAME: ");
	name=x.next();	
	}
}
class sports extends student
{
	int score;
	String item;
	public sports(){
		Scanner x = new Scanner(System.in);
		System.out.println("Enter ITEM: ");
		item=x.next();
		System.out.println("Enter SCORE ");
		score=x.nextInt();
	}
}
class result extends sports{
	public result() {}
	void display()
	{
		System.out.print("ROLL NO: "+rollno+"\n");
		System.out.print("NAME: "+name+"\n");
		System.out.print("ITEM: "+item+"\n");
		System.out.print("SCORE: "+score+"\n");
		
	}


	public static void main(String[] args) {
		
			int n;
			
			System.out.println("Enter no.of datas");
			Scanner y =new Scanner(System.in);
			n=y.nextInt();
			result ob1[]=new result[n];
			for(int i=0;i<n;i++)
			{
			ob1[i]= new result();
			}
			System.out.println("DETAILS:\n");
			for(int i=0;i<n;i++)
			{ob1[i].display();
			}
		}
	
	
	
}