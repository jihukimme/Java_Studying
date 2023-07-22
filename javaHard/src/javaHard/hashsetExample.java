/*
package javaHard;

import java.util.HashSet;
import java.util.Iterator;

//리스트: 점수.. 자료 저장에 포커스
//set: 고유 자료를 비교하는데

//Member class생성
class Member{
	private int memberId; //id를 나타내는 int선언
	private String memberName; //name을 나타내는 string선언 
	
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

	//중복 된 키값을 없애기 위해 오버라디딩 필요
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
	
}


class MemberHashSet{
	private HashSet<Member> hashSet;
	
	//member를 객체로 받는 arraylist생성 매소드
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	//arraylist에 member객체 삽입
	public void addMember(Member member) {
		hashSet.add(member);
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
		
		Iterator<Member> it = hashSet.iterator();
		while(it.hasNext()) {
			Member member = it.next();
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				hashSet.remove(member);
				return true;
			}
		}
		return false;
	}
	
	//arraylist의 모든 요소를 출력하는 메소드
	public void showAll() {
		for(Member member:hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}


public class hashsetExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashSet memberhashset = new MemberHashSet();
		
		Member memberlee = new Member(101, "이순신");
		Member memberkim = new Member(102, "김유신");
		Member memberpark = new Member(103, "박신양");
		Member memberpark2 = new Member(103, "박신양");
		
		memberhashset.addMember(memberlee);
		memberhashset.addMember(memberkim);
		memberhashset.addMember(memberpark);
		memberhashset.addMember(memberpark2);
		
		memberhashset.showAll();
		
		memberhashset.removeMember(memberkim.getMemberId());
		
		memberhashset.showAll();
	}
}
*/