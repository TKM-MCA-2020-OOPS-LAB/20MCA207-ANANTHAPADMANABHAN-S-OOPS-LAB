package book;

import java.util.Scanner;

class publisher{
	Scanner x = new Scanner(System.in);
	String pname;
	publisher(){
		System.out.print("Enter Publisher Name:");
		pname=x.next();
}
}
class book extends publisher{
	String bname,author;
	book()
	{System.out.print("Enter Book Name:");
	bname=x.next();
	System.out.print("Enter Author Name:");
	author=x.next();		
	}
}
class literature extends book{
	literature(){
		
	}
	void display()
	{System.out.print("PUBLISHER: "+pname+"\n");
	System.out.print("BOOK: "+bname+"\n");
	System.out.print("AUTHOR: "+author+"\n");		
	System.out.print("\n");
	}
}
class fiction extends book{
	fiction()
	{}
	void display()
	{System.out.print("PUBLISHER: "+pname+"\n");
	System.out.print("BOOK: "+bname+"\n");
	System.out.print("AUTHOR: "+author+"\n");	
	System.out.print("\n");
	}	
}
public class main{
	public static void main(String[] args)
	{int n,m;
	Scanner y = new Scanner(System.in);
	System.out.print("Enter no.of Literature Records:");
		m=y.nextInt();
		literature ob1[] = new literature[m];
		for(int i=0;i<m;i++)
		{ob1[i]= new literature();		}
		
		System.out.print("Enter no.of Fiction Records:");
		n=y.nextInt();
		fiction ob2[] = new fiction[n];
		for(int i=0;i<n;i++)
		{ob2[i]= new fiction();		}
		
		System.out.print("BOOKS RECORDED ARE: \n \n");	
		
		System.out.print("LITERATURE:\n");
		for(int i=0;i<m;i++)
		{ob1[i].display();}
		
		System.out.print("\n");
		
		System.out.print("FICTION:\n");
		for(int i=0;i<n;i++)
		{ob2[i].display();}
		
		
	
}
	}