package PackA;

//�ٸ� ��Ű���� �ڹ����� �ҷ�����
import PackB.Sub2;

public class Main {

	public static void main(String[] args) {
		System.out.println("iloveyou");
		
		//��ü(Ŭ����) ����
		SubA suba = new SubA("kyumin"/*���⿡ ���ڸ� �־��ָ� �����ε�� Ŭ������ ����ȴ�*/);
		
		suba.printMultiple();
		suba.printHelloWorld();
	}	
	
	Sub2 addA = new Sub2();
	Sub2 addB = new Sub2();
	Sub2 addC = new Sub2();
	Sub2 addD = new Sub2();
}
