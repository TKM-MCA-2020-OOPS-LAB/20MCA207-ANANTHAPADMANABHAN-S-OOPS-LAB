package employee;

import java.util.Scanner;

class Employee{
	int eid;
	String ename,eaddress;
	float esalary;
Employee() {
		Scanner x =new Scanner(System.in);
		System.out.println("Enter EMPLYOEE ID");
		eid=x.nextInt();
		System.out.println("Enter EMPLYOEE NAME");
		ename=x.next();
		System.out.println("Enter EMPLYOEE SALARY");
		esalary=x.nextFloat();
		System.out.println("Enter EMPLYOEE ADDRESS");
		eaddress=x.next();
	}
		}
class Teacher extends Employee{
	String dept,subjects;
	Teacher() {
	Scanner x =new Scanner(System.in);
	System.out.println("Enter DEPARTMENT");
	dept=x.next();
	System.out.println("Enter SUBJECT");
	subjects=x.next();
	}
	void display() {
		System.out.println("EMPLYOEE ID :"+eid);
		System.out.println("EMPLYOEE NAME :"+ename);
		System.out.println("EMPLYOEE SALARY :"+esalary);
		System.out.println("EMPLYOEE ADDRESS :"+eaddress);
		System.out.println("DEPARTMENT :"+dept);
		System.out.println("SUBJECTS TAUGHT :"+subjects+"\n");
		
	}

	public static void main(String[] args) {
		int n;
		
		System.out.println("Enter no.of datas");
		Scanner y =new Scanner(System.in);
		n=y.nextInt();
		Teacher ob1[]=new Teacher[n];
		for(int i=0;i<n;i++)
		{
		ob1[i]= new Teacher();
		}
		System.out.println("DETAILS:\n");
		for(int i=0;i<n;i++)
		{ob1[i].display();
		}
	}
}