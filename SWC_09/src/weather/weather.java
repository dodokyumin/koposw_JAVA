package weather;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class weather {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		DocumentBuilder k44_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document k44_doc = k44_docBuilder.parse(new File("C:\\Users\\501-01\\Desktop\\weather.json"));// DocumentBuilder클래스의 doc인스턴스를 만들고, 해당 경로의 파일을 파싱하여 doc 인스턴스에 저장한다.
		
		Element k44_root = k44_doc.getDocumentElement();	//root태그를 가지고 오기도 하지만 지금은 쓰이는 곳이 없음
		
		// json파일의 내용을보면 html과 비슷하게 태그 네임을 통해 리스트 제목을 구분한다. 그리하여 해당 태그안의 내용을 바꿔주며 해당 태그의 내용들을 파싱해오기로 한다!

		NodeList k44_tm = k44_doc.getElementsByTagName("tm"); // 각 괄호 안에 태그 속 String값들을 설정해주어 사용할 수 있는 NodeList형태의 변수로 저장한다.
		NodeList k44_ts = k44_doc.getElementsByTagName("ts");
		NodeList k44_x = k44_doc.getElementsByTagName("x");
		NodeList k44_y = k44_doc.getElementsByTagName("y");
		NodeList k44_hour = k44_doc.getElementsByTagName("hour");
		NodeList k44_day = k44_doc.getElementsByTagName("day");
		NodeList k44_temp = k44_doc.getElementsByTagName("temp");
		NodeList k44_tmx = k44_doc.getElementsByTagName("tmx");
		NodeList k44_tmn = k44_doc.getElementsByTagName("tmn");
		NodeList k44_sky = k44_doc.getElementsByTagName("sky");
		NodeList k44_pty = k44_doc.getElementsByTagName("pty");
		NodeList k44_wfKor = k44_doc.getElementsByTagName("wfKor");
		NodeList k44_wfEn = k44_doc.getElementsByTagName("wfEn");
		NodeList k44_pop = k44_doc.getElementsByTagName("pop");
		NodeList k44_r12 = k44_doc.getElementsByTagName("r12");
		NodeList k44_s12 = k44_doc.getElementsByTagName("s12");
		NodeList k44_ws = k44_doc.getElementsByTagName("ws");
		NodeList k44_wd = k44_doc.getElementsByTagName("wd");
		NodeList k44_wdKor = k44_doc.getElementsByTagName("wdKor");
		NodeList k44_wdEn = k44_doc.getElementsByTagName("wdEn");
		NodeList k44_reh = k44_doc.getElementsByTagName("reh");
		NodeList k44_r06 = k44_doc.getElementsByTagName("r06");
		NodeList k44_s06 = k44_doc.getElementsByTagName("s06");
		
		System.out.printf("예보 날짜               : %s\n", k44_tm.item(0).getFirstChild().getNodeValue());//모든 태그의 부모태그 <tm>을(노드리스트형식이니 첫번째는 0)을 불러오고, 첫번째 자식태그의 값을 가져온다!
		System.out.printf("경도(x값)               : %s\n", k44_x.item(0).getFirstChild().getNodeValue());//x값과 y값도 동일하게 불러오기.
		System.out.printf("위도(y값)               : %s\n", k44_y.item(0).getFirstChild().getNodeValue());
		System.out.println("=====================================================");

		for (int k44_i = 0; k44_i < k44_hour.getLength(); k44_i++) {//hour시간의 단위로 항목이 업데이트 되기 때문에 그만큼 변수i를 반복돌려주어 업데이트 모두를 출력한다.
			
			System.out.printf("시간                    : %s시\n", k44_hour.item(k44_i).getFirstChild().getNodeValue());	//해당 데이터는 n번째 아이템의 첫번째 아들태그의 노드값으로 저장되어 있기 때문에!
			System.out.printf("오늘기준(0)n일 후       : %s\n", k44_day.item(k44_i).getFirstChild().getNodeValue()); //3일뒤 까지 예보하기 때문에
			System.out.printf("현재 시간 온도          : %s℃\n", k44_temp.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("최고 기온               : %s℃\n", k44_tmx.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("최저 기온               : %s\n", k44_tmn.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("구름 정도(1~4)          : %s\n", k44_sky.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("강수 정도(무비눈 0~4)   : %s\n", k44_pty.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("한국어 날씨             : %s\n", k44_wfKor.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("영어 날씨               : %s\n", k44_wfEn.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("강수 확률               : %s\n퍼센트", k44_pop.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("12시간 예상 강수량      : %smm\n", k44_r12.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("12시간 예상 적설량      : %smm\n", k44_s12.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("풍속                    : %s m/s\n", k44_ws.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("풍향 (북동남서 0~7)     : %s\n", k44_wd.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("풍향 한국어             : %s\n", k44_wdKor.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("풍향 영어               : %s\n", k44_wdEn.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("습도                    : %s\n", k44_reh.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("6시간 강수량            : %smm\n", k44_r06.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("6시간 적설량            : %smm\n", k44_s06.item(k44_i).getFirstChild().getNodeValue());
			System.out.println("=====================================================");
		}

	}
}
