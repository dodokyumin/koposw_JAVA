package p18_p19;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;

public class p18_p19 {


		
	public static JSONObject oneRec(String k44_name, int k44_studentid, int k44_kor, int k44_eng, int k44_mat) {	//데이터값들을 받는 JSONObject형식의 oneRec함수만들기
		
		JSONObject k44_dataObject = new JSONObject();	//JSONObject 클래스의 인스턴스 dataObject생성
		k44_dataObject.put("name",k44_name);	//dataObject의 JSONObject에 데이터들을 put() 함수를 통해 넣기
		k44_dataObject.put("studentid",k44_studentid);
		//Json Array생성
		JSONArray score = new JSONArray();
		score.add(k44_kor);
		score.add(k44_eng);
		score.add(k44_mat);
		k44_dataObject.put("score",score);
		
		return k44_dataObject;	//데이터들을 모은 인스턴스를 리턴하도록(JSONObject형식)
			
		}
		
	
	public static void main(String[] args) {
		
		//최종 완성될 JSONObject 선언(전체)
		JSONObject k44_jsonObject = new JSONObject();
		//한명 성적의 JSON정보를 담을 Array선언
		JSONArray k44_datasArray = new JSONArray();
		
		//한명 정보가 들어갈 JSONObject 선언
		JSONObject k44_dataObject = new JSONObject();
		k44_dataObject.put("name","나연"); //JSON은STRING에도 큰따옴표
		k44_dataObject.put("studentid",209901);
		
		//Json Array 생성
		JSONArray k44_score = new JSONArray();
		k44_score.add(90);
		k44_score.add(100);
		k44_score.add(95);
		k44_dataObject.put("score", k44_score);
		k44_datasArray.add(k44_dataObject);
		
		//깔끔하게 함수 처리
		k44_datasArray.add(oneRec("정연", 209902,100,85,75));	//만들어두었던 oneRec함수에 각 파라미터들을 전달에 JSONObject에 데이터들을 간편하게 저장한다.
		k44_datasArray.add(oneRec("모모", 209903,90,75,85));
		k44_datasArray.add(oneRec("사나", 209904,90,85,75));
		k44_datasArray.add(oneRec("지효", 209905,80,75,85));
		k44_datasArray.add(oneRec("미나", 209906,90,85,55));
		k44_datasArray.add(oneRec("다현", 209907,70,75,65));
		k44_datasArray.add(oneRec("채영", 209908,100,75,95));
		k44_datasArray.add(oneRec("정연", 209909,80,65,95));
		
		try {
			FileWriter k44_file = new FileWriter("C:\\Users\\501-01\\Desktop\\p18_p19.json");	//FileWriter클래스의 file인스턴스를 만들고 파일을 새로 기록할 파일의 경로를 설정해준다.
			k44_file.write(k44_datasArray.toJSONString());	//datasArray를 JSON파일에 저장해야하니 JSONString으로 타입캐스팅 해주기
			k44_file.flush();	//flush()는 버퍼에 있는 모든 내용을 처리해라 라는 내용. 메모리에서 작업한 내용을 디바이스로 털어 넣어주기
			k44_file.close();	//close로 닫아줘야한다. 계속 열려있으면 서버에서 그만큼의 할당량을 소모하는 중이므로 나중에 서버 터질 수 있음.
		} catch(IOException k44_e) { //인풋 아웃풋 예외처리를 변수에 담아서
			k44_e.printStackTrace();	//예외발생시 출력하는 코드를 만든다.
		}
		System.out.println("JSON 만든거 : "+k44_datasArray);	//JSON에 담은 내용을 확인차 콘솔에 출력한다.
		
	}

}