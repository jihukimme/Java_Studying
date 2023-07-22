package javaLastProject;

import java.util.*;

class Card implements Comparable<Card>{
   final String TYPE[] = {"CLOVER", "HEART", "DIAMOND", "SPADE"};
   final String NUMBER[] = {"2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING","ACE"};
   Integer number;
   Integer type;
   
   public Card(Integer number, Integer type) {
      this.number = number;
      this.type = type;
   }
   public Card() {}
   
   
   @Override
   public String toString() {
      return this.TYPE[this.type]+" "+this.NUMBER[this.number];
   }

   @Override
   public int compareTo(Card o) {//카드 비교
      if(this.number == o.number)
         return this.type.compareTo(o.type);
      return this.number.compareTo(o.number);
   }
   
   
}

class Player{
	Card card[] = new Card[7];//player에게 7장의 카드
	int count = 0;
	
	public void showCards() {
		for(int i=0; i<count; i++)
			System.out.print(card[i]);
		System.out.println("");
	}



	public void getCard(Deck deck) {
		if(count < 7) {
			this.card[count++] = deck.pick();//덱에서 카드를 한장 뽑아옴
		}
	}



	public void game(Player p) {
		Random rd = new Random();
		Card p1 = this.card[rd.nextInt(count)];//뽑은 7장의 카드 중에서 랜덤으로 한장
		Card p2 = p.card[rd.nextInt(p.count)];//뽑은 7장의 카드 중에서 랜덤으로 한장
		System.out.println("p1의 카드 : "+ p1);
		System.out.println("p2의 카드 : "+ p2);
		if(p1.compareTo(p2) == 1) 
			System.out.println("p1의 승리" );
		else
			System.out.println("p2의 승리");
		
		
	}
}

class Deck{
   TreeSet<Card> Deck = new TreeSet<>();
   
   public Deck() {//덱에는 모든 카드 추가
      for(int type=0; type<4; type++) {
         for(int num=0; num<13; num++) {
            Deck.add(new Card(num, type));
         }
      }
   }
   
   public void Show() {//덱을 보여주는 메소드
      Iterator<Card> it = Deck.iterator();
      while(it.hasNext())
         System.out.println(it.next());
   }
   
   public Card pick() {//덱에서 한장을 뽑고 덱에는 해당 카드를 remove
      System.out.println("덱에서 임의의 카드를 뽑아옵니다.");
      Random rm = new Random();
      Card deck[] = new Card[Deck.size()];
      Deck.toArray(deck);
      int index = rm.nextInt(Deck.size());
      
      Deck.remove(deck[index]);
      return deck[index];
   }

   
   
}



public class LastCardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		Player p1 = new Player();
		Player p2 = new Player();

		
		for(int i=0; i<7; i++) {
			p1.getCard(deck);
			p2.getCard(deck);
		}
		
		p1.showCards();
		p2.showCards();

		p1.game(p2);
	}

}


