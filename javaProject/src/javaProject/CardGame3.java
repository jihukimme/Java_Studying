package javaProject;


class Card3{
	int shape; // 모양을 저장하는 shape선언  
	int num; // 숫자를 저장하는 num선언
	
	//입력이 없는 경우 => 완전 랜덤으로 생성
	public Card3() {
		this.shape = rand_shape(); //shape = 랜덤 메소드를 통해 받은 랜덤 모양
		this.num = rand_num(); //num = 랜덤 메소드를 통해 받은 랜덤 숫자
	}
	
	//모양을 랜덤으로 선택
	public int rand_shape() {
		return (int)(Math.random()*4); //0~3
	}
	
	//랜덤한 숫자를 생성하는 메소드(1~13)
	public int rand_num() {
		return (int)(Math.random()*13 + 2); //2부터 14까지의 수 중에서 임의로 한 수 뽑음
	}
	
	
	//card를 출력하는 메소드
	public void print() {	
		//모양 0 = CLOVER, 1 = HEART, 2 = DIACMOND, 3 = SPADE)
		if(shape == 0)
			System.out.print("CLOVER ");
		else if(shape == 1)
			System.out.print("HEART ");
		else if(shape == 2)
			System.out.print("DIAMOND ");
		else
			System.out.print("SPADE ");
		
		
		//숫자 11 = J, 12 = Q, 13 = K, 14 = A, 나머제 숫자는 그대로 출력
		if(num == 11)
			System.out.println("J");
		else if(num == 12)
			System.out.println("Q");
		else if(num == 13)
			System.out.println("K");
		else if(num == 14)
			System.out.println("A");
		else
			System.out.println(num);
	}
}


public class CardGame3 {
	
	public static void sorting(Card3 player[]) {
		//숫자가 더 크면 승리(2~10, J, Q, K, A)
		//숫자 같다면 모양 비교(CLOVER, HEART, DIACMOND, SPADE)
		
		//hard copy
		Card3 a[] = new Card3[10];
		for(int i=0;i<10;i++)
			a[i] = new Card3();
		for(int i=0;i<10;i++) {
			a[i].num = player[i].num;
			a[i].shape = player[i].shape;
		}
		
		int num[] = new int[10];
		int shape[] = new int[10];
		
		for(int i=0; i<10; i++) {
			num[i] = a[i].num;
			shape[i] = a[i].shape;
		}
		
		
		
		int temp = 0; //값을 임시로 저장하기 위한 temp
		//숫자 내림차순 정리
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 9 - i; j++) {
				if (num[j] < num[j + 1]) {	// 버블 정렬 사용
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		//모양 내림차순 정리
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 9 - i; j++) {
				if (shape[j] < shape[j + 1]) {	// 버블 정렬 사용
					temp = shape[j];
					shape[j] = shape[j + 1];
					shape[j + 1] = temp;
				}
			}
		}
		//내림차순 정리한 모양과 숫자를 객체 a배열에 저장
		for(int i=0; i<10; i++) {
			a[i].num = num[i];
			a[i].shape = shape[i];
		}
		
		//저장한 a배열 출력
		for(int i=0; i<10; i++) {
			a[i].print();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//카드 10장
		Card3 player[] = new Card3[10];
		for(int i=0; i<10; i++) {
			player[i] = new Card3();
		}
		
		System.out.println("모양(CLOVER, HEART, DIAMOND, SPADE), 숫자(2~10, J, Q, K, A)");
		
		//입력으로 모양과 숫자 => 그대로 출력
		System.out.println("랜덤 카드 10개 생성");
		
		//정렬하지 않은 카드 10장
		for(int i=0; i<10; i++) {
			player[i].print();
		}
		
		
		System.out.println("==========");
		System.out.println("내림차순 정렬");
		//내림차순 정렬
		sorting(player);
		
		
		//내림차순 정렬 전
		System.out.println("==========");
		System.out.println("내림차순 정렬 전");
		for(int i=0; i<10; i++) {
			player[i].print();
		}
		
	}

}
