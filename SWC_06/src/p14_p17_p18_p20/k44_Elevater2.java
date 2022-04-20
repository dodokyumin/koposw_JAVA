package p14_p17_p18_p20;

public class k44_Elevater2 {
	
	public int k44_limit_up_floor = 10;	//최대 층을 10층으로 설정
	public int k44_limit_down_floor = 0; 	//제일 밑 층을 0층으로 설정
	public int k44_floor = 1;	//현재 층을 1층으로 설정
	public String k44_help;	//메소드를 통해 String을 받을 전역변수 help를 셋한다.
	
	k44_Elevater2(){	//생성자는 인스턴스를 생성하자마자 실행되는, 즉 값들을 바로 세팅해줄 수 있는 함수이다.
		k44_limit_up_floor = 10;
		k44_limit_down_floor = 1;
		k44_floor = 1;
		k44_help = "엘레베이터 준공 완료";
		System.out.println(k44_help);
	}
	
	k44_Elevater2(int k44_up_floor, int k44_d_floor, int k44_in_floor){	//파라미터 셋을 받는 함수
		k44_limit_up_floor = k44_up_floor;
		k44_limit_down_floor = k44_d_floor;
		k44_floor = k44_in_floor;
		k44_help = "엘레베이터 맞춤 준공 완료";
	}
	
	void k44_up() {	//엘레베이터 층 더하기 1
	
		if (k44_floor == k44_limit_up_floor) {
			k44_help = "마지막층입니다.";
		} else {
			k44_floor++;
			k44_help = String.format("%d층입니다",k44_floor);
		}
	}

	void k44_down() {	//엘레베이터 층 뺴기 1
		
		if (k44_floor == k44_limit_down_floor) {
			k44_help = "처음층입니다.";
		} else {
			k44_floor--;
			k44_help = String.format("%d층입니다.", k44_floor);
		}
		
	}
	
	void k44_up(int k44_u) {	//엘레비이터 층을 더할 때 정수형 인자를 받으면 그만큼 반복을 할 수 있게 하는 for문 설정.
		for(int k44_i=0; k44_i<k44_u; k44_i++) {
			this.k44_up();
		}
	}
	
	void k44_down(int k44_u) {	//엘레비이터 층을 뺼 때 정수형 인자를 받으면 그만큼 반복을 할 수 있게 하는 for문 설정.
		for(int k44_i=0; k44_i<k44_u; k44_i++) {
			k44_down();
		}
	}
	
	void k44_msg(String k44_id) {	//String 인자를 받아 메세지를 출력하는 함수 설정.
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n", k44_id, k44_help, k44_limit_up_floor, k44_limit_down_floor, k44_floor);
	}
	
}