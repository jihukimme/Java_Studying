package javaBasic;

import java.util.Scanner; //import

public class StudentInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("이름, 학번, 학년, 전공을 입력: ");
		Scanner a = new Scanner(System.in);
		
		String name = a.next();
		System.out.println("이름은" + name);
		
		int number = a.nextInt();
		System.out.println("학번은" + number);
		
		int grade = a.nextInt();
		System.out.println("학년은" + grade);
		
		String maj = a.next();
		System.out.println("전공은" + maj);
		
		
		a.close();
	}

}