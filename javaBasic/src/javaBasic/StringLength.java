package javaBasic;

import java.util.Scanner; //import

public class StringLength {
	
	public static int len() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("7개의 단어를 입력: ");
		
		String stname[] = new String[7];
		
		int count = 0;
		
		for(int i = 0; i<stname.length; i++) {
			stname[i] = sc.next();
			
			count += stname[i].length(); 
		}
		
		sc.close();
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = len();
		
		System.out.println(value);
		
		if(value > 50)
			System.out.println("A");
		else
			System.out.println("B");

	}

}