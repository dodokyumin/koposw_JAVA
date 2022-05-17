package p30;

public class k44_OneRec {
	
	private int k44_student_id;//학번을 받아 전역변수로 저장할 수 있게 설정
	private String k44_name;//name을 받아 전역변수로 저장할 수 있게 설정
	private int k44_kor;//kor을 받아 전역변수로 저장할 수 있게 설정
	private int k44_eng;//eng을 받아 전역변수로 저장할 수 있게 설정
	private int k44_mat;//mat을 받아 전역변수로 저장할 수 있게 설정

	public k44_OneRec(int k44_student_id, String k44_name, int k44_kor, int k44_eng, int k44_mat) {
		//이름 국어점수 영어점수 수학점수를 파라미터로 받는 함수 생성.
		this.k44_student_id = k44_student_id;//파라미터로 받은 학번을 전역변수에 저장.
		this.k44_name = k44_name;//파라미터로 받은 name을 전역변수에 저장.
		this.k44_kor = k44_kor;//파라미터로 받은 kor을 전역변수에 저장.
		this.k44_eng = k44_eng;//파라미터로 받은 eng을 전역변수에 저장.
		this.k44_mat = k44_mat;//파라미터로 받은 mat을 전역변수에 저장.

	}
	public int k44_student_id () {//설정한 전역변수를 리턴받아 돌려주는 메소드 생성
		return this.k44_student_id;
	};
	public String k44_name() {//설정한 전역변수를 리턴받아 돌려주는 메소드 생성
		return this.k44_name;
	};
	public int k44_kor() {//설정한 전역변수를 리턴받아 돌려주는 메소드 생성
		return this.k44_kor;
	};
	public int k44_eng() {//설정한 전역변수를 리턴받아 돌려주는 메소드 생성
		return this.k44_eng;
	};
	public int k44_mat() {//설정한 전역변수를 리턴받아 돌려주는 메소드 생성
		return this.k44_mat;
	};
	public int k44_sum() {//설정한 전역변수(국어 영어 점수)의 합을 받아 합계로 리턴하는 메소드 생성
		return this.k44_kor + this.k44_eng + this.k44_mat;
	};
	public double k44_ave() {//합계메소드로 리턴받은 합계를 3으로 나누어 평균값을 리턴하는 메소드 생성
		return this.k44_sum()/3.0;
	};
	
}