package p09;

public class k44_TVRemocon {
	
	public static int k44_channel, k44_vol;	//���������� ä�ΰ� ������ �������ش�.

	void k44_ChannelUp() {	//ä�ο� ���� 1 ���ϴ� �Լ� = ä���� �ø�.
		k44_channel++;
		System.out.println("���� ä���� "+ k44_channel);
	}
	void k44_ChannelDn() {	//ä�ο� ���� 1 ���� �Լ� = ä���� ����.
		k44_channel--;
		System.out.println("���� ä���� "+ k44_channel);
	}
	void k44_volUp() {	//������ ���� 1 ���ϴ� �Լ� = ������ �ø�.
		k44_vol++;
		System.out.println("���� ������ "+ k44_vol);
	}
	void k44_volDn() {	//������ ���� 1 ������ �Լ� = ������ ����.
		k44_vol--;
		System.out.println("���� ������ "+ k44_vol);
	}
}