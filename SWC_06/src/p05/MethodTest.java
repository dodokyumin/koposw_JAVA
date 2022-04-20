package p05;

public class MethodTest {

	static int k44_iStatic;	//static�� ���ؼ� iStatic�̶�� ������ ������ ���� ������ �������ش�.
	
	public static void add(int k44_i) {	//iStatic�� �Ķ���ͷ� ���� i�� 1�� �����ִ� add�Լ�.
		k44_iStatic++;
		k44_i++;
		System.out.printf("add�޼ҵ忡�� -> iStatic = [%d]\n",k44_iStatic);
		System.out.printf("add�޼ҵ忡�� -> i=[%d]\n",k44_i);
	}
	
	public static int add2(int k44_i) {	////iStatic�� �Ķ���ͷ� ���� i�� 1�� �����ִ� add�Լ�. ������ i�� �����Ѵ�.
		k44_iStatic++;
		k44_i++;
		System.out.printf("add�޼ҵ忡�� -> iStatic = [%d]\n",k44_iStatic);
		System.out.printf("add�޼ҵ忡�� -> i=[%d]\n",k44_i);
		return k44_i;
	}
	
	public static void main(String[] args) {
		
		int k44_iMain;
		
		k44_iMain = 1;
		k44_iStatic = 1;

		System.out.printf("**********************\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> iStatic = [%d]\n",k44_iStatic); //2
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> iMain = [%d]\n",k44_iMain); //1
		System.out.printf("**********************\n");
		
		add(k44_iMain);	//add�޼ҵ忡 iMain(1)���� �־��־� sysout���� ����Ѵ�. ��� �ڷ����� void�̹Ƿ�.

		System.out.printf("**********************\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> iStatic = [%d]\n",k44_iStatic);	// 3�� ���ð��� ����
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> iMain = [%d]\n",k44_iMain);	// 2�� ���ð��� ����
		System.out.printf("**********************\n");

		k44_iMain = add2(k44_iMain); //add�޼ҵ忡 iMain(1)���� �־��־� ���ϰ� i�� ����.

		System.out.printf("**********************\n");
		System.out.printf("�޼ҵ� add2ȣ���� ���ο��� -> iStatic = [%d]\n",k44_iStatic);	// 3�� ���ð��� ����
		System.out.printf("�޼ҵ� add2ȣ���� ���ο��� -> iMain = [%d]\n",k44_iMain);	// 2�� ���ð��� ����
		System.out.printf("**********************\n");
		
	}

}