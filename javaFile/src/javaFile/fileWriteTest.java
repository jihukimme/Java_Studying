package javaFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriteTest {

	public static void main(String[] args){
		// TODO Auto-generated method stub
				
		String s = "hi bro im so tired";
		
		try (FileWriter fw = new FileWriter(new File("output.txt"))){
			fw.write("안녕");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
