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
		// �Ľ��� ���� �غ� //throws�� try catch�� ���� �������� ���� �ͼ��� �߻��ϸ� ���� ������
		DocumentBuilder k44_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// DocumentBuilderŬ������ �ν��Ͻ� docBuilder�� �����. 
		Document k44_doc = k44_docBuilder.parse(new File("C:\\Users\\501-01\\Desktop\\Ʈ���̽�_����ǥ.xml"));
		//xml ������ ó�� PC�ȿ� �־ ��ü��θ� ����, xml�Ľ�ó�� ����
		
		Element k44_root = k44_doc.getDocumentElement();	//root�±׸� ������ ���⵵ ������ ������ ���̴� ���� ����
		
	
		NodeList tag_name = k44_doc.getElementsByTagName("name");	//node�� ��ǥ��. �ش� ����Ʈ�� tag_tagname�� �����Ͽ� ������Ʈ�� getElementByTagName���� �����´�.
		NodeList tag_studentid = k44_doc.getElementsByTagName("studentid");
		NodeList tag_kor = k44_doc.getElementsByTagName("kor");
		NodeList tag_eng = k44_doc.getElementsByTagName("eng");
		NodeList tag_mat = k44_doc.getElementsByTagName("mat");
		
		System.out.println("********************************************\n");
		for(int k44_i=0; k44_i<tag_name.getLength(); k44_i++) {	//node�� ��ǥ��. �ش� ����Ʈ�� tag_tagname�� ���̸�ŭ �ݺ��ϸ� ������� ����Ÿ�� ����Ѵ�.
			System.out.printf("�̸� : %s\n",tag_name.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("�й� : %s\n",tag_studentid.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n",tag_kor.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n",tag_eng.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n",tag_mat.item(k44_i).getFirstChild().getNodeValue());

			System.out.println("********************************************\n");
		}
	}

}