/*
package javaHard;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Scholarship{
	private String title;
	private Scanner sc = new Scanner(System.in);
	private HashMap<String, Double> scoreMap = new HashMap<>();
	
	public Scholarship(String name) {
		this.title = name;
	}
	
	public void read() {
		System.out.println(title + " 관리 시스템");
		for(int i=0; i<5; i++) {
			System.out.print("이름과 학점 입력: ");
			String name = sc.next();
			double score = sc.nextDouble();
			scoreMap.put(name, score);
		}
	}
	
	public void select() {
		double cutline = 90.0;
		System.out.print("장학생 명단: ");
		Set<String> nameSet = scoreMap.keySet();
		
		Iterator<String> it = nameSet.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			double score = scoreMap.get(name);
			if(score >= cutline)
				System.out.print(name + " ");
		}
		System.out.println();
	}
	
	
}

public class hashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scholarship sship = new Scholarship("성적 장학금");
		sship.read(); //학생 이름, 성적 입력
		sship.select(); //학생 선발
	}

}
*/
