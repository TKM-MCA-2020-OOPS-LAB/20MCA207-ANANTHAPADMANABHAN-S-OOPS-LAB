package q44;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class q4{

	    public static void main(String[] args) throws IOException 
	    {
	        FileInputStream source = new FileInputStream ("C:\\Users\\kanna\\OneDrive\\Desktop\\integers.txt");
	        FileOutputStream odd = new FileOutputStream ("C:\\Users\\kanna\\OneDrive\\Desktop\\odd.txt");
	        FileOutputStream even = new FileOutputStream ("C:\\Users\\kanna\\OneDrive\\Desktop\\even.txt");
	        int i;
	        while((i = source.read()) != -1){
	            if(i%2==0) 
	            {

	                even.write(i);
	            }
	            else 
	            {
	                odd.write(i);
	            }
	        }
	        System.out.println("Copied Successfully !!");
	        source.close();
	        even.close();
	        odd.close();



	    }


}
