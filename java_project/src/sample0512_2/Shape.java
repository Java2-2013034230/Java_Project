package sample0512_2;

abstract class Shape {
  protected int x, y;
  
  public Shape(){x=0; y=0;}
  
  
  public Shape(int _x, int _y){
	  x=_x; this.y=_y;
  }
  
  abstract public void move(int _x,int _y);//{
	//  this.x+=x; y+=_y;
 // }
  abstract public void info();
  abstract public void ii();
}
