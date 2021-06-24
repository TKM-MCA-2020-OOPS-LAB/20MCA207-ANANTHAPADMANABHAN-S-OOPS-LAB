package Q10;

import java.util.ArrayList;
import java.util.Collections;

public class Arrlst {
public static void main(String[] args) {
		
		
		
		 ArrayList<String> x = new ArrayList<String>();
		 		 
	      x.add("Car");
	      x.add("Bus");
	      x.add("Bike");
	      x.add("Lorry");
	      	     	      
	      System.out.println("\nArrayList:");
	      for(String str:x)
	         System.out.println(str);
	       
	      x.add(4, "Train");
	      
	      System.out.println("\n Add Operation");
	      System.out.println("\n New ArrayList");
	      for(String str:x)
	         System.out.println(str);
	     	      
	      x.remove("Bus");
	      System.out.println("\n Remove Operation \n");
	      System.out.println("\n New ArrayList:");
	      for(String str:x)
	         System.out.println(str);
	      
	      x.remove(3); 
	      System.out.println("\n New ArrayList:");
	      for(String str:x)
	         System.out.println(str);
	            
	      Collections.sort(x);
	      
	      System.out.println("\n Sorted List:");
	      for (String str : x) 
	         System.out.println(str);
	
	      
	      System.out.println("\n Data at index 1:"+x.get(1));  
	      
	      System.out.println("\n Bike is in the ArrayList :"+x.contains("Bike"));
	      System.out.println("\n Boat is in the ArrayList :"+x.contains("Boat"));	      
	      System.out.println("\n Size :"+x.size());	      
	      x.clear();	      
	      System.out.println("\nList Removed");
	      
	
	}

}