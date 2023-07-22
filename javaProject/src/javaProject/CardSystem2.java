package javaProject;
import java.util.Scanner;


class CardS2 implements Comparable<CardS2>{
	
	int num1;
	int shape1;

	CardS2(){
		
	}
	
	
	String type[] = {"CLOVER", "HEART", "DIAMOND", "SPADE"};
	String num[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "SPADE", "ACE"}; 
	
	
	public void print() {
		System.out.println(type[shape1] + " " + num[num1]);
	}

	@Override
	public int compareTo(CardS2 player2) {
		int win = 2;
		 
	     if(this.num1 > player2.num1)    // 플레이어1의 숫가가 더크다면 win에 1을 저장
	         win = 1;
	     else if(this.num1 == player2.num1) {   // 두 카드의 숫가 값이 같다면
	    	 if(this.shape1 > player2.shape1)   // 카드의 모양의 값이 카드 1이 더 크다면 win에 1을 저장
	            win = 1;   
	         else if (this.shape1 == player2.shape1)   // 카드의 모양이 같다면 win에 0을 저장 = 무승부
	            win =0;
	     }
	     
	      
	     if(win > 0)   
	    	 System.out.println("player" + win + "이 이겼습니다!!");
	     else if(win == 0)    // win의 값이 0이면 무승부
	         System.out.println("무승부 입니다.");
		
		return win;
	}

	
}



public class CardSystem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardS2 compare = new CardS2();
		CardS2 compare2 = new CardS2();
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("카드값을 입력하여 주세요(ACE = 13)(0 ~ 13) : ");
	    compare.num1 = sc.nextInt();
	    System.out.println("카드값을 입력하여 주세요(0 : CLOVER 1: HEART 2: DIAMOND 3: SPADE ) : ");
	    compare.shape1 = sc.nextInt();
	   
	    
	    System.out.println("카드값을 입력하여 주세요(ACE = 13)(0 ~ 13) : ");
	    compare2.num1 = sc.nextInt();
	    System.out.println("카드값을 입력하여 주세요(0 : CLOVER 1: HEART 2: DIAMOND 3: SPADE ) : ");
	    compare2.shape1 = sc.nextInt();
		
		
		compare.print();
		compare2.print();
		compare.compareTo(compare2);
		
		sc.close();
	}

}
