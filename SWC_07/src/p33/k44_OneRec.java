package p33;

public class k44_OneRec {
	// pg33 클래스의 ArrayList
	private int k44_studentId;  // 학번을 담아줄 정수형 변수 만들기
	private String k44_name;    // 이름을 담아줄 스트링형 변수 만들기
	private int k44_kor; 		// 국어 점수를 담아줄 정수형 변수 만들기
	private int k44_eng; 		// 영어 점수를 담아줄 정수형 변수 만들기
	private int k44_mat; 		// 수학 점수를 담아줄 정수형 변수 만들기

	public k44_OneRec(int studentId, String name, int kor, int eng, int mat) { // 파라미터 4개를 받는 생성자 생성
		this.k44_studentId = studentId; // 파라미터로 받은 값을 전역 변수에 담아주기
		this.k44_name = name; // 위에서 선언한 변수에 생성자로 받아온 값 입력
		this.k44_kor = kor; 
		this.k44_eng = eng; 
		this.k44_mat = mat; 
	}

	public int k44_getStudentId() {
		return this.k44_studentId;
	}; // 전역변수에 저장한 학번을 받는 메소드

	public String k44_getName() {
		return this.k44_name;
	}; // 전역변수에 저장한 이름을 받는 메소드

	public int k44_getKor() {
		return this.k44_kor;
	}; // 전역변수에 저장한 국어점수를 받는 메소드

	public int k44_getEng() {
		return this.k44_eng;
	}; // 전역변수에 저장한 영어점수를 받는 메소드

	public int k44_getMat() {
		return this.k44_mat;
	}; // 전역변수에 저장한 수학점수를 받는 메소드

	public int k44_getSum() {
		return this.k44_kor + this.k44_eng + this.k44_mat;
	}; // 전역변수에 저장한 각 점수를 더해 합계를 받는 메소드

	public double k44_getAve() {
		return this.k44_getSum() / 3.0;
	}; // 합계를 받는 메소드를 통해 합계를 받고 3으로 나누어 평균값을 리턴받는 메소드

}