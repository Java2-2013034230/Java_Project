package sample_0407;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		tv.pr();
		Television myTV = new Television(7, 10, true);
		myTV.pr();
		Television yourTV = new Television(11, 20, true);
		yourTV.pr();
		Television tv2 = new Television(120,20);
		tv2.pr();

	}

}
