package p15_p18;

public class k44_TVRemocon {
	
	public static int k44_channel, k44_vol;	//�������� channel�� vol�� �����Ͽ� ��� �޼ҵ�ּ� Ȱ�밡���ϰ� ����.
	
	k44_TVRemocon(){	//�����ڴ� �ν��Ͻ��� �������ڸ��� ����Ǵ� �Լ��̴�. �Ķ���ͳ� �ڷ����� ����.
		
		k44_channel = 10;	//�ʱⰪ �������ش�.
		k44_vol = 10;
		
		for(int k44_i=0; k44_i<10; k44_i++)	//for���� ���ؼ� �ݺ��Ǵ� ��ŭ �޼ҵ� ȣ��
			k44_TVRemocon.k44_ChannelUp();
		for(int k44_i=0; k44_i<10; k44_i++)
			k44_TVRemocon.k44_ChannelDn();
		for(int k44_i=0; k44_i<5; k44_i++)
			k44_TVRemocon.k44_volUp();
		for(int k44_i=0; k44_i<5; k44_i++)
			k44_TVRemocon.k44_volDn();
	}
	
	static void k44_ChannelUp() {	//ä�ο� 1�� �����ִ� �Լ�
		k44_channel++;
		System.out.println("���� ä���� "+ k44_channel);
	}
	static void k44_ChannelDn() {	//ä�ο� 1�� ���ִ� �Լ�
		k44_channel--;
		System.out.println("���� ä���� "+ k44_channel);
	}
	static void k44_volUp() {	//������ 1�� �����ִ� �Լ�
		k44_vol++;
		System.out.println("���� ������ "+ k44_vol);
	}
	static void k44_volDn() {	//������ 1�� ���ִ� �Լ�
		k44_vol--;
		System.out.println("���� ������ "+ k44_vol);
	}
}