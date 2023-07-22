package javaBasic;

public class MileToKilometer {
	

	//mile을 kilo로 바꾸는 value 메소드
	public static double value(double mile) {
		final double MI = 1.69433;
		
		return mile * MI;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		double mile = 95.0;
		
		
		System.out.println("95mile -> " + value(mile) + "Km");
	

	}

}