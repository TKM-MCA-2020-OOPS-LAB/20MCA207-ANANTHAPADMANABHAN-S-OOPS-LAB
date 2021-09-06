package smal;
public class string_manip {

	public static void main(String[] args)
	{
		String str = "hEllo, mY NamE iS Ananathapadmanabhan S ";
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		String sub = str.substring(4,20);
		System.out.println(sub);
		
		String str2 ="   hello   ";
		String trim = str2.trim();
		System.out.println(trim);
		
		String str3 = "hello";
		String str4 = "name";
		System.out.println(str3 + " " +str4);
		
		System.out.println(str3.compareTo("hello")); 
		
	}
}
