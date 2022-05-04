package p20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class p20 {

	public static void main(String[] args) throws IOException, ParseException{//throws�� try catch�� ���� �������� ���� �ͼ��� �߻��ϸ� ���� ������
		
		JSONParser k44_parser = new JSONParser();	//�Ľ��� ���ִ� Ŭ����JSONParser�� �ν��Ͻ� parser�� ���� ������ش�.
		
		Object k44_obj = k44_parser.parse(new FileReader("C:\\Users\\501-01\\Desktop\\p18_p19.json")); //parse()�޼ҵ带 ���� �Ľ��� JSON������ ��θ� �������ְ�, �ش� �����͸� Object������ ���� obj�� ����ش�
		
		//JSONObject jsonObject = (JSONObject) obj;
		JSONArray k44_array = (JSONArray)k44_obj; //���� Ű�� ���� ��̶� �̷������� ����
		
		System.out.println("*****************************************************"); //�ٱ߱�
		
		for(int k44_i=0; k44_i<k44_array.size(); k44_i++) {	//��̸�ŭ �ݺ��Ѵ�
			JSONObject k44_result = (JSONObject) k44_array.get(k44_i); //Array���� �ϳ��� ���´�
			System.out.println("�̸� : " + k44_result.get("name"));	//�̸���������	
			System.out.println("�й� : " + k44_result.get("studentid")); //�й���������
			
			JSONArray k44_score = (JSONArray) k44_result.get("score");//������ �������µ� �̳� �迭
			long k44_kor = (long)k44_score.get(0);	//�迭�� ù��° ���� ����
			long k44_eng = (long)k44_score.get(1);	//�ι�° ����
			long k44_mat = (long)k44_score.get(2);	//����° ����
			System.out.println("���� : " + k44_kor);
			System.out.println("���� : " + k44_eng);
			System.out.println("���� : " + k44_mat);
			System.out.println("���� : " + (k44_kor + k44_eng + k44_mat));
			System.out.println("��� : " + ((k44_kor+k44_eng+k44_mat)/3.0));
			System.out.println("*****************************************************");

		}
		
	}

}