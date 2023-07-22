package javaLastProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


//phone 기본정보
class phone implements Comparable<phone>, Serializable{
	String name;
	String number;
	
	public phone(String name, String number) {
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String toString() {
		return "이름: " + name + ", 전화번호: " + number;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return name.equals(((phone)obj).name);
	}
	@Override
	public int compareTo(phone o) {
		return name.compareTo(o.name);
	}
}

//phoneuniv
class phoneUniv extends phone{
	String major;
	String grade;
	
	public phoneUniv(String name, String number, String major, String grade) {
		super(name, number);
		this.major = major;
		this.grade = grade;
	}
	
	public String toString() {
		return "이름: " + name + ", 전화번호: " + number + ", 전공: " + major + ", 학년: " + grade;
	}
	
}

//phonecomp
class phoneComp extends phone{
	String comp;
	
	public phoneComp(String name, String number, String comp) {
		super(name, number);
		this.comp = comp;
	}
	
	public String toString() {
		return "이름: " + name + ", 전화번호: " + number + ", 회사: " + comp;
	}
}


//phone정보를 저장하는 phonebook
class phonebook implements Serializable{
	TreeSet<phone> book = new TreeSet<>();//treeset으로 phone정보를 저장
	
	public phonebook() {
		
	}
	
	//treeset에 phone정보 저장
	void insert(phone p) {
		book.add(p);
	}
	
	//해당하는 이름이 있으면 삭제 
	public boolean remove(String name) {
		Iterator<phone> itr = book.iterator();
		phone p;
		boolean result = false;
		while(itr.hasNext()) {
			p = itr.next();
			if(name.equals(p.getName())) {
				book.remove(p);
				result = true;
			}
		}
		return result;
	}
	
	//해당하는 이름이 있으면 검색
	public boolean search(String name) {
		Iterator<phone> itr = book.iterator();
		phone p;
		boolean result = false;
		while(itr.hasNext()) {
			p = itr.next();
			if(name.equals(p.getName())) {
				p.toString();
				result = true;
			}
		}
		return result;
	}
	
	//treeset에 있는 phone정보 출력
	void allprint() {
		phone p;
		Iterator<phone> itr = book.iterator();
		while(itr.hasNext()) {
			p = itr.next();
			System.out.println(p);
		}
	}
}

//manage동작을 하는 클래스
class phonebookManager{
	phonebook pb = new phonebook();
	Scanner sc = new Scanner(System.in);
	int select = 0;
	
	//입력
	void insert() {
		System.out.println("1.일반  2.대학  3.회사 ");
		System.out.print("선택 >> ");
	      int select = sc.nextInt();
	      while(true){
	         if(select == 1) { // 일반타입 데이터입력
	            System.out.println("이름과 전화번호를 입력하여 주세요.");
	            pb.insert(new phone(sc.next() , sc.next()));
	            return;
	         }
	         else if(select == 2) { // 대학타입
	            System.out.println("이름과 전화번호, 전공과 학번을 입력하여 주세요.");
	            pb.insert(new phoneUniv(sc.next() , sc.next(), sc.next(), sc.next()));
	            return;
	         }
	         else if(select == 3) { // 회사타입
	            System.out.println("이름과 전화번호, 회사명을 입력하여 주세요.");
	            pb.insert(new phoneComp(sc.next() , sc.next(), sc.next()));
	            return;
	         }
	      }

	}
	
	//검색
	void search() {
		System.out.println("데이터 검색을 시작합니다.");
		System.out.print("이름 : ");
		String name = sc.next();
		boolean result = pb.search(name);
		if(result) System.out.println("데이터 검색이 완료되었습니다.");
		System.out.println("검색할 데이터가 존재하지 않습니다.");
	}
	
	//삭제
	void remove() {
		System.out.println("데이터를 삭제합니다.");
		System.out.print("이름: ");
		String name = sc.next();
		boolean result = pb.remove(name);
		if(result) System.out.println("데이터 삭제가 완료되었습니다.");
		System.out.println("삭제할 데이터가 존재하지 않습니다.");
	}
	
	//파일에 저장
	void backup() throws IOException {
		File f = new File("book.dat");
		FileOutputStream out = new FileOutputStream(f);
		try(ObjectOutputStream oout = new ObjectOutputStream(out)){
			oout.writeObject(this.pb);

		}
		return;
	}
	
	//파일에서 불러오기
	void getbook() throws IOException, ClassNotFoundException {
		File f = new File("book.dat");
		InputStream in = new FileInputStream(f);
		try (ObjectInputStream oin = new ObjectInputStream(in)) {
			this.pb = (phonebook) oin.readObject();
		}
		
		return;
	}
	
	//모두 출력
	public void allprint() {
		pb.allprint();
	}
	
	//닫기
	public void close() {
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
	
	//phonemanager 실행
	public phonebookManager() throws IOException, ClassNotFoundException {
		while(true) {
			System.out.println("선택하세요...");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 데이터 검색");
			System.out.println("3. 데이터삭제");
			System.out.println("4. 전화번호부 백업");
			System.out.println("5. 전화번호부 가져오기");
			System.out.println("6. 전체 출력");
			System.out.println("7. 프로그램 종료");
			System.out.print("선택 : ");
			
			select = sc.nextInt();
			
			while(true) {
				if(select==1) {
					insert();
					break;
				}
				else if(select==2) {
					search();
					break;
				}
				else if(select==3) {
					remove();
					break;
				}
				else if(select==4) {
					backup();
					break;
				}
				else if(select==5) {
					getbook();
					break;
				}
				else if(select==6) {
					allprint();
					break;
				}
				else {
					return;
					
				}
			}
		}
	}
	
}


public class LastPhoneBook {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		phonebookManager pm = new phonebookManager();
	}

}
