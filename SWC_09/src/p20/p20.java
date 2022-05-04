package p20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class p20 {

	public static void main(String[] args) throws IOException, ParseException{//throws는 try catch와 같은 느낌으로 에러 익셉션 발생하면 위로 던지기
		
		JSONParser k44_parser = new JSONParser();	//파싱을 해주는 클래스JSONParser의 인스턴스 parser를 새로 만들어준다.
		
		Object k44_obj = k44_parser.parse(new FileReader("C:\\Users\\501-01\\Desktop\\p18_p19.json")); //parse()메소드를 통해 파싱할 JSON파일의 경로를 지정해주고, 해당 데이터를 Object형태의 변수 obj에 담아준다
		
		//JSONObject jsonObject = (JSONObject) obj;
		JSONArray k44_array = (JSONArray)k44_obj; //딱히 키가 없는 어레이라 이런식으로 연결
		
		System.out.println("*****************************************************"); //줄긋기
		
		for(int k44_i=0; k44_i<k44_array.size(); k44_i++) {	//어레이만큼 반복한다
			JSONObject k44_result = (JSONObject) k44_array.get(k44_i); //Array에서 하나를 뺴온다
			System.out.println("이름 : " + k44_result.get("name"));	//이름가져오고	
			System.out.println("학번 : " + k44_result.get("studentid")); //학번가져오고
			
			JSONArray k44_score = (JSONArray) k44_result.get("score");//성적을 가져오는데 이놈도 배열
			long k44_kor = (long)k44_score.get(0);	//배열중 첫번째 것은 국어
			long k44_eng = (long)k44_score.get(1);	//두번째 영어
			long k44_mat = (long)k44_score.get(2);	//세번째 수학
			System.out.println("국어 : " + k44_kor);
			System.out.println("영어 : " + k44_eng);
			System.out.println("수학 : " + k44_mat);
			System.out.println("총점 : " + (k44_kor + k44_eng + k44_mat));
			System.out.println("평균 : " + ((k44_kor+k44_eng+k44_mat)/3.0));
			System.out.println("*****************************************************");

		}
		
	}

}