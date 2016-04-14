package sample_0407;

public class Television {
	private int channel;
	private int volume;
	private boolean onOff;

	Television(int c, int v, boolean o) {
		channel = c;
		volume = v;
		onOff = o;
	}

	public Television() {
		this(10, 20, false);

		// channel = 10;
		// volume = 5;
		// onOff = true;
	}
	public Television(int channel, int volume){
		this(channel, volume, true);
	}

	void pr() {
		System.out.println("텔레비전의 채널은 " + channel + "이고 볼륨은" + volume + "입니다.");

	}

}
