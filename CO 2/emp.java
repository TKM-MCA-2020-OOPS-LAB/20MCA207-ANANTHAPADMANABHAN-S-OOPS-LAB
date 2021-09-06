package emp;
import java.util.*;

public class employeerec {


		int eno,esalary;
		String ename;
		
		public void getinfo()
		{
			Scanner inp1 = new Scanner(System.in);
			System.out.println("Enter Employee No : ");
			eno = inp1.nextInt();
			System.out.println("Enter Employee Name : ");
			ename = inp1.next();
			System.out.println("Enter Employee Salary : ");
			esalary = inp1.nextInt();
			
		}
		
		public void display()
		{
			System.out.println("Employee No : "+eno);
			System.out.println("Employee Name : "+ename);
			System.out.println("Employee Salary : "+esalary);
			
		}
		
		public static void main(String[] args)
		{
			int i;
			
			Scanner inp2 = new Scanner(System.in);
			System.out.println("Enter no.of employees ");
			int no = inp2.nextInt();
			
			employeerec arr[] = new employeerec[no];
			
			
			for(i=0;i<no;i++)
			{
				 arr[i] = new employeerec();
				 arr[i].getinfo();
			}
			
			System.out.println("Enter employee no of the employee to get the details :");
			int choice = inp2.nextInt();
			
			
			boolean check = false;
			
			for(i=0;i<no;i++)
			{
				if(choice == arr[i].eno)
				{
					check = true;
					break;
				}
				
			}
			if(check == true)
			{
				arr[i].display();
			}
			else
			{
				System.out.println("Employee not found");
			}
			
			
			
		}

	

}