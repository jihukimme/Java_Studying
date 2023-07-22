package javaHard;

//와일드카드: 이름 또는 문자열에 제한을 가하지 않음을 명시하는 용도로 사용되는 특별 기호 (?)


abstract class Eatable{
	public abstract void eat();
}

class Apple extends Eatable{
	public String toString() {
		return "I am an Apple";
	}
	
	public void eat() {
		System.out.println("eat apple");
	}
}

class Orange extends Eatable{
	public String toString() {
		return "I am an Orange";
	}
	
	public void eat() {
		System.out.println("eat orange");
	}
}

class Durian{
	public String toString() {
		return "I am an Durian";
	}
}

class Box<T extends Eatable>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

public class generic_limit {
	public static void openAndShowBox(Box<? extends Eatable> box) {
		Eatable eatable = box.get();
		System.out.println(eatable);
		eatable.eat();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		//Box<Eatable> eBox = new Box<Eatable>();
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		openAndShowBox(aBox);
		openAndShowBox(oBox);
	}

}
