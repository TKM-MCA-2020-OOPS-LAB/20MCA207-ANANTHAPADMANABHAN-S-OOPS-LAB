package q11;
import java.util.*;
public class SNPS {
	
	public static void main(String[] args) {
	    LinkedList<String> student = new LinkedList<>();

	    student.add("Adithyan");
	    student.add("Abhinand");
	    student.add("George");
	    student.add("Kiran");
	    student.add("Gokul");
	    System.out.println("Students in SNPS: " + student);

	   
	    String str = student.remove(3);
	    System.out.println("Removed student: " + str);
      
	    
	    System.out.println("Updated List: " + student);
	 
        student.clear();
 
        
        System.out.println("List after clearing all elements: " + student);
  
	  }
}