package Q6;

import java.util.Scanner;

class fibbino implements Runnable{
	public void run()
	{int n,i,a=0,b=1,c=0;
	Scanner x = new Scanner(System.in);
	System.out.print("Enter range for fibonacci \n");
	n=x.nextInt();
	System.out.print("Fibonacci Series:\n");
	for(i = 1; i <= n; i++)
    {
        a = b;
        b = c;
        c = a + b;
        System.out.println(c);
       
    }
	
		
	}
}
class even implements Runnable
{public void run()
	{int n,i;
	Scanner y = new Scanner(System.in);
	System.out.print("Enter range for Even numbers: \n");
	n=y.nextInt();
	System.out.print("Even numbers: \n");
i=1;
	while(i<=n)
	{
		if(i%2==0)
			{System.out.print(i+" ");}
		i++;
	}
	
	}
	
}
public class q6
{public static void main(String args[]) throws InterruptedException  {
	fibbino a= new fibbino();
	Thread p= new Thread(a);
	even b=new even();
	Thread q=new Thread(b);
	p.start();
	Thread.sleep(200);
	q.start();
	Thread.sleep(200);
}
	
}