package p11;

public class TestMain {

	public static void main(String[] args) {
		
		k44_ReportCard k44_rc = new k44_ReportCard(); //ReportCardŬ������ �ҷ��� ���ο� �ν��Ͻ� rc�� �������.

		k44_rc.k44_printMon(100, 100, 100);	//rc�� ������ �Ķ���� ���� ���� ������ �Ķ���� ���� �޴� �Լ��� ȣ����
		
		k44_rc.k44_printMon(100, 100, 100, 100);	//rc�� ������ �Ķ���� ���� ���� ������ �Ķ���� ���� �޴� �Լ��� ȣ����
		
		k44_rc.k44_printMon(100, 100, 100, 100, 100);	//rc�� ������ �Ķ���� �ټ��� ���� ������ �Ķ���� �ټ��� �޴� �Լ��� ȣ����

	}

}