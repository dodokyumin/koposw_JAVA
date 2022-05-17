package p33;

public class k44_OneRec {
	// pg33 Ŭ������ ArrayList
	private int k44_studentId;  // �й��� ����� ������ ���� �����
	private String k44_name;    // �̸��� ����� ��Ʈ���� ���� �����
	private int k44_kor; 		// ���� ������ ����� ������ ���� �����
	private int k44_eng; 		// ���� ������ ����� ������ ���� �����
	private int k44_mat; 		// ���� ������ ����� ������ ���� �����

	public k44_OneRec(int studentId, String name, int kor, int eng, int mat) { // �Ķ���� 4���� �޴� ������ ����
		this.k44_studentId = studentId; // �Ķ���ͷ� ���� ���� ���� ������ ����ֱ�
		this.k44_name = name; // ������ ������ ������ �����ڷ� �޾ƿ� �� �Է�
		this.k44_kor = kor; 
		this.k44_eng = eng; 
		this.k44_mat = mat; 
	}

	public int k44_getStudentId() {
		return this.k44_studentId;
	}; // ���������� ������ �й��� �޴� �޼ҵ�

	public String k44_getName() {
		return this.k44_name;
	}; // ���������� ������ �̸��� �޴� �޼ҵ�

	public int k44_getKor() {
		return this.k44_kor;
	}; // ���������� ������ ���������� �޴� �޼ҵ�

	public int k44_getEng() {
		return this.k44_eng;
	}; // ���������� ������ ���������� �޴� �޼ҵ�

	public int k44_getMat() {
		return this.k44_mat;
	}; // ���������� ������ ���������� �޴� �޼ҵ�

	public int k44_getSum() {
		return this.k44_kor + this.k44_eng + this.k44_mat;
	}; // ���������� ������ �� ������ ���� �հ踦 �޴� �޼ҵ�

	public double k44_getAve() {
		return this.k44_getSum() / 3.0;
	}; // �հ踦 �޴� �޼ҵ带 ���� �հ踦 �ް� 3���� ������ ��հ��� ���Ϲ޴� �޼ҵ�

}