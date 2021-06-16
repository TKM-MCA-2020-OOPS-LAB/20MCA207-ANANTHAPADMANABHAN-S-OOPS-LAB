package Q5;

import java.util.Scanner;

class mtable extends Thread
{public void run()
	{System.out.print("MULTIPLICATION TABLE OF 5 \n");
			for(int i=1;i<=10;i++)
			{System.out.print("5 x "+i+"="+5*i+"\n");
						}
	
	}
	
}
class prime extends Thread
{public void run()
	{
	int n,status=1,num=3;
	Scanner q =new Scanner(System.in);
	System.out.print("Enter range for prime numbers: \n");
	n=q.nextInt();
	if (n >= 1)
    {
       System.out.println("First "+n+" prime numbers are:");
       //2 is a known prime number
       System.out.println(2);
    }

    for ( int i = 2 ; i <=n ;  )
    {
       for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
       {
          if ( num%j == 0 )
          {
             status = 0;
             break;
          }
       }
       if ( status != 0 )
       {
          System.out.println(num);
          i++;
       }
       status = 1;
       num++;
    }          
	
	}
	
}
public class q5
{
	public static void main(String[] args)throws InterruptedException {
		mtable x = new mtable();
		x.start();
		x.sleep(200);
		
		prime y = new prime();
		y.start();
		y.sleep(200);
	}
}