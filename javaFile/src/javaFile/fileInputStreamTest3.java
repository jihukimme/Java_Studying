package javaFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileInputStreamTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FileInputStream으로 파일내용 전체 출력
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("input.txt");
			fos = new FileOutputStream("output.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		byte[] bs = new byte[8];
		int i =0;
		int count = 0;
		try {
			while((i=fis.read(bs)) != -1) {
				for(byte b:bs) {
					System.out.print((char)b);
					fos.write(b);
				}
				count++;
			}
			System.out.println(count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
