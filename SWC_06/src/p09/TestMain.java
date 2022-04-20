package p09;

public class TestMain {

	public static void main(String[] args) {
		
		k44_TVRemocon k44_tv = new k44_TVRemocon(); //TVRemocon이라는 클래스를 가져와 tv라는 인스턴스를 생성한다.
		
		for(int k44_i=0; k44_i<10; k44_i++) {	//티비가 10번 채널을 올린다.
			k44_tv.k44_ChannelUp();
		}
		for(int i=0; i<10; i++) {	//티비가 10번 채널을 내린다.
			k44_tv.k44_ChannelDn();
		}
		for(int k44_i=0; k44_i<5; k44_i++) {	//티비가 5번 볼륨을 올린다.
			k44_tv.k44_volUp();
		}
		for(int k44_i=0; k44_i<5; k44_i++) {	//티비가 5번 볼륨을 내린다.
			k44_tv.k44_volDn();
		}

	}

}