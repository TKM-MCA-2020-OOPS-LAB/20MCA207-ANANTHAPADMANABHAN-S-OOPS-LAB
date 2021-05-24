package Person;

import java.util.Scanner;

class Person{
	String name;
	String gender;
	String address;
	int age;
	Person()
	{	Scanner x =new Scanner(System.in);
	System.out.println("Enter Name");
	name=x.next();
	System.out.println("Enter Gender");
	gender=x.next();
	System.out.println("Enter Address");
	address=x.next();
	System.out.println("Enter Age");
	age=x.nextInt();
		}
}
class Employee extends Person
{int empid;
String comp_name,qual;
float sal;
Employee()
{Scanner x =new Scanner(System.in);
System.out.println("Enter Employee ID");
empid=x.nextInt();
System.out.println("Enter Company Name");
comp_name=x.next();
System.out.println("Enter Qualification");
qual=x.next();
System.out.println("Enter Salary");
sal=x.nextFloat();
	
}
}
class Teacher extends Employee{
	String sub,dept;
	int tid;
	Teacher()
	{Scanner x =new Scanner(System.in);
	System.out.println("Enter Subject");
	sub=x.next();
	System.out.println("Enter Department");
	dept=x.next();
	System.out.println("Enter Teacher ID");
	tid=x.nextInt();
		
	}
	void display() {
		System.out.println("NAME :"+name);
		System.out.println("GENDER :"+gender);
		System.out.println("ADDRESS :"+address);
		System.out.println("AGE :"+age+"\n");
		System.out.println("EMPLOYEE ID :"+empid);
		System.out.println("COMPANY NAME :"+comp_name);
		System.out.println("QUALIFICATION :"+qual);
		System.out.println("SALARY :"+sal+"\n");
		System.out.println("SUBJECT :"+sub);
		System.out.println("DEPARTMENT :"+dept);
		System.out.println("TEACHER ID :"+tid+"\n");
	}
	public static void main(String[] args) {
        int n;
        Scanner y =new Scanner(System.in);
		System.out.println("Enter no.of datas :");
		n=y.nextInt();
		Teacher obj1[]=new Teacher[n];
		for(int i=0;i<n;i++)
		{
		obj1[i]= new Teacher();
		}
		System.out.println("DETAILS:\n");
		for(int i=0;i<n;i++)
		{obj1[i].display();
		}
		
	}
}