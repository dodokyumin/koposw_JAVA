package p30;

public class k44_OneRec {
	
	private int k44_student_id;//�й��� �޾� ���������� ������ �� �ְ� ����
	private String k44_name;//name�� �޾� ���������� ������ �� �ְ� ����
	private int k44_kor;//kor�� �޾� ���������� ������ �� �ְ� ����
	private int k44_eng;//eng�� �޾� ���������� ������ �� �ְ� ����
	private int k44_mat;//mat�� �޾� ���������� ������ �� �ְ� ����

	public k44_OneRec(int k44_student_id, String k44_name, int k44_kor, int k44_eng, int k44_mat) {
		//�̸� �������� �������� ���������� �Ķ���ͷ� �޴� �Լ� ����.
		this.k44_student_id = k44_student_id;//�Ķ���ͷ� ���� �й��� ���������� ����.
		this.k44_name = k44_name;//�Ķ���ͷ� ���� name�� ���������� ����.
		this.k44_kor = k44_kor;//�Ķ���ͷ� ���� kor�� ���������� ����.
		this.k44_eng = k44_eng;//�Ķ���ͷ� ���� eng�� ���������� ����.
		this.k44_mat = k44_mat;//�Ķ���ͷ� ���� mat�� ���������� ����.

	}
	public int k44_student_id () {//������ ���������� ���Ϲ޾� �����ִ� �޼ҵ� ����
		return this.k44_student_id;
	};
	public String k44_name() {//������ ���������� ���Ϲ޾� �����ִ� �޼ҵ� ����
		return this.k44_name;
	};
	public int k44_kor() {//������ ���������� ���Ϲ޾� �����ִ� �޼ҵ� ����
		return this.k44_kor;
	};
	public int k44_eng() {//������ ���������� ���Ϲ޾� �����ִ� �޼ҵ� ����
		return this.k44_eng;
	};
	public int k44_mat() {//������ ���������� ���Ϲ޾� �����ִ� �޼ҵ� ����
		return this.k44_mat;
	};
	public int k44_sum() {//������ ��������(���� ���� ����)�� ���� �޾� �հ�� �����ϴ� �޼ҵ� ����
		return this.k44_kor + this.k44_eng + this.k44_mat;
	};
	public double k44_ave() {//�հ�޼ҵ�� ���Ϲ��� �հ踦 3���� ������ ��հ��� �����ϴ� �޼ҵ� ����
		return this.k44_sum()/3.0;
	};
	
}