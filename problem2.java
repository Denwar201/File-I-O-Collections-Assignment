package Assignment4;
import java.io.*;

public class problem2 {
		 public static void main(String args[]){ 
			 
			  try{    
			    FileInputStream file=new FileInputStream("C:\\java\\abc.txt");    
			    BufferedInputStream bin=new BufferedInputStream(file);    
			    int i;
			    char a;
			    while((i=bin.read())!=-1){  
			    	a=(char)i;
			     System.out.print(Character.toUpperCase(a));    
			    }    
			    bin.close();    
			    file.close();    
			  }catch(Exception e){
				  System.out.println(e);
				  }    
			 }    
}