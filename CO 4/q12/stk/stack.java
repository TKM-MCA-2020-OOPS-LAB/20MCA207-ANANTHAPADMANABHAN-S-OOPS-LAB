package stk;
import java.util.*;
public class stack {
	public static void main(String args[])
	{
		
		Stack<String> stack = new Stack<String>();

		stack.add("Athira");
		stack.add("Kannan");
		stack.add("Nanadu");
		stack.add("Abi");
		stack.add("Vivek");

	
		System.out.println("Stack: " + stack);

		String rem = stack.remove(1);

		System.out.println("Removed element: "+ rem);

		System.out.println("Final Stack: "+ stack);
	}
}