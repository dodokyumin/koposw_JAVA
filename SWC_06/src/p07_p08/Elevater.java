package p07_p08;

public class Elevater {
		//ppt 7p
		int k44_limit_up_floor = 10; //최상위층 설정하기
		int k44_limit_down_floor = 0;	//최하위층 설정하기
		int k44_floor = 1;	//현재층 설정하기
		String k44_help;
		
		void up() {	//엘레베이터가 올라감
		
			if (k44_floor == k44_limit_up_floor) {	//만약 현재 층이 최고층에 다다르면 
				k44_help = "마지막층입니다.";
			} else {	//아직 다다르지 않았다면
				k44_floor++;
				k44_help = String.format("%d층입니다",k44_floor);
			}
		}

		void down() {	//엘레베이터가 내려감
			
			if (k44_floor == k44_limit_down_floor) {
				k44_help = "처음층입니다.";
			} else {
				k44_floor--;	//최하층이 아닐 때 한 층씩 올라감
				k44_help = String.format("%d층입니다.", k44_floor);
			}
			
		}
}