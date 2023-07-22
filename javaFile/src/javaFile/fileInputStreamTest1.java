package javaFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileInputStreamTest1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		//FileInputStream으로 파일에 있는 내용 출력 .. 하나
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("input.txt");
			fos = new FileOutputStream("output.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
		//예외처리를 반드시 해줘야 함.
		
		int i=0;
		int count = 0;
		try {
			while((i = fis.read())!=-1) {
				System.out.print((char)i);
				fos.write(i);
				count++;
			}
			//i = 아스키 코드
			System.out.println(count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
