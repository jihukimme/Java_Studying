/*
package lastTest;
import java.util.ArrayList;
import java.util.Iterator;


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
	
}


class MemberArrayList{
	private ArrayList<Member> arrayList;
	
	//member를 객체로 받는 arraylist생성 매소드
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	//arraylist에 member객체 삽입
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//remove 메소드
	public void removeMember(int memberId) {
		
		//해당하는 id가 있을 때 
		//for(int i=0; i<arrayList.size(); i++) {
			//Member member = arrayList.get(i);
			//int removeId = member.getMemberId();
			//if(memberId == removeId) {
				//arrayList.remove(i);
			//}
		//}
		
		Iterator<Member> it = arrayList.iterator();
		while(it.hasNext()) {
			Member member = it.next();
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				arrayList.remove(member);
			}
		}
	}
	
	//arraylist의 모든 요소를 출력하는 메소드
	public void showAll() {
		for(Member member:arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}


public class _1123 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberArrayList memberarraylist = new MemberArrayList();
		
		Member memberlee = new Member(101, "이순신");
		Member memberkim = new Member(102, "김유신");
		Member memberpark = new Member(103, "박신양");
		Member memberpark2 = new Member(103, "박신양");
		
		memberarraylist.addMember(memberlee);
		memberarraylist.addMember(memberkim);
		memberarraylist.addMember(memberpark);
		memberarraylist.addMember(memberpark2);
		
		memberarraylist.showAll();
		
		memberarraylist.removeMember(memberkim.getMemberId());
		
		memberarraylist.showAll();
	}
}

*/