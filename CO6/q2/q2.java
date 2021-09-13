package q2;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;  
public class q2 {  
    public static void main(String args[]) throws IOException{    
         try{    
           FileWriter fw=new FileWriter("demo.txt");    
           fw.write("Ananthapadmanabhan S \n");   
           fw.write("S2 MCA \n");
           fw.write("207MCA2020");
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success !!");  
          
          FileReader fr=new FileReader("demo.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close(); 
     }    
}  