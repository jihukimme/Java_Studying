/*
package lastTest;

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
		return (member1.memberId - member2.memberId);
	}
	
}


class MemberTreeSet{
	private TreeSet<Member> treeSet;
	
	//member를 객체로 받는 treeset생성 매소드
	public MemberTreeSet() {
		//treeSet = new TreeSet<Member>(); 
		treeSet = new TreeSet<Member>(new Member());
	}
	
	//treeset에 member객체 삽입
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	//remove 메소드
	public boolean removeMember(int memberId) {
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
	
	//treeset의 모든 요소를 출력하는 메소드
	public void showAll() {
		for(Member member:treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}


public class _1128 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeSet membertreeset = new MemberTreeSet();
		
		Member memberlee = new Member(102, "이순신");
		Member memberkim = new Member(101, "김유신");
		Member memberpark = new Member(103, "박효신");
		Member memberson = new Member(110, "손흥민");
		Member memberpark2 = new Member(103, "박신양"); //동일한 키값을 넣었을때 
		
		membertreeset.addMember(memberlee);
		membertreeset.addMember(memberkim);
		membertreeset.addMember(memberpark);
		membertreeset.addMember(memberson);
		membertreeset.addMember(memberpark2); //동일한 키값 => 삽입되지 않음
		
		membertreeset.showAll();
		
		Member memberlee2 = new Member(100, "이몽룡"); 
		membertreeset.addMember(memberlee2); //추가 삽입
		
		membertreeset.showAll();
		
		membertreeset.removeMember(100); //100을 키값으로 가지는 member. remove
		membertreeset.showAll();
	}
}
*/