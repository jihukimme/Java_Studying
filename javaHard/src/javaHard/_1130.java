package javaHard;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

class Member{
	private int memberId; //id를 나타내는 int선언
	private String memberName; //name을 나타내는 string선언 
	
	public Member() {
		
	}
	//id와 name을 받아오는 메소드 
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다";
	}
	
}

//정렬
class comparator implements Comparator<Integer>{
	public int compare(Integer n1, Integer n2) {
		return (n1.intValue() - n2.intValue())*-1; 
		}
}


class MemberTreeMap{
	private TreeMap<Integer, String> treeMap;
	
	public MemberTreeMap() {
		//treeSet = new TreeSet<Member>(); 
		treeMap = new TreeMap<Integer, String>(new comparator());
	}
	
	//treemap에 member객체의 값을 삽입
	public void addMember(Member member) {
		if(!treeMap.containsKey(member.getMemberId())) // 동일한키 값을 가지는 것이 없을 때
			treeMap.put(member.getMemberId(), member.getMemberName());
	}
	
	//remove메소드
		public void removeMember(int memberId) {
			treeMap.remove(memberId);
		}
	
	
	//treemap의 모든 요소를 출력하는 메소드
	public void showAll() {
		Set<Integer> ks = treeMap.keySet();
		
		for(Integer n : ks) {
			System.out.println(n.toString() + treeMap.get(n));
		}
		System.out.println();
	}
	
}

public class _1130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeMap membertreemap = new MemberTreeMap();
		
		Member memberlee = new Member(102, "이순신");
		Member memberkim = new Member(101, "김유신");
		Member memberpark = new Member(103, "박효신");
		Member memberpark2 = new Member(103, "박씨"); //동일한 키값을 가지는 것을 삽입할 때

		
		membertreemap.addMember(memberlee);
		membertreemap.addMember(memberkim);
		membertreemap.addMember(memberpark);
		membertreemap.addMember(memberpark2);

		
		membertreemap.showAll();
		
		Member memberlee2 = new Member(100, "이몽룡"); 
		membertreemap.addMember(memberlee2); //추가 삽입
		
		membertreemap.showAll();
		
		membertreemap.removeMember(102); //102를 키값으로 가지는 member. remove
		membertreemap.showAll();
	}

}