package javaHard;

class Plastic{
	public Plastic() {
		System.out.println("플라스틱");
	}
	
	public String toString() {
		return "사용 된 재료는 Plastic";
	}
}

class PrinterPlastic{
	private Plastic material;
	
	public Plastic getMaerial() {
		return material;
	}
	public void setMaterial(Plastic material) {
		this.material = material;
	}
}

class Powder{
	public Powder() {
		System.out.println("파우더");
	}
	public String toString() {
		return "사용 된 재료는 Powder";
	}
}

class PrinterPowder{
	private Powder material;
	
	public Powder getMaterial() {
		return material;
	}
	public void setMaterial(Powder material) {
		this.material = material;
	}
}

//모든 형태의 재료를 출력할 수 있는 PrinrterGeneric 클래스
class Printer<T>{
	private T ob;
	
	public void setMaterial(T o) {
		ob = o;
	}
	public T getMaterial() {
		return ob;
	}
	
	public String toString() {
		return ob.toString();
	}
}

public class _1116 {
	//integer, double, string 다쓸 수 있는 배열 프린트
	//모든 형태의 배열값(integer값이 담긴 배열, character값이 담긴 배열, 등등)을 출력할 수 있는 PrintArray 제네릭 메소드
	public static <T> void printArray(T[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Printer<Plastic> plastic = new Printer<Plastic>();
		Printer<Powder> powder = new Printer<Powder>();
		
		Integer x[] = new Integer[10];//int형을 저장하는 배열 생성
		String y[] = new String[10];//string타입을 저장하는 배열 생성
		Double z[] = new Double[10];//double타입을 저장하는 배열 생성
		
		plastic.setMaterial(new Plastic());
		powder.setMaterial(new Powder());
		
		for(int i=0; i<x.length; i++)
			x[i] = i;
		printArray(x);//제네릭 메소드를 통해서 배열 출력
		for(int i=0; i<x.length; i++)
			y[i] = "tests" + i;
		printArray(y);//제네릭 메소드를 통해서 배열 출력
		for(int i=0; i<x.length; i++)
			z[i] = i+0.123;
		printArray(z);//제네릭 메소드를 통해서 배열 출력
	}
}
