package p09;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Element;

public class p09 {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		// 파싱을 위한 준비 //throws는 try catch와 같은 느낌으로 에러 익셉션 발생하면 위로 던지기
		DocumentBuilder k44_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// DocumentBuilder클래스의 인스턴스 docBuilder를 만든다. 
		Document k44_doc = k44_docBuilder.parse(new File("C:\\Users\\501-01\\Desktop\\트와이스_점수표.xml"));
		//xml 파일을 처리 PC안에 있어서 전체경로를 지정, xml파싱처리 시작
		
		Element k44_root = k44_doc.getDocumentElement();	//root태그를 가지고 오기도 하지만 지금은 쓰이는 곳이 없음
		
	
		NodeList tag_name = k44_doc.getElementsByTagName("name");	//node는 좌표값. 해당 리스트의 tag_tagname에 접근하여 엘리멘트를 getElementByTagName으로 가져온다.
		NodeList tag_studentid = k44_doc.getElementsByTagName("studentid");
		NodeList tag_kor = k44_doc.getElementsByTagName("kor");
		NodeList tag_eng = k44_doc.getElementsByTagName("eng");
		NodeList tag_mat = k44_doc.getElementsByTagName("mat");
		
		System.out.println("********************************************\n");
		for(int k44_i=0; k44_i<tag_name.getLength(); k44_i++) {	//node는 좌표값. 해당 리스트의 tag_tagname의 길이만큼 반복하며 멤버들의 데이타를 출력한다.
			System.out.printf("이름 : %s\n",tag_name.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("학번 : %s\n",tag_studentid.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("국어 : %s\n",tag_kor.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("영어 : %s\n",tag_eng.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("수학 : %s\n",tag_mat.item(k44_i).getFirstChild().getNodeValue());

			System.out.println("********************************************\n");
		}
	}

}