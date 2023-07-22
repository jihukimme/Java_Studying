package javaBasic;

public class ShiftAlgorithm {
	
	//shift시키는 메소드
	public static void shft(int arr[][]) {
		
		int arr1[] = new int[3];
		
		for(int i =0; i<3; i++) {
			arr1[i] = arr[2][i];
		}
		
		for(int i=2; i>0; i--) {
			for(int z =0; z<3; z++) {
				arr[i][z] = arr[i-1][z];
			}
		}
		
		for(int i=0; i<3; i++) {
			arr[0][i] = arr1[i];
		}
		
				
	}
	
	//배열을 출력하는 메소드
	public static void pf(int arr[][]) {
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
	
		//1차
		shft(arr);
		pf(arr);
		
		//2차
		shft(arr);
		pf(arr);
		
		//3차
		shft(arr);
		pf(arr);

	}

}