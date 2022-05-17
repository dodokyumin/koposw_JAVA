package p34;

public class k44_OneRec {
	// pg33 클래스의 ArrayList
	private int k44_studentId; // 정수형 변수 학번 생성
	private String k44_name; // 문자열 변수 이름 생성
	private int k44_kor; // 정수형 변수 국어 생성
	private int k44_eng; // 정수형 변수 영어 생성
	private int k44_mat; // 정수형 변수 수학 생성

	public k44_OneRec(int studentId, String name, int kor, int eng, int mat) { // 생성자 만들기 변수 4개(이름, 국어,영어,수학)
		this.k44_studentId = studentId; // 위에서 선언한 변수에 생성자로 받아온 값 입력
		this.k44_name = name; // 위에서 선언한 변수에 생성자로 받아온 값 입력
		this.k44_kor = kor; // 위에서 선언한 변수에 생성자로 받아온 값 입력
		this.k44_eng = eng; // 위에서 선언한 변수에 생성자로 받아온 값 입력
		this.k44_mat = mat; // 위에서 선언한 변수에 생성자로 받아온 값 입력
	}

	public int k44_getStudentId() {
		return this.k44_studentId;
	}; // 입력한 학번을 리턴하는 메소드 생성

	public String k44_getName() {
		return this.k44_name;
	}; // 입력한 이름을 리턴하는 메소드 생성

	public int k44_getKor() {
		return this.k44_kor;
	}; // 입력한 국어성적을 리턴하는 메소드 생성

	public int k44_getEng() {
		return this.k44_eng;
	}; // 입력한 영어성적을 리턴하는 메소드 생성

	public int k44_getMat() {
		return this.k44_mat;
	}; // 입력한 수학성적을 리턴하는 메소드 생성

	public int k44_getSum() {
		return this.k44_kor + this.k44_eng + this.k44_mat;
	}; // 입력한 성적의 합계를 리턴하는 메소드 생성

	public double k44_getAve() {
		return this.k44_getSum() / 3.0;
	}; // 입력한 성적의 평균을 계산하여 리턴하는 메소드 생성

}