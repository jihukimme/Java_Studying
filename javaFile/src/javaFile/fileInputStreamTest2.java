package javaFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileInputStreamTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File ipf = new File("input.txt");
		File opf = new File("output.txt");
		int count = 0;
		
		try (FileWriter fos = new FileWriter(opf)){
			FileReader fis = new FileReader(ipf);
			
			int i;
			String s="";
			while((i=fis.read()) != -1){
				System.out.print((char)i);
				s+=(char)i;
				//i = 아스키 코드
				count++;
			}
			System.out.println(count);
			fos.write(s);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
		//예외처리를 반드시 해줘야 함.
		
		
	}

}
