package p34;

public class k44_OneRec {
	// pg33 Ŭ������ ArrayList
	private int k44_studentId; // ������ ���� �й� ����
	private String k44_name; // ���ڿ� ���� �̸� ����
	private int k44_kor; // ������ ���� ���� ����
	private int k44_eng; // ������ ���� ���� ����
	private int k44_mat; // ������ ���� ���� ����

	public k44_OneRec(int studentId, String name, int kor, int eng, int mat) { // ������ ����� ���� 4��(�̸�, ����,����,����)
		this.k44_studentId = studentId; // ������ ������ ������ �����ڷ� �޾ƿ� �� �Է�
		this.k44_name = name; // ������ ������ ������ �����ڷ� �޾ƿ� �� �Է�
		this.k44_kor = kor; // ������ ������ ������ �����ڷ� �޾ƿ� �� �Է�
		this.k44_eng = eng; // ������ ������ ������ �����ڷ� �޾ƿ� �� �Է�
		this.k44_mat = mat; // ������ ������ ������ �����ڷ� �޾ƿ� �� �Է�
	}

	public int k44_getStudentId() {
		return this.k44_studentId;
	}; // �Է��� �й��� �����ϴ� �޼ҵ� ����

	public String k44_getName() {
		return this.k44_name;
	}; // �Է��� �̸��� �����ϴ� �޼ҵ� ����

	public int k44_getKor() {
		return this.k44_kor;
	}; // �Է��� ������� �����ϴ� �޼ҵ� ����

	public int k44_getEng() {
		return this.k44_eng;
	}; // �Է��� ������� �����ϴ� �޼ҵ� ����

	public int k44_getMat() {
		return this.k44_mat;
	}; // �Է��� ���м����� �����ϴ� �޼ҵ� ����

	public int k44_getSum() {
		return this.k44_kor + this.k44_eng + this.k44_mat;
	}; // �Է��� ������ �հ踦 �����ϴ� �޼ҵ� ����

	public double k44_getAve() {
		return this.k44_getSum() / 3.0;
	}; // �Է��� ������ ����� ����Ͽ� �����ϴ� �޼ҵ� ����

}