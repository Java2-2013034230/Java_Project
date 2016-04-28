package sample0428;

public class CarTest {
	
	public static int getNumbers(){return Numbers;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1 = new Car("E600", "white", 80);
		Car c2 = new Car("E500", "blue", 20);
		int n = Car.numbers;
		System.out.println("지금까지 생성된 자동차 수 = " + n);
	}

}
