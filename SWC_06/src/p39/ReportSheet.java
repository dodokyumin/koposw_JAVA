package p39;

public class ReportSheet {

	public static void main(String[] args) {
		
		int k44_iPerson = 10;	//사람 수 설정하기
		
		k44_InputData k44_inData = new k44_InputData(k44_iPerson); //InputData클래스를 받아 새로운 inData인스턴스를 생성한다.
		
		for (int k44_i=0; k44_i<k44_iPerson; k44_i++) {	//사람 수만큼 반복을 돌며 해당 랜덤데이타들을 변수에 담아두어 SetData의 파라미터로 전달해준다.
			String k44_name = String.format("홍길%02d", k44_i);
			int k44_kor = (int)(Math.random()*100);
			int k44_eng = (int)(Math.random()*100);
			int k44_mat = (int)(Math.random()*100);
			k44_inData.k44_SetData(k44_i, k44_name, k44_kor, k44_eng, k44_mat);
			
		}

		for(int k44_i=0; k44_i<k44_iPerson; k44_i++) { //위에서 저장한 데이타들을 사람의 수만큼 돌려 각 항목의 배열에 접근하여 리스트를 뽑는다.
			System.out.printf("번호:%d, 이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n",
					k44_i, k44_inData.k44_name[k44_i], k44_inData.k44_kor[k44_i], k44_inData.k44_eng[k44_i], k44_inData.k44_mat[k44_i], k44_inData.k44_sum[k44_i], k44_inData.k44_ave[k44_i]);
		}
		
	}

}