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
		Document k44_doc = k44_docBuilder.parse(new File("C:\\Users\\501-01\\Desktop\\weather.json"));// DocumentBuilderŬ������ doc�ν��Ͻ��� �����, �ش� ����� ������ �Ľ��Ͽ� doc �ν��Ͻ��� �����Ѵ�.
		
		Element k44_root = k44_doc.getDocumentElement();	//root�±׸� ������ ���⵵ ������ ������ ���̴� ���� ����
		
		// json������ ���������� html�� ����ϰ� �±� ������ ���� ����Ʈ ������ �����Ѵ�. �׸��Ͽ� �ش� �±׾��� ������ �ٲ��ָ� �ش� �±��� ������� �Ľ��ؿ���� �Ѵ�!

		NodeList k44_tm = k44_doc.getElementsByTagName("tm"); // �� ��ȣ �ȿ� �±� �� String������ �������־� ����� �� �ִ� NodeList������ ������ �����Ѵ�.
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
		
		System.out.printf("���� ��¥               : %s\n", k44_tm.item(0).getFirstChild().getNodeValue());//��� �±��� �θ��±� <tm>��(��帮��Ʈ�����̴� ù��°�� 0)�� �ҷ�����, ù��° �ڽ��±��� ���� �����´�!
		System.out.printf("�浵(x��)               : %s\n", k44_x.item(0).getFirstChild().getNodeValue());//x���� y���� �����ϰ� �ҷ�����.
		System.out.printf("����(y��)               : %s\n", k44_y.item(0).getFirstChild().getNodeValue());
		System.out.println("=====================================================");

		for (int k44_i = 0; k44_i < k44_hour.getLength(); k44_i++) {//hour�ð��� ������ �׸��� ������Ʈ �Ǳ� ������ �׸�ŭ ����i�� �ݺ������־� ������Ʈ ��θ� ����Ѵ�.
			
			System.out.printf("�ð�                    : %s��\n", k44_hour.item(k44_i).getFirstChild().getNodeValue());	//�ش� �����ʹ� n��° �������� ù��° �Ƶ��±��� ��尪���� ����Ǿ� �ֱ� ������!
			System.out.printf("���ñ���(0)n�� ��       : %s\n", k44_day.item(k44_i).getFirstChild().getNodeValue()); //3�ϵ� ���� �����ϱ� ������
			System.out.printf("���� �ð� �µ�          : %s��\n", k44_temp.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("�ְ� ���               : %s��\n", k44_tmx.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("���� ���               : %s\n", k44_tmn.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("���� ����(1~4)          : %s\n", k44_sky.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("���� ����(���� 0~4)   : %s\n", k44_pty.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("�ѱ��� ����             : %s\n", k44_wfKor.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("���� ����               : %s\n", k44_wfEn.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("���� Ȯ��               : %s\n�ۼ�Ʈ", k44_pop.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("12�ð� ���� ������      : %smm\n", k44_r12.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("12�ð� ���� ������      : %smm\n", k44_s12.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("ǳ��                    : %s m/s\n", k44_ws.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("ǳ�� (�ϵ����� 0~7)     : %s\n", k44_wd.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("ǳ�� �ѱ���             : %s\n", k44_wdKor.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("ǳ�� ����               : %s\n", k44_wdEn.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("����                    : %s\n", k44_reh.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("6�ð� ������            : %smm\n", k44_r06.item(k44_i).getFirstChild().getNodeValue());
			System.out.printf("6�ð� ������            : %smm\n", k44_s06.item(k44_i).getFirstChild().getNodeValue());
			System.out.println("=====================================================");
		}

	}
}
