package _04;

public class p16 {

	public static void main(String[] args) {

		int k44_il;																//������ ���� il����
		double k44_iD;															//�Ǽ��� ���� iD����

		k44_il = 10 / 3;														//il�� �������̱� ������ 10/3�� �� 3.333..���� �Ҽ����� ������ 3�� il�� ����ȴ�.
		k44_iD = 10 / 3.0;														//iD�� �Ǽ����̱� ������ 10/3.0 double���� ���� �� 3.333..�� ��� ����ȴ�.

		if (k44_il == k44_iD)													//���� il�� iD�� ���ٸ� (3 == 3.33..�� false�̱� ������ else�� ����ȴ�.)
			System.out.printf("equal \n");										//���
		else																	//�׷��� �ʴٸ�
			System.out.printf("Not equal [%f][%f]\n", (double) k44_il, k44_iD);	//�̶� il�� Ÿ��ĳ���� (double)il ���־� int 3�� double 3.000000���� �Ǿ� ��µȴ�.

		if (k44_iD == 3.333333)													//iD�� 3.333333�̸� �Ʒ� ���๮ ���� (true)
			System.out.printf("equal \n");
		else																	//iD�� 3.333333�� �ƴϸ�
			System.out.printf("Not equal [3.333333] [%f]\n", k44_iD);			

		k44_iD = (int) k44_iD;													//iD(3.333333)�� ���������� Ÿ�� ĳ�������־� �Ҽ��ڸ����� ���ȴ�. => 3

		if (k44_il == k44_iD)													//���� il == iD�� ������, (3 == 3 �� true�̴�)
			System.out.printf("equal \n");								
		else
			System.out.printf("Not equal [%f][%f]\n", (double) k44_il, k44_iD);

		System.out.printf("int�� �μ� [%d] [%f] \n", k44_il, k44_iD);			//printf�Լ����� %�� ������ ����� �޴� il�� d(������)���� �ϸ� 3���.iD�� f(�Ǽ���)���� �ϸ� 3.000000���
		System.out.printf("double�� �μ� [%f][%f]\n", (double) k44_il, k44_iD);	//���� il�� ���� 3, �Ǽ������� Ÿ��ĳ����(double)�Ͽ� 3.000000���� ���.

		char k44_a = 'c';														//ĳ������ ���� a�� ĳ���� 'c'�� ����ش�.
		if (k44_a == 'b')														//ĳ���ͺ��� a�� 'c' �̹Ƿ� 'b'�� �ƴϴ�. �� if�� false�̴�.
			System.out.printf("k44_a�� b�̴�\n");
		if (k44_a == 'c')														//ĳ���ͺ��� a�� 'c' �̹Ƿ� 'c'��. �� if�� true�̴�.
			System.out.printf("k44_a�� c�̴�\n");
		if (k44_a == 'd')														//ĳ���ͺ��� a�� 'c' �̹Ƿ� 'd'�� �ƴϴ�. �� if�� false�̴�.				
			System.out.printf("k44_a�� d�̴�\n");

		String k44_aa = "abcd";													//���ڿ��� ���� aa�� ���ڿ� "abcd"�� ����ش�.

		if (k44_aa.equals("abcd"))												//���ڿ������� �񱳴� ==�δ� �Ұ���!!! .equals()�޼ҵ带 �̿��Ͽ� ���Ѵ�. aa�� "abcd"�� epual�̴�. =true
			System.out.printf("k44_aa�� abcd�̴�\n");							//true�̱� ������ �� ���๮ ����ǰ� if�� Ż��
		else
			System.out.printf("k44_aa�� abcd�� �ƴϴ�\n");

		boolean k44_bb = true;													//�Ҹ����� ������ true�� false �� �ΰ��� ���� ���� �� �ִ�. ���� bb�� �Ҹ��� true�� �־��ش�.

		if (!!k44_bb)															//!!�� not not. �ᱹ bb�� �� �״��. bb�� true�̱� ������ �Ʒ� ���๮ ����.
			System.out.printf("k44_bb�� �ƴϰ� �ƴϸ� ���̴�\n");
		else
			System.out.printf("k44_bb�� �ƴϰ� �ƴϸ� �����̴�\n");
	}

}
