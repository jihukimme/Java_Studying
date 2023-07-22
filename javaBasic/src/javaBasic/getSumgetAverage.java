package javaBasic;
import java.util.Scanner;

public class getSumgetAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("데이터의 수를 입력하시오: ");
		int num = sc.nextInt();
		
		int data[] = new int[num];
		int max = 0;
		int sum = 0;
		
		System.out.println("숫자를 입력하시오: ");
		for(int i = 0; i<num; i++) {
			data[i] = sc.nextInt();
			
			if(max<data[i])
				max = data[i];
			
			sum += data[i];
		}

		System.out.println("max: " + max);
		System.out.println("average: " + sum/data.length);
	
		
		sc.close();
	}

}