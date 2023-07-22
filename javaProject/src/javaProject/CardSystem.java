package javaProject;

class Cards{
	int typeNum;   
	int isNum; 
	
	
	public Cards() {
		this.typeNum = (int)(Math.random()*4+1); //1~13 랜덤
		this.isNum = (int)(Math.random()*13 + 1); //1~4 랜덤
	}
	
	
	public void print() {
		System.out.println(typeNum + " " + isNum);
	}
		
}

class onecard extends Cards{
	String type[] = {"CLOVER", "HEART", "DIAMOND", "SPADE"};
	String num[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "SPADE", "ACE"}; 
	
	
	public onecard() {
	}

	public void print() {	
		System.out.println(type[typeNum-1] + " " + num[isNum-1]); //typeNum과 isNum에 해당하는 내용을 type배열과 num배열에서 출력
	}

	
}

class uno extends Cards{
	String unotype[] = {"Red", "Yellow", "Green", "Blue"};  
	String unonum[] = {"1", "2", "3", "4", "5", "6", "7", "8","9", "10", "Skip", "Reverse", "Draw"};
	


	//card를 출력하는 메소드(숫자 11 = J, 12 = Q, 13 = K, 1 = A, 나머제 숫자는 그대로 출력)
	public void print() {	
		System.out.println(unotype[typeNum-1] + " " + unonum[isNum-1]); //typeNum과 isNum에 해당하는 내용을 unotype배열과 unonum배열에서 출력
	}

	
}


public class CardSystem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cards CARDCLASS = new Cards(); //카드 객체 생성
		onecard ONECARD = new onecard(); //원카드 객체 생성
		uno UNOCLASS = new uno(); //우노카드 객체 생성
	
		Cards getCards[] = new Cards[3];
		for(int i=0; i<3; i++) {
			getCards[i] = new Cards(); // 베열 초기화
		}
		getCards[0] = CARDCLASS;
		getCards[1] = ONECARD;
		getCards[2] = UNOCLASS;
		
		for(int i=0; i<3; i++) {
			getCards[i].print(); //배열에 저장해 프린트
		}
		
		
	}

}