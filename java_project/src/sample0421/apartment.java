package sample0421;

public class apartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    for(int i=1;i<8;i++){
    	for(int j=1;j<7;j++){
    		if((j>=5)&&(j<=6)&&(i>=1)&&(i<=2)){
    			break;
    		}
    		else if((j>=4)&&(j<=5)&&(i>=3)&&(i<=5)){
    			continue;
    		}
    		else if((j>=4)&&(j<=5)&&(i==7)){
    			System.out.print("    ");
    		    continue;
    		}
    		
    		System.out.print(100*j+i+" ");
    		}
    				System.out.println();
    		}
  }
	}
