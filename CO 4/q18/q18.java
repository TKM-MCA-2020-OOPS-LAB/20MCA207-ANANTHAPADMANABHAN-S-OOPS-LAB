package max;

import java.util.*;
import java.util.stream.*;

public class q18 
{
	public static void main(String args[]) {
	      Map<String, String> map = new HashMap<>();
	      map.put("1", "Thiruvanthapuram");
	      map.put("2", "Kollam");
	      map.put("3", "Pathanamthitta");
	      map.put("4", "Alapuzha");
	      map.put("5", "Idukki");
	      map.put("6", "Kottayam");
	      map.put("7", "Ernakulam");
	      map.put("8", "Thrissur");
	      map.put("9", "Palakkad");
	      System.out.println("HashMap = " + map);
	      Map<String, String> treeMap = new TreeMap<>();
	      treeMap.putAll(map);
	      System.out.println("HashMap to TreeMap " + treeMap);
	   }
}
