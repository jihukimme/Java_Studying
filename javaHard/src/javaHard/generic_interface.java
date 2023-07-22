package javaHard;

interface Getable<T>{
	public T get();
}

class toyBox<T> implements Getable<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

class Toy{
	public String toString() {
		return "I am a Toy";
	}
}

public class generic_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toyBox<Toy> box = new toyBox<>();
		box.set(new Toy());
		
		System.out.println(box.get());
		
		Getable<Toy> gt = box;
		System.out.println(gt.get());
	}

}
