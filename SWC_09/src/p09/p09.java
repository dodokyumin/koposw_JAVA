package p09;

import java.io.File;
import java.io.IOException;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class p09 {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		// 파싱을 위한 준비
		DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		
		Document doc = docBuilder.parse(new File("C:\\Users\\501-01\\Desktop\\트와이스_점수표.xml"));

		Element root = doc.getDocumentElement();
		
	
		NodeList tag_name = doc.getElementsByTagName("name");
		NodeList tag_studentid = doc.getElementsByTagName("studentid");
		NodeList tag_kor = doc.getElementsByTagName("kor");
		NodeList tag_eng = doc.getElementsByTagName("eng");
		NodeList tag_mat = doc.getElementsByTagName("mat");
		
		System.out.println("********************************************\n");
		for(int i=0; i<tag_name.getLength(); i++) {
			System.out.printf("이름 : %s\n",tag_name.item(i).getFirstChild().getNodeValue());
			System.out.printf("학번 : %s\n",tag_studentid.item(i).getFirstChild().getNodeValue());
			System.out.printf("국어 : %s\n",tag_kor.item(i).getFirstChild().getNodeValue());
			System.out.printf("영어 : %s\n",tag_eng.item(i).getFirstChild().getNodeValue());
			System.out.printf("수학 : %s\n",tag_mat.item(i).getFirstChild().getNodeValue());

			System.out.println("********************************************\n");
		}
	}

}
