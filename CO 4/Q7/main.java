package Q7;
import java.util.ArrayList;
import java.util.List;

class Producer implements Runnable
{
    List<Integer> fstlist;
    int max_size = 5;
    int i=0;
    Producer(List<Integer> flist)
    {
        this.fstlist = flist;
    }
    @Override
    public void run() 
    {
        while(true)
        {
            try 
            {
                produce(i++);
            } catch (Exception e) 
            {
                System.out.println("Interuption "+e);
            }
        }
    }
    public void produce(int i) throws InterruptedException
    {
        synchronized (fstlist)
        {
            while(fstlist.size()==max_size)
            {
                System.out.println("Production is full,waiting for consuming");
                fstlist.wait();
            }
        }
        synchronized(fstlist)
        {
            System.out.println("Producer Produced "+i);
            fstlist.add(i);
            fstlist.notify();
        }
    }
    
}
class Consumer implements Runnable
{
    List<Integer> fstlist;
    Consumer(List<Integer> fstlist)
    {
        this.fstlist = fstlist;
    }

    @Override
    public void run() 
    {
        while(true)
        {
            try 
            {
                consume();
            } catch (Exception e) 
            {
                System.out.println("Exception "+e);
            }
        }
    }
    public void consume() throws InterruptedException
    {
        synchronized (fstlist)
        {
            while(fstlist.isEmpty())
            {
                System.out.println("Fully consumed, Need to produce");
                fstlist.notify();
                Thread.sleep(500);
                fstlist.wait();
            }
        }
        synchronized(fstlist)
        {
            Thread.sleep(1000);
            System.out.println("Consumer consumed "+fstlist.remove(0));
        }
    }
    
}
public class main {
    public static void main(String[] args) 
    {
        List<Integer> fstlist = new ArrayList<Integer>();
        Thread th1 = new Thread(new Producer(fstlist));
        Thread th2 = new Thread(new Consumer(fstlist));
        th1.start();
        th2.start();
    }
}