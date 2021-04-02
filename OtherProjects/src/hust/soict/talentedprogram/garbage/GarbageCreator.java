package hust.soict.talentedprogram.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GarbageCreator {
	// Run with heap size = 2MB. Heap space error! 
	public static void main(String[] args) {
		String s=new String("");
		try {
		      File myObj = new File("C:\\Users\\James\\Downloads\\enwik8\\enwik8.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        s += myReader.nextLine();
	
		      }
		      System.out.print(s);
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
			
	}
}
