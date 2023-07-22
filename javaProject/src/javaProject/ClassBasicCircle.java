package javaProject;

//클래스 생성
public class ClassBasicCircle {

	//멤버 변수
	int circleRadius; //반지름
	String circleName; //이름		
	
	//생성자
	public ClassBasicCircle() {
		
	}
				
			
	//멤버 메소드
	public double getArea() {
		return 3.14 * circleRadius * circleRadius;
	}
	
	
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassBasicCircle pizza;
		pizza = new ClassBasicCircle();
		
		System.out.println("name of the object is " + pizza.circleName);
		System.out.println("radius of the object is " + pizza.circleRadius);
		System.out.println("area od the object is " + pizza.getArea());
		
		pizza.circleRadius = 10;
		pizza.circleName = "자바피자";
		
		System.out.println("name of the object is " + pizza.circleName);
		System.out.println("radius of the object is " + pizza.circleRadius);
		System.out.println("area od the object is " + pizza.getArea());
		
		ClassBasicCircle donut;
		
		donut = new ClassBasicCircle();
		
		donut.circleName = "도넛";
		donut.circleRadius = 5;
		System.out.println("name of the object is " + donut.circleName);
		System.out.println("radius of the object is " + donut.circleRadius);
		System.out.println("area od the object is " + donut.getArea());
		
		
	}

}