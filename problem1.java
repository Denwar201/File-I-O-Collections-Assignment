package Assignment4;
import java.io.*;

public class problem1 {
	public static void main(String args[]) {
	File file1 = new File("C:\\java\\abc.txt");
	System.out.println("File name :" + file1.getName());
	System.out.println("path :" + file1.getPath());
	System.out.println("Absolute path :" + file1.getAbsolutePath());
	System.out.println(file1.exists() ? "File exists" : "File does not exists");
	System.out.println(file1.isDirectory() ? "File is a directory" : "File is not a directory");
	System.out.println(file1.isFile() ? "File is an ordinary file" : "File is not an ordinary file");
	}
}
	
