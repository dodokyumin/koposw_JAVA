package Practice;
//parents�� extends �ؼ� ��ü������ ���� ���ص� �ȴ�. extends�� ������ �ִ°�
//extends�� �����ִ� (���ʾ�) �ڽ�
public class Main extends Parents{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.myName();
	}

	@Override
	public void myName() {
		// TODO Auto-generated method stub
		super.myName();
		System.out.println("Son : Jade");
	}

	@Override
	public void myAge() {
		// TODO Auto-generated method stub
		super.myAge();
		System.out.println("Son : 20");
	}

	//��Ŭ�� �ҽ� -> �������̵�
	
}
