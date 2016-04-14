package sample_0414;

public class Car {
	private int man;
	private int tire;
	private String color;

	public void setman(int man) {
		this.man = man;
	}

	public void getman() {
		System.out.println(man);
	}

	public void all_setting(int tire, String color) {
		this.tire = tire;
		this.color = color;
	}

	public Car(int man, int tire, String color) {
		this.man = man;
		this.tire = tire;
		this.color = color;
	}

	public Car() {
		this(4, 3, "red");

		// man=4;
		// tire=3;
		// color="red";
	}

	void pr() {
		System.out.println("man: " + man + " tire: " + tire + " color: "
				+ color);
	}

}
