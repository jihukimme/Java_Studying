package javaBasic;

import java.util.Scanner; //import

public class CtoFtoC {
	

	//메소드 CtoF
	public static double CtoF(double a) {
		
		double f = (9.0/5.0 * a) + 32.0;
		
		return f;
	}
	
	//메소드 FtoC
	public static double FtoC(double f) {
		
		double c = 5.0/9.0 * (f-32.0);
	
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("번호를 선택하시오: ");
		
		Scanner choice = new Scanner(System.in);
		int b = choice.nextInt();
		
			if(b==1) {
			System.out.println("섭씨를 입력하시오: ");
			
			double a = choice.nextDouble();
			
			System.out.println(a + "C -> " + CtoF(a) + "F");

			}
			else {
			System.out.println("화씨를 입력하시오: ");
			
			double f = choice.nextDouble();
			
			System.out.println(f + "F -> " + FtoC(f) + "C");
			
			}

			choice.close();
	}

}