package p18_p19;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;

public class p18_p19 {


		
	public static JSONObject oneRec(String k44_name, int k44_studentid, int k44_kor, int k44_eng, int k44_mat) {	//�����Ͱ����� �޴� JSONObject������ oneRec�Լ������
		
		JSONObject k44_dataObject = new JSONObject();	//JSONObject Ŭ������ �ν��Ͻ� dataObject����
		k44_dataObject.put("name",k44_name);	//dataObject�� JSONObject�� �����͵��� put() �Լ��� ���� �ֱ�
		k44_dataObject.put("studentid",k44_studentid);
		//Json Array����
		JSONArray score = new JSONArray();
		score.add(k44_kor);
		score.add(k44_eng);
		score.add(k44_mat);
		k44_dataObject.put("score",score);
		
		return k44_dataObject;	//�����͵��� ���� �ν��Ͻ��� �����ϵ���(JSONObject����)
			
		}
		
	
	public static void main(String[] args) {
		
		//���� �ϼ��� JSONObject ����(��ü)
		JSONObject k44_jsonObject = new JSONObject();
		//�Ѹ� ������ JSON������ ���� Array����
		JSONArray k44_datasArray = new JSONArray();
		
		//�Ѹ� ������ �� JSONObject ����
		JSONObject k44_dataObject = new JSONObject();
		k44_dataObject.put("name","����"); //JSON��STRING���� ū����ǥ
		k44_dataObject.put("studentid",209901);
		
		//Json Array ����
		JSONArray k44_score = new JSONArray();
		k44_score.add(90);
		k44_score.add(100);
		k44_score.add(95);
		k44_dataObject.put("score", k44_score);
		k44_datasArray.add(k44_dataObject);
		
		//����ϰ� �Լ� ó��
		k44_datasArray.add(oneRec("����", 209902,100,85,75));	//�����ξ��� oneRec�Լ��� �� �Ķ���͵��� ���޿� JSONObject�� �����͵��� �����ϰ� �����Ѵ�.
		k44_datasArray.add(oneRec("���", 209903,90,75,85));
		k44_datasArray.add(oneRec("�糪", 209904,90,85,75));
		k44_datasArray.add(oneRec("��ȿ", 209905,80,75,85));
		k44_datasArray.add(oneRec("�̳�", 209906,90,85,55));
		k44_datasArray.add(oneRec("����", 209907,70,75,65));
		k44_datasArray.add(oneRec("ä��", 209908,100,75,95));
		k44_datasArray.add(oneRec("����", 209909,80,65,95));
		
		try {
			FileWriter k44_file = new FileWriter("C:\\Users\\501-01\\Desktop\\p18_p19.json");	//FileWriterŬ������ file�ν��Ͻ��� ����� ������ ���� ����� ������ ��θ� �������ش�.
			k44_file.write(k44_datasArray.toJSONString());	//datasArray�� JSON���Ͽ� �����ؾ��ϴ� JSONString���� Ÿ��ĳ���� ���ֱ�
			k44_file.flush();	//flush()�� ���ۿ� �ִ� ��� ������ ó���ض� ��� ����. �޸𸮿��� �۾��� ������ ����̽��� �о� �־��ֱ�
			k44_file.close();	//close�� �ݾ�����Ѵ�. ��� ���������� �������� �׸�ŭ�� �Ҵ緮�� �Ҹ��ϴ� ���̹Ƿ� ���߿� ���� ���� �� ����.
		} catch(IOException k44_e) { //��ǲ �ƿ�ǲ ����ó���� ������ ��Ƽ�
			k44_e.printStackTrace();	//���ܹ߻��� ����ϴ� �ڵ带 �����.
		}
		System.out.println("JSON ����� : "+k44_datasArray);	//JSON�� ���� ������ Ȯ���� �ֿܼ� ����Ѵ�.
		
	}

}