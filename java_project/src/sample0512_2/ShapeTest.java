package sample0512_2;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Shape r1 = new Rectangle();
		Shape c1 = new Circle();
		Shape r2 = new Rectangle();

	
		r1.move(100, 100);
		c1.move(11, 11);
        infor(r1);
        infor(c1);
       
	}
    static void infor(Shape ro){ ro.info(); ro.ii();}//이 함수 하나로 다된다.
    static void inforr(Rectangle r){r.info();}//자식 개수만큼 메소드를 짜야한다....
}
