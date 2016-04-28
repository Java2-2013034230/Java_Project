package sample0421;
import java.util.*;
public class User_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Process pro = new Process();
    Print   prt = new Print();
    while(true){
    System.out.println("1. Arithmetic operation");
    System.out.println("2. Append Strings");
    System.out.println("3. Quit");
    System.out.println("원하시는 메뉴를 선택하세요");
    Scanner input = new Scanner(System.in);
    int a= input.nextInt();
    if(a==1){
    	System.out.println("원하시는 두개의 수를 입력하시고,연산자를 입력하세요");
    	int x= input.nextInt();
    	int y= input.nextInt();
    	String z= input.nextLine();
    	
    	pro.carcul(x, y,z);
    	prt.print(x, y, z);//연산자 입력 받는 방법을 모르겠습니다. 죄송합니다. 문자로 대체했습니다.
    }
    else if(a==2){
        System.out.println("원하시는 두개의 문자열을 입력하세요");
    	String i = input.nextLine();
    	String j = input.nextLine();
       pro.carcul2(i, j);
       prt.print(i, j);
    }else if(a==3){
    	break;
    }
		
	}//while
		
	}

}
