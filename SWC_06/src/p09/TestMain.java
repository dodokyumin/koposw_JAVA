package p09;

public class TestMain {

	public static void main(String[] args) {
		
		k44_TVRemocon k44_tv = new k44_TVRemocon(); //TVRemocon�̶�� Ŭ������ ������ tv��� �ν��Ͻ��� �����Ѵ�.
		
		for(int k44_i=0; k44_i<10; k44_i++) {	//Ƽ�� 10�� ä���� �ø���.
			k44_tv.k44_ChannelUp();
		}
		for(int i=0; i<10; i++) {	//Ƽ�� 10�� ä���� ������.
			k44_tv.k44_ChannelDn();
		}
		for(int k44_i=0; k44_i<5; k44_i++) {	//Ƽ�� 5�� ������ �ø���.
			k44_tv.k44_volUp();
		}
		for(int k44_i=0; k44_i<5; k44_i++) {	//Ƽ�� 5�� ������ ������.
			k44_tv.k44_volDn();
		}

	}

}