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
    System.out.println("���Ͻô� �޴��� �����ϼ���");
    Scanner input = new Scanner(System.in);
    int a= input.nextInt();
    if(a==1){
    	System.out.println("���Ͻô� �ΰ��� ���� �Է��Ͻð�,�����ڸ� �Է��ϼ���");
    	int x= input.nextInt();
    	int y= input.nextInt();
    	String z= input.nextLine();
    	
    	pro.carcul(x, y,z);
    	prt.print(x, y, z);//������ �Է� �޴� ����� �𸣰ڽ��ϴ�. �˼��մϴ�. ���ڷ� ��ü�߽��ϴ�.
    }
    else if(a==2){
        System.out.println("���Ͻô� �ΰ��� ���ڿ��� �Է��ϼ���");
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
