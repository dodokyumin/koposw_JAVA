package p39;

public class k44_InputData {

	public static int[] k44_i, k44_kor, k44_eng, k44_mat, k44_sum;	//static을 통해 같은 클래스에 있는 함수들도 같이 사용할 수 있는 전역변수를 설정했다.
	public static float[] k44_ave;	//평균값을 저장하는 배열 변수
	public static String[] k44_name;	//이름을 저장하는 배열 변수
	
	public k44_InputData(int k44_iPerson) {	//해당 메소드는 정수형 파라미터를 받아 각 항목당 배열 순서에 맞는 자료들을 꺼내준다.
		
		k44_i = new int [k44_iPerson];
		k44_kor = new int [k44_iPerson];
		k44_eng = new int [k44_iPerson];
		k44_mat = new int [k44_iPerson];
		k44_sum = new int [k44_iPerson];
		k44_ave = new float [k44_iPerson];
		k44_name = new String [k44_iPerson];
		
	}
	
	public void k44_SetData (int k44_i, String k44_name, int k44_kor, int k44_eng, int k44_mat ) {	//파라미터로 받은 값들을 현재 이 클래스의 전역변수 배열에(this.)하나씩 순서대로 저장한다
		
		this.k44_i[k44_i] = k44_i;
		this.k44_name[k44_i] = k44_name;
		this.k44_kor[k44_i] = k44_kor;
		this.k44_eng[k44_i] = k44_eng;
		this.k44_mat[k44_i] = k44_mat;
		this.k44_sum[k44_i] = k44_kor + k44_eng + k44_mat;
		this.k44_ave[k44_i] = (float)((k44_sum[k44_i])/3.0);
		
	}
}