package javaProject;
import java.util.Scanner;

class Card{
	String shape; // 모양 String배열  
	String num; // 숫자 String배열
	
	Card(){
		
	}

	public void print() {
		System.out.println(shape + " " + num);
	}
}


public class CardGame_ver1 {
	
	
	public static void compete(Card player1, Card player2) {
		String[] nshape = {"CLOVER","HEART","DIAMOND","SPADE"}; // 모양 String배열 (모양을 순서대로 저장)
		String[] nnum = {"2","3","4","5","6","7","8","9","10","J","Q","K","Ace"}; // 숫자 String배열(숫자를 순서대로 저장)
		
		int shapevalue1 = 0;	//플레이어1의 카드 모양의 순서를 저장
		int shapevalue2 = 0;	//플레이어2의 카드 모양의 순서를 저장
		for(int i=0; i<4; i++) {
			if(nshape[i].equals(player1.shape))
				shapevalue1 = i;	
		}
		for(int j=0; j<4; j++) {
			if(nshape[j].equals(player2.shape))
				shapevalue2 = j;
		}
		
		int numvalue1 = 0;	//플레이어1의 카드 숫자값의 순서를 저장
		int numvalue2 = 0;	//플레이어1의 카드 숫자값의 순서를 저장
		for(int i=0; i<13; i++) {
			if(nnum[i].equals(player1.num))
				numvalue1 = i;
		}
		for(int j=0; j<13; j++) {
			if(nnum[j].equals(player2.num))
				numvalue2 = j;
		}
		
		
		 int win = 2;
		 
	     if(numvalue1 > numvalue2)    // 플레이어1의 숫가가 더크다면 win에 1을 저장
	         win = 1;
	     else if(numvalue1 == numvalue2) {   // 두 카드의 숫가 값이 같다면
	    	 if(shapevalue1 > shapevalue2)   // 카드의 모양의 값이 카드 1이 더 크다면 win에 1을 저장
	            win = 1;   
	         else if (shapevalue1 == shapevalue2)   // 카드의 모양이 같다면 win에 0을 저장 = 무승부
	            win =0;
	     }
	     
	      
	     if(win > 0)   
	    	 System.out.println("player" + win + "이 이겼습니다!!");
	     else if(win == 0)    // win의 값이 0이면 무승부
	         System.out.println("무승부 입니다.");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Card player[] = new Card[2];
		for(int i=0; i<2; i++) {
			player[i] = new Card();
		}
		
		//플레이어의 카드 모양과 숫자를 입력받아 저장
		for(int i=0; i<2; i++) {
			System.out.print((i+1) + "번 플레이어의 카드의 모양과 숫자를 순서대로 입력하시오: ");
			player[i].shape = sc.next();
			player[i].num = sc.next();
			
		}
		
		//플레이어의 카드를 출력
		//1. 각 카드의 내용을 출력
		player[0].print();
		player[1].print();
		
		//compete메소드를 통해서 승리한 플레이어를 출력
		//compete = 2. 카드의 크기를 비교하는 메소드
		compete(player[0], player[1]);


		
		sc.close();
		
	}

}
