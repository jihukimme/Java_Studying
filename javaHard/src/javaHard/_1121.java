package javaHard;

class Box3<T>{
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

public class _1121 {

	public static void addBox(Box3<? super Integer> b1, Box3<? extends Integer> b2, Box3<? extends Integer> b3) {
		b1.set(b2.get()+b3.get());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box3<Integer> box1 = new Box3<>();
		box1.set(24);
		Box3<Integer> box2 = new Box3<>();
		box2.set(37);
		Box3<Integer> result = new Box3<>();
		result.set(0);
		
		addBox(result, box1, box2);
		System.out.println(result.get());
	}

}
