package sample_0324;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] array = new int[10]; //0,1,2
  int[] array2 = {13,4,6,5,2,7,36};
  System.out.println(array[1]);
  for(int i=0; i<10; i++){
	  array[i]= (i+1)*10;
	  System.out.println(i+" "+array[i]);
  }//패턴이 있으면 for문, 패턴이 없으면 깡으로...
  
  }

}
