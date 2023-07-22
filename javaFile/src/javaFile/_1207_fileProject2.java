package javaFile;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Member implements Serializable {

	private String name;
	private String number;
	
	public Member() {}
	public Member(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	public void displayInfo() {
		System.out.println("----- 회원 정보 -----");
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + number);
        System.out.println();
	}
}

public class _1207_fileProject2 {
	
	public static final String FILEPATH = "member.dat";
	public static final String KPATH = "C:\\Users\\jihu\\OneDrive\\바탕 화면\\김지후 파일\\대학 자료\\22학년도 2-2\\자바\\자바_강의자료\\14(b) 파일입출력_바이트스트림.pdf";
	public static final String SAVEPATH1 = "1byte.pdf";
	public static final String SAVEPATH2K = "2kbyte.pdf";

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		
		//
		//1byte 단위로 읽고 쓰는 방식
		FileInputStream f1 = new FileInputStream(KPATH);
		FileOutputStream o1 = new FileOutputStream(SAVEPATH1);
		
		int i;
		while ((i = f1.read()) != -1) {
			o1.write(i);
		}
		
		//2KB 단위로 읽고 쓰는 방식
		f1 = new FileInputStream(KPATH);
		o1 = new FileOutputStream(SAVEPATH2K);
		int K2 = 2*1024;
		BufferedInputStream b1 = new BufferedInputStream(f1, K2);
		byte b[] = new byte[K2];
		while ((i = b1.read(b)) != -1) {
			o1.write(b);
		}
		
		o1.close();
		f1.close();
		o1.close();
		//
		//
		
		
		
		//member 클래스의 객체를 파일로 저장하고, 읽어서 출력하는 시스템을 만드시오.
		try (
				FileOutputStream out = new FileOutputStream(FILEPATH);
				ObjectOutputStream oout = new ObjectOutputStream(out);
				InputStream in = new FileInputStream(FILEPATH);
				ObjectInputStream oin = new ObjectInputStream(in);) {

			//member생성 후 저장
			Member m1 = new Member("지후", "1234");
			oout.writeObject(m1);
			Member m2 = new Member("이순신", "4124");
			oout.writeObject(m2);
			Member m3 = new Member("이몽룡", "12456");
			oout.writeObject(m3);

			Member dataRead;
			
			while (true) {
				dataRead = (Member)oin.readObject();
				dataRead.displayInfo();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 끝");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
