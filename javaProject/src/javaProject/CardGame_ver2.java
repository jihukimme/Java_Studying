package javaProject;
import java.util.Scanner;

class Card_ver2{
int num;   // 카드 넘버
int pic;   // 카드 문양

public Card_ver2() {}

public void show() {
   switch(pic) {
   case 0:
      System.out.print("CLOVER ");
      break;
   case 1:
      System.out.print("HEART ");
      break;
   case 2:
      System.out.print("DIAMOND ");
      break;
   case 3:
      System.out.print("SPADE ");
      break;
}
   if(num>10) {
      switch(num) {
      case 11:
         System.out.println("Jack");
         break;
      case 12:
         System.out.println("Queen");
         break;
      case 13:
         System.out.println("King");
         break;
      case 14:
         System.out.println("Ace");
         break;

      }
   }
   else
      System.out.println(num);
   }
}



public class CardGame_ver2 {

   public static void Card_draw(Card_ver2 card) {
      Scanner sc = new Scanner(System.in);
      System.out.println("카드값을 입력하여 주세요(ACE = 14)(2 ~ 14) : ");
      card.num = sc.nextInt();
      System.out.println("카드값을 입력하여 주세요(0 : CLOVER 1: HEART 2: DIAMOND 3: SPADE ) : ");
      card.pic = sc.nextInt();
      
      sc.close();
   }
   
   public static void Card_battle(Card_ver2 card1, Card_ver2 card2) {
      int win = 2;
      if(card1.num > card2.num)    // 카드 1이 더크다면 win에 1을 저장
         win = 1;
      else if(card1.num == card2.num) {   // 카드의 값이 같다면
         if(card1.pic > card2.pic)   // 카드의 문양의 값이 카드 1이 더 크다면 win에 1을 저장
            win = 1;   
         else if (card1.pic == card2.pic)   // 카드의 문양이 같다면 win에  0 저장 ( 무승부)
            win =0;
      }
      if(win > 0)   
         System.out.println("Card" + win + " 이겼습니다.");
      else if(win == 0)    // win의 값이 0 이라면 무승부
         System.out.println("같은 카드입니다.");
      
   }
   
   public static void main(String[] args) {
   Card_ver2 card1 = new Card_ver2();
   Card_ver2 card2 = new Card_ver2();
   
   Card_draw(card1);   //카드 입력받기
   Card_draw(card2); 
   
   card1.show();   //카드 확인
   card2.show();
      
   Card_battle(card1, card2);   // 카드 배틀
      
   }      
}
