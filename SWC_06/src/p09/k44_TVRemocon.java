package p09;

public class k44_TVRemocon {
	
	public static int k44_channel, k44_vol;	//전역변수로 채널과 볼륨을 설정해준다.

	void k44_ChannelUp() {	//채널에 값을 1 더하는 함수 = 채널을 올림.
		k44_channel++;
		System.out.println("현재 채널은 "+ k44_channel);
	}
	void k44_ChannelDn() {	//채널에 값을 1 뺴는 함수 = 채널을 내림.
		k44_channel--;
		System.out.println("현재 채널은 "+ k44_channel);
	}
	void k44_volUp() {	//볼륨에 값을 1 더하는 함수 = 볼륨을 올림.
		k44_vol++;
		System.out.println("현재 볼륨은 "+ k44_vol);
	}
	void k44_volDn() {	//볼륨에 값을 1 내리는 함수 = 볼륨을 내림.
		k44_vol--;
		System.out.println("현재 볼륨은 "+ k44_vol);
	}
}