package q3;
import java.util.Scanner;
class user extends Exception{
	public user(String a) {
		super(a);
	}
}
class pass extends Exception
{public pass(String a){
	super(a);
}	
}
public class chk{
	public static void main(String[] args) {
		String usr,pss,dusr,dpss;
		String c;
		dusr="Ananthapadmanabhan";
		dpss="qwerty";
		Scanner x=new Scanner(System.in);
		
		System.out.println("Enter UserName:");
		usr=x.nextLine();
		System.out.println("Enter Password:");
		pss=x.nextLine();
		
		try {
			if(!usr.equals(dusr))
				throw new user("\nUserName Error! \n");			
		else if(!pss.equals(dpss))
			throw new pass("Passwoard Error!\n");
		else
			System.out.print("Login Successful!!\n");
	}catch(user e) {
		System.out.print("Exception occured.."+e);}
		catch(pass e) {
			System.out.print("Exception occured.."+e);	
		}
		
	}
}