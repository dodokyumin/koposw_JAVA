package PackA;

public class SubA {
	//Ŭ������ ���� �̸��� �ڷ����� ���� ������ => ������Ʈ�� �����ϸ� ������ ȣ���� �ȴ�.
	public SubA() {
		System.out.println("Object Created");
	}
	//�������� �����ε�(���ڰ����� �ڷ����� ���� �Ǹ鼭 �����ε��)
	public SubA(String name) {
		System.out.println(name + "Object Created");
	}
	
	//�޼ҵ� ����
	public void printMultiple( ) {
		System.out.println("multipple");
	}
	//�޼ҵ� ����
	public void printHelloWorld( ) {
			System.out.println("Hello World");
	}
}
