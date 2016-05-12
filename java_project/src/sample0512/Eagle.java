package sample0512;

public class Eagle extends Animal {

	public Eagle() {
		System.out.println("Eagle Cont");
	}

	private int wings = 2;

	void fly() {
		System.out.println("fly()가 호출되었음");
	}

	void eat() {
		System.out.println("Eagle eat");
	}
}
