package sample0512_2;

public class Circle extends Shape {

	private int r;

	public Circle() {
		r = 5;
	}

	public void move(int _x, int _y) {
		x = _x + r;
		y = _y + r;
	}
	public void info() {System.out.println("R x :"+x+"y:"+y);}
	
	
	public void ii(){System.out.println(r);}
}
