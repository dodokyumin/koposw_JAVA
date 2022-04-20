package p15_p18;

public class k44_TVRemocon {
	
	public static int k44_channel, k44_vol;	//전역변수 channel과 vol을 설정하여 모든 메소드애서 활용가능하게 설정.
	
	k44_TVRemocon(){	//생성자는 인스턴스를 생성하자마자 실행되는 함수이다. 파라미터나 자료형이 없음.
		
		k44_channel = 10;	//초기값 세팅해준다.
		k44_vol = 10;
		
		for(int k44_i=0; k44_i<10; k44_i++)	//for문을 통해서 반복되는 만큼 메소드 호출
			k44_TVRemocon.k44_ChannelUp();
		for(int k44_i=0; k44_i<10; k44_i++)
			k44_TVRemocon.k44_ChannelDn();
		for(int k44_i=0; k44_i<5; k44_i++)
			k44_TVRemocon.k44_volUp();
		for(int k44_i=0; k44_i<5; k44_i++)
			k44_TVRemocon.k44_volDn();
	}
	
	static void k44_ChannelUp() {	//채널에 1을 더해주는 함수
		k44_channel++;
		System.out.println("현재 채널은 "+ k44_channel);
	}
	static void k44_ChannelDn() {	//채널에 1을 빼주는 함수
		k44_channel--;
		System.out.println("현재 채널은 "+ k44_channel);
	}
	static void k44_volUp() {	//볼륨에 1을 더해주는 함수
		k44_vol++;
		System.out.println("현재 볼륨은 "+ k44_vol);
	}
	static void k44_volDn() {	//볼륨에 1을 빼주는 함수
		k44_vol--;
		System.out.println("현재 볼륨은 "+ k44_vol);
	}
}