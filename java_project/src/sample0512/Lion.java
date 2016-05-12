package sample0512;

public class Lion extends Animal {
   private int legs;
   public Lion() {
		super(100, "Handsome");
		this.legs=4;
		// TODO Auto-generated constructor stub
	}
void roar(){ System.out.println("roar()가 호출되었음");}
   void infor(){ System.out.println(weight+" "+picture);}
}
