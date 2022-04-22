package p08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class p82 {
	
//분당융기원과 가장 가까운 곳과, 먼곳을 찾아 인쇄 실습 별 하나(★)
	
	public static void main(String[] args) throws IOException {
		
		File k44_f = new File("C:\\Users\\501-01\\Desktop\\성남시_무료와이파이정보.txt");	//File 클래스의 인스턴스 f를 만들어 .txt파일을 불러온다.
		BufferedReader k44_br = new BufferedReader(new FileReader(k44_f));	//인스턴스 f파일을 읽는 buffer인스턴스 br을 생성했다.
		
		String k44_readtxt;
		
		if((k44_readtxt= k44_br.readLine())==null) {	//!!이때 readtxt에 br.readLine()(첫째 줄)을 넣어주는 것(첫째 줄은 리스트 종류 이름), 그리고 나서 그것이 null인지 확인하는 것
			System.out.printf("빈 파일입니다\n");
			return;
		}
		String[] k44_field_name = k44_readtxt.split("\t");	//첫째줄(왜냐하면 반복을 안함) = 항목 명을 저장한 String변수 readtxt를 ","로 나누어 field_name 배열에 저장한다
	
		
		
		
		//우리집(분당 융기원) 위도 경도 값 변수에 저장하기. 구글 지도를 통해 얻은 데이터.
		double k44_lat = 37.3860521;
		double k44_lng = 127.1214038;
		
		double k44_distMin = 0, k44_distMax = 0;	//거리의 최장 최단 거리를 저장할 변수 설정
		int k44_cntMin = 0, k44_cntMax = 0;	//최장 최단거리가 나왔을 때 해당 카운드를 저장해 줄 변수를 설정.
		String k44_longiMin = "", k44_latiMin = "", k44_longiMax = "", k44_latiMax = "", k44_addressMin = "", k44_addressMax = "";	// 최솟값과 최댓값이 나올 때의 각 위도와 경도, 지명을 담아줄 변수를 설정
		
		int k44_LineCnt = 0; //몇번째 줄인지 저장할 변수
		
		while((k44_readtxt = k44_br.readLine())!=null) {	//while을 돌릴 때마다 br.readLine을 readtxt에 담는 코드를 먼저 실행하는 것이였다!!!그래서 다음줄 다음줄 진행할 수 있었따!!!
			
			String[] k44_field = k44_readtxt.split("\t");	//탭으로 데이터들을 구분한 txt 파일이므로 첫 항목을 가져올 때 split의 기준도 당연 탭!
			
			double k44_dist = Math.sqrt( Math.pow(Double.parseDouble(k44_field[13])-k44_lat,2)	//피타고라스의 정리를 이용해 밑변과 높이 데이터를 가지고 빗변 즉 최단거리를 계산
					+ Math.pow(Double.parseDouble(k44_field[14])-k44_lng,2));			//(원래는 지구는 둥그니 삼각함수도 적용해야함) 계산한 실수형 데이터를 변수 distance에 저장.
			
			k44_distMin = (k44_distMin == 0)? k44_dist : k44_distMin;	//처음은 기준이 자기자신이 되므로, 무조건 true가 될 수밖에 없는 삼항연산자를 만들어 초기값을 1번째 필드값으로 설정.
			k44_distMax = (k44_distMin == 0)? k44_dist : k44_distMax;
			
			if(k44_distMin > k44_dist) {	//자기 기준 자기보다 작은 거리가 있으면 그때마다의 지번, 위도, 경도값을 저장해준다.
				k44_distMin = k44_dist;
				k44_addressMin = k44_field[9];
				k44_longiMin = k44_field[13];
				k44_latiMin = k44_field[14];
				k44_cntMin = k44_LineCnt;
				
			}
			if(k44_distMax < k44_dist) {	//자기 기준 자기보다 먼 거리가 있으면 그때마다의 지번, 위도, 경도값을 저장해준다.
				k44_distMax = k44_dist;
				k44_addressMax = k44_field[9];
				k44_longiMax = k44_field[13];
				k44_latiMax = k44_field[14];
				k44_cntMax = k44_LineCnt;
			}
			
			k44_LineCnt++;
		}	
			
			System.out.printf("**[%d번째 항목(최단거리)]*************\n",k44_cntMin);
			System.out.printf(" %s : %s\n", k44_field_name[9], k44_addressMin);	//항목의 9번째 데이터가 지번 주소이다.
			System.out.printf(" %s : %s\n", k44_field_name[13], k44_longiMin);	//12번 : 위도주소
			System.out.printf(" %s : %s\n", k44_field_name[14],k44_latiMin);	// : 경도주소
			System.out.printf(" 현재지점과의 거리 : %fm\n",k44_distMin*100000);
			System.out.printf("****************************\n");
			
			System.out.printf("\n**[%d번째 항목(최장거리)]*************\n",k44_cntMax);
			System.out.printf(" %s : %s\n", k44_field_name[9], k44_addressMax);	//항목의 9번째 데이터가 지번 주소이다.
			System.out.printf(" %s : %s\n", k44_field_name[13], k44_longiMax);	//13번 : 위도주소
			System.out.printf(" %s : %s\n", k44_field_name[14], k44_latiMax);	//14번: 경도주소
			System.out.printf(" 현재지점과의 거리 : %fm\n",k44_distMax*100000);
			System.out.printf("****************************\n");
			
		
		
		k44_br.close();	//BufferedReader클래스의 close메소드를 통해 쓰기모드를 종료해준다.
	}

}
