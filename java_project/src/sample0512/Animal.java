package sample0512;

public class Animal {

  protected double weight;
  protected String picture;
  
  public Animal(){
	  weight = 30;
	  picture = "Animal";
	  System.out.println("Animal Cont");
  }
  
  
  public Animal(double weight, String picture) {
	this.weight = weight;
	this.picture = picture;
	System.out.println("Animal Cont2");
}


void eat(){ System.out.println("eat()�� ȣ��Ǿ���");}
  void sleep() { System.out.println("sleep()�� ȣ��Ǿ���");}
}
