package javaBasic;

import java.util.Scanner;

//정수값을 입력으로 받는다.
//입력받은 정수의 갯수만큼 random number를 생성한다.
//생성한 number를 배열에 저장한다.
//배열에 저장된 값의 합과 평균을 구한다.

public class RandomAverage {
	
	public static int addarr(int data[]) {
		
		int sum = 0;
		for(int i =0; i<data.length; i++) {
			sum += data[i];
		}
		
		return sum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("숫자를 입력하시오: ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for(int i=0; i<num; i++) {
			int r = (int)(Math.random() * 10 + 1);
			arr[i] = r;
		}
		
		for(int i = 0; i<num; i++) {
			System.out.println("생성된 랜덤수는 "+arr[i]);
		}
		
		int sum = addarr(arr);
		 
		
		System.out.println("생성 된 랜덤수들의 합은 "+ sum);
		
		double av = (double)sum/arr.length;
		System.out.println("생성 된 랜덤수들의 평균은 "+av);
		
		sc.close();
		
	}

}