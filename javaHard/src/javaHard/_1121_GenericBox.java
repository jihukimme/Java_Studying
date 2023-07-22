package javaHard;

class genericBox<T>{
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

public class _1121_GenericBox {

	public static <T> boolean compBox(genericBox<? extends T> box, T con) {
		T bc = box.get();
		
		return bc.equals(con);
	}

	public static void addBox(genericBox<? super Integer> b1, genericBox<? extends Integer> b2, genericBox<? extends Integer> b3) {
		b1.set(b2.get()+b3.get());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genericBox<Integer> boxInteger = new genericBox<>();
		boxInteger.set(24);
		
		genericBox<String> boxString = new genericBox<>();
		boxString.set("Poly");
		
		if(compBox(boxInteger, 25))
			System.out.println("상자안에 25 저장");
		if(compBox(boxString, "moly"))
			System.out.println("상자안에 moly저장");
		
		System.out.println(boxInteger.get());
		System.out.println(boxString.get());



		genericBox<Integer> boxInteger1 = new genericBox<>();
		boxInteger1.set(24);
		genericBox<Integer> boxInteger2 = new genericBox<>();
		boxInteger2.set(37);
		genericBox<Integer> result = new genericBox<>();
		result.set(0);
		
		addBox(result, boxInteger1, boxInteger2);
		System.out.println(result.get());
	}

}