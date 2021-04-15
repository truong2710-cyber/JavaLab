package hust.soict.talentedprogram.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// Run with heap size = 2MB. No error.
public class NoGarbage {
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("");
		try {
		      File myObj = new File("C:\\Users\\James\\Downloads\\enwik8\\enwik8.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        s.append(myReader.nextLine());
	
		      }
		      System.out.print(s);
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
			
	}
}
