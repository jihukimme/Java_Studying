package javaHard;

class Box4<T>{
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

public class _1121_2 {

	public static <T> boolean compBox(Box4<? extends T> box, T con) {
		T bc = box.get();
		
		return bc.equals(con);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box4<Integer> box1 = new Box4<>();
		box1.set(24);
		
		Box4<String> box2 = new Box4<>();
		box2.set("Poly");
		
		if(compBox(box1, 25))
			System.out.println("상자안에 25 저장");
		if(compBox(box2, "moly"))
			System.out.println("상자안에 moly저장");
		
		System.out.println(box1.get());
		System.out.println(box2.get());
	}

}