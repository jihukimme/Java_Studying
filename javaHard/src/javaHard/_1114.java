package javaHard;

//import java.lang.String;
//import java.lang.StringBuffer;
import java.util.Random;
import java.util.Scanner;

//단어 찾기 게임
//과일 6가지 저장 됨(Strawberry, Watermelon, Apple, Orange, Banana, Blueberry).. 랜덤 과일 선택
//6가지를 맞춰야 함
//o입력시 o있는 내용 출력
//최종적으로 과일 맞춤

class wordDetecting {
	Random rand = new Random();
	private Scanner sc = new Scanner(System.in);
	
	private String fruits[] = {"Strawberry", "Watermelon", "Apple", "Orange", "Banana", "Blueberry"};
	private int index = (new Random()).nextInt(fruits.length);//fruits배열의 크기만큼의 수 중 랜덤한 정수 
	private String solution = fruits[index];//과일을 랜덤으로 선택한 string
	private StringBuffer answ = new StringBuffer(solution.length());
	
	//stringbuffer의 공백자리를 '_'(언더바)로 세팅하는 메소드
	public wordDetecting() {
		for(int i=0; i<solution.length(); i++) {
			answ.replace(i, i+1, "_");
		}
	}
	
	//단어를 찾는 메소드
	public void gameStart() {
		while(true) {
			System.out.print("과일 이름 맞추기: ");
			String chose = sc.next();
			
			for(int i=0; i<solution.length(); i++) {
				if(chose.charAt(0)==solution.charAt(i)) {
					//선택한 문자가 solution의 문자중에서 같은 것이 있을 때
					//(언더바)로 세팅했던 answ의 자리를 삭제한 후 해당자리에 선택한 문자를 삽입
					answ.delete(i, i+1);
					answ.insert(i, chose);
				}
			}
			System.out.println(answ);
			
			//answ와 solution의 값이 같다면 while문 종료
			if(answ.toString().equals(solution)) {
				System.out.println("과일을 맞췄습니다.");
				sc.close();
				break;
			}
		}
	}
	
}

public class _1114 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		wordDetecting fruitword = new wordDetecting();
		//과일 맞추기 게임 시작
		fruitword.gameStart();
		
	}
}
