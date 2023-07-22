package javaProject;
import java.util.Scanner; //Scanner import


class Card2{
	String shape; // 모양을 저장하는 문자열 shape선언  
	int num; // 숫자를 저장하는 num선언
	
	//입력이 없는 경우 => 완전 랜덤으로 생성
	public Card2() {
		this.shape = rand_shape(); //shape = 랜덤 메소드를 통해 받은 랜덤 모양
		this.num = rand_num(); //num = 랜덤 메소드를 통해 받은 랜덤 숫자
	}
	
	//입력으로 모양만 받으면 => 해당 모양과 임의의 번호로 출력
	public Card2(String shape){
		this.shape = shape; //shape = 입력받은 string shape
		this.num = rand_num(); //num = 랜덤 메소드를 통해 받은 랜덤 숫자
	}
	
	//입력으로 숫자를 받으면 => 해당 숫자와 임의의 모양을 출력
	public Card2(int num) {
		this.shape = rand_shape(); //shape = 랜덤 메소드를 통해 받은 랜덤 모양
		this.num = num; //num = 입력받은 num
	}
	
	//입력으로 모양과 숫자 => 그대로 출력
	public Card2(String shape, int num) {
		this.shape = shape; //shape = 입력받은 shape
		this.num = num; //num = 입력받은 num
	}
	
	//랜덤한 숫자를 생성하는 메소드(1~13)
	public int rand_num() {
		return (int)(Math.random()*13 + 1); //1부터 13까지의 수 중에서 임의로 한 수 뽑음
	}
	
	//랜덤한 0~3까지의 수를 생성한 뒤, 해당 수를 이용해 랜덤한 모양을 반환하는 메소드
	public String rand_shape() {
		String nshape[] = {"CLOVER", "HEART", "DIAMOND", "SPADE"};
		int randshape = (int)(Math.random()*4); //0~3까지의 수 중에서 임의로 한 수 뽑음
		
		return nshape[randshape];
	}

	//card를 출력하는 메소드(숫자 11 = J, 12 = Q, 13 = K, 1 = A, 나머제 숫자는 그대로 출력)
	public void print() {	
		System.out.print(shape + " ");
		
		if(num == 11)
			System.out.println("J");
		else if(num == 12)
			System.out.println("Q");
		else if(num == 13)
			System.out.println("K");
		else if(num == 1)
			System.out.println("A");
		else
			System.out.println(num);
	}
}



public class CardGame2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);//Scanner 선언
		
		System.out.println("모양(CLOVER, HEART, DIAMOND, SPACE), 숫자(1-A, 11-J, 12-Q, 13-K)");
		
		//입력으로 모양과 숫자 => 그대로 출력
		System.out.println("1. 입력을 타입과 숫자 => 그대로 출력");
		System.out.print("모양과 숫자를 입력: ");
		String shape = sc.next();
		int num = sc.nextInt();
		Card2 player1 = new Card2(shape, num);
		player1.print();
		
		//입력으로 모양만 받으면 => 해당 모양과 임의의 번호로 출력
		System.out.println("2. 모양만 입력 받음 => 해당 모양과 랜덤번호로 출력");
		System.out.print("모양 입력: ");
		shape = sc.next();
		Card2 player2 = new Card2(shape);
		player2.print();
		
		//입력으로 숫자를 받으면 => 해당 숫자와 임의의 모양을 출력
		System.out.println("3. 숫자만 입력 받음 => 해당 숫자와 랜덤모양으로 출력");
		System.out.print("숫자 입력: ");
		num = sc.nextInt();
		Card2 player3 = new Card2(num);
		player3.print();
		
		//입력이 없는 경우 => 완전 랜덤으로 생성
		System.out.println("4. 기본생성자는 모양과 숫자 둘다 랜덤으로 출력");
		System.out.print("랜덤 카드: ");
		Card2 player4 = new Card2();
		player4.print();
		
		
		sc.close();
		
	}

}