/*
package javaHard;

class Apple{
	public String toString() {
		return "I am an apple";
	}
}

class Orange{
	public String toString() {
		return "I am an orange";
	}
}

class AppleBox{
	private Apple ap;
	
	public void set(Apple a) {
		ap = a;
	}
	public Apple get() {
		return ap;
	}
}

class OrangeBox{
	private Orange or;
	
	public void set(Orange o) {
		or = o;
	}
	public Orange get() {
		return or;
	}
}

class Box<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}


public class genericExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
	}
}
*/