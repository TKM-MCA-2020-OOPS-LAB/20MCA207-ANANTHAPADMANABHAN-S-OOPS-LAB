package q17;
import java.util.*;
public class q17 {
	public static void main (String args[])
	{
		Map<Integer,String> hm=new HashMap<>();

		 hm.put(1, "Nandu");
	        hm.put(2, "Azhar");
	        hm.put(3, "Prajeesh");
	        System.out.println("Initial Map: "+ hm);
	        
	        hm.put( (2), "Vivek");
	        hm.put((4), "Abi");
	        //Updating..
	        System.out.println("Updated Map: " + hm);
	  
	        //Removing..
	        hm.remove(4);
	  
	        // Final Map..
	        System.out.println("After Removing fourth entry, Final Map: "+hm);
	}

}