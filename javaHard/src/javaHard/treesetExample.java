/*
package javaHard;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

//Member class생성
class Member implements Comparable<Member>, Comparator<Member>{
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

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId)
				return true;
		}
		return false;
	}

	@Override
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
		return (this.memberName.compareTo(member.memberName));
	}

	@Override
	public int compare(Member member1, Member member2) {
		// TODO Auto-generated method stub
		return (member1.memberId - member2.memberId)*-1;
	}
	
}


class MemberTreeSet{
	private TreeSet<Member> treeSet;
	
	//member를 객체로 받는 arraylist생성 매소드
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member());
	}
	
	//arraylist에 member객체 삽입
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	//remove 메소드
	public boolean removeMember(int memberId) {
		
		//해당하는 id가 있을 때 
		//for(int i=0; i<arrayList.size(); i++) {
			//Member member = arrayList.get(i);
			//int removeId = member.getMemberId();
			//if(memberId == removeId) {
				//arrayList.remove(i);
			//}
		//}
		
		Iterator<Member> it = treeSet.iterator();
		while(it.hasNext()) {
			Member member = it.next();
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				treeSet.remove(member);
				return true;
			}
		}
		return false;
	}
	
	//arraylist의 모든 요소를 출력하는 메소드
	public void showAll() {
		for(Member member:treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}


public class treesetExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeSet membertreeset = new MemberTreeSet();
		
		Member memberlee = new Member(101, "이순신");
		Member memberkim = new Member(102, "김유신");
		Member memberpark = new Member(103, "박신양");
		Member memberpark2 = new Member(103, "박신양");
		
		membertreeset.addMember(memberlee);
		membertreeset.addMember(memberkim);
		membertreeset.addMember(memberpark);
		membertreeset.addMember(memberpark2);
		
		membertreeset.showAll();
		
		membertreeset.removeMember(memberkim.getMemberId());
		
		membertreeset.showAll();
	}
}
*/
