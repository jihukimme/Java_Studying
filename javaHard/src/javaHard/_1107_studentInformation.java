package javaHard;

class Student{
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student){
			Student std = (Student)obj; 
			if(studentId == std.studentId)
				return true;
			else return false;
		}
		return false;
	}
	
	public String toString() {
		return "std의 studentid는 " + studentId + ", stdentname은 " + studentName + "입니다.";
	}

}


public class _1107_studentInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student(1001, "이상");
		Student std2 = new Student(1001, "이상");
		
		//객체 출력했을 때, std1의 student id는 ~입니다.
		System.out.print("std1: ");
		System.out.println(std1);
		System.out.print("std2: ");
		System.out.println(std2);
		System.out.println();
		
		if(std1 == std2)
			System.out.println("std1와 stu2의 주소는 같습니다.");
		else
			System.out.println("st1와 std2의 주소는 다릅니다.");
		if(std1.equals(std2))
			System.out.println("std1와 std2는 동일합니다.");
		else
			System.out.println("std1와 std2는 동일하지 않습니다.");
	
		
	}
}
