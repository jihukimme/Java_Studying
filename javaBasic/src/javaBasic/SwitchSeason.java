package javaBasic;
import java.util.Scanner;

public class SwitchSeason {
	
	public static void season(int num) {
		
			switch(num) {
			case 12:
				System.out.println("십이월");
				break;
			case 11:
				System.out.println("십일월");
				break;
			case 10:
				System.out.println("십월");
				break;
			case 9:
				System.out.println("구월");
				break;
			case 8:
				System.out.println("팔월");
				break;
			case 7:
				System.out.println("칠월");
				break;
			case 6:
				System.out.println("유월");
				break;
		
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("숫자를 입력하시오: ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		season(num);
		

		sc.close();
	}

}

