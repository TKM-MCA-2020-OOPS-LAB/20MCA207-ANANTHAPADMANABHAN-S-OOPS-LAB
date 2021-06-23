package Q9;

import java.util.Scanner;

public class bsort{
	public static void main(String[] args) {
	    int n,i,j,tmp;
	    Scanner x = new Scanner(System.in);
	 
	    System.out.println("Enter range");
	    n = x.nextInt();
	 
	    int arr[] = new int[n];
	 
	    System.out.println("Enter Elements : \n");
	 
	    for (i = 0; i < n; i++) 
	      arr[i] = x.nextInt();
	 
	    for (i=0;i<n-1;i++) {
	      for (j=0;j<n-i-1;j++) {
	        if (arr[j]>arr[j+1]) 
	        {
	           tmp = arr[j];
	           arr[j] = arr[j+1];
	           arr[j+1] = tmp;
	        }
	      }
	    }
	 
	    System.out.println("Sorted Array:\n");
	 
	    for (i = 0; i < n; i++) 
	      System.out.println(arr[i]);
	  
}

}