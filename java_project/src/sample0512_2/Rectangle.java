package sample0512_2;

public class Rectangle extends Shape {

	private int x1, y1;

	public Rectangle() {
		x1 = 10;
		y1 = 20;
	}

	public void move(int _x, int _y) {
		x = x1 + _x;
		y = y1 + _y;
	}
	
	public void info() {System.out.println("R x :"+x+"y:"+y);}
	
	public void ii(){System.out.println(x1+" "+y1);}
}
