package p10;

public class TestMain2 {

	public static void main(String[] args) {
		
		k44_Calc1 k44_cc = new k44_Calc1();	//Clac1Ŭ������ �ҷ��� ���ο� �ν��Ͻ� cc�� �������.

		System.out.printf("2�� ������ ȣ��� [%d]\n", k44_cc.k44_sum(1,2)); 
		System.out.printf("3�� ������ ȣ��� [%d]\n", k44_cc.k44_sum(1,2,3));
		System.out.printf("4�� ������ ȣ��� [%d]\n", k44_cc.k44_sum(1,2,3,4));
		System.out.printf("������ ������ ȣ��� [%f]\n", k44_cc.k44_sum(1.2, 3.4));
		
		//���� ���ڸ� �޸��Ͽ� �Ѱ��� �޼ҵ�� �پ��� ��������� �ҷ����� �޼ҵ� �����ε�
	}

}