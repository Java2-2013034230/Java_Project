package sample0421;

public class Print {

	Process pro = new Process();
	
	void print(int x, int y,String z){
		pro.carcul(x, y, z);
		System.out.println(x+z+y);
	}
	
	void print(String i, String j){
		pro.carcul2(i, j);
		System.out.println(i+j);
		
		
	}
		
	}

