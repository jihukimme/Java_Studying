package javaHard;
import java.util.Random;
import java.util.Scanner;
//로또 프로그램. 1등만. 
//랜덤 로또 넘버(6개 랜덤값)
//자동(랜덤 6개), 수동
//1등-6개, 2등-5개, 3등-4개


//보너스번호
class numberMake{
	Random rand = new Random();
	
	int num[] = new int[6];
	int count = 0;
	
	//번호를 선택하는 메소드
	Scanner sc = new Scanner(System.in);
	public void setNum() {
		System.out.print("번호입력: ");
		for(int i=0; i<6; i++) {
			int num = sc.nextInt();
			this.num[i] = num;
		}
	}
	
	//랜덤한 번호를 뽑아주는 메소드
	public void randNum() {
		for(int i=0; i<6; i++) {
			int num = (int)rand.nextInt(44)+ 1;
			this.num[i] = num;
			//중복제거
			for(int j=0; j<i; j++) {
				if(this.num[i] == this.num[j])
					i--;
			}
		}
	}
	
	//선택된 번호를 보여주는 메소드
	public void show() {
		System.out.print("선택된 번호: ");
		for(int i=0; i<6; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	
	//선택된 번호와 로또번호를 비교하는 메소드(똑같은 값을 count)
	public void compare(int lottonum[]) {
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(num[i] == lottonum[j]) 
					count++;	
			}
		}
	}
	
	//결과를 출력하는 메소드(6개:1등, 5개:2등, 4개:3등, 그 외: 꽝)
	public void result() {
		if(count==6)
			System.out.println("1등 입니다.");
		else if(count==5)
			System.out.println("2등 입니다.");
		else if(count==4)
			System.out.println("3등 입니다.");
		else
			System.out.println("꽝 입니다.");
		count = 0;
	}
	
	
}


public class _1109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//로또번호 생성(로또번호는 고정)
		Random rand=new Random(45);
		int lottonum[] = new int[6];
		for(int i=0; i<6; i++) {
			int num = (int)rand.nextInt(44)+ 1;
			lottonum[i] = num;
			//중복 제거
			for(int j=0; j<i; j++) {
				if(lottonum[i] == lottonum[j])
					i--;
			}
			
		}
		//로또번호 출력
		System.out.print("로또 번호: ");
		for(int i=0; i<6;i++) {
			System.out.print(lottonum[i] + " ");
		}
		
		
		
		//수동과 auto 선택
		Scanner sc = new Scanner(System.in);
		numberMake player = new numberMake();
		
		while(true) {
			System.out.println();
			System.out.print("번호 선택(1: 수동, 2: auto, 3: 종료): ");
			int select = sc.nextInt();
			
			if(select == 1) {//번호를 선택(수동)
				player.setNum();
				player.show();
				player.compare(lottonum);
				player.result();
			}
			else if(select == 2){//랜덤한 수를 뽑음(자동)
				player.randNum();
				player.show();
				player.compare(lottonum);
				player.result();
			}
			else{//select가 1, 2가 아닐때 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		
		sc.close();
	}
}