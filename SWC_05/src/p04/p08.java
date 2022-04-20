package p04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p08 {

	public static void main(String[] args) {
		DateFormat k44_dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); //import�� Ŭ���� DateFormat�� �ν��Ͻ�(dateFormat)�� �����ϰ�, ��������� �������ش�.
		Calendar k44_cal = Calendar.getInstance(); 	//Ķ���� Ŭ������ cal�ν��Ͻ��� Ķ���� Ŭ������ getInstance���� �������ش�.
		
		String k44_itemname1="ǻ��� �����ܿ븶��ũ(�ְ����)";	//������ �����۵��� �����͵��� �������ش�.
		String k44_itemcode1="1031615";
		int k44_price1 = 1;
		int k44_amount1 = 1;
		double k44_totPrice1 = k44_price1 * k44_amount1;	//�ش� ��� �������� �� ������ �ݾװ� ������ ���� ��.
		
		String k44_itemname2="�����̵�ĸ���(������)(100ȣ)";
		String k44_itemcode2="11008152";
		int k44_price2 = 1000;
		int k44_amount2 = 0;
		double k44_totPrice2 = k44_price2 * k44_amount2;
		
		String k44_itemname3="�������� ���׸�����ũ(�˷�̴�Ÿ��)";
		String k44_itemcode3="1020800";
		int k44_price3 = 1000;
		int k44_amount3 = 0;
		double k44_totPrice3 = k44_price3 * k44_amount3;
		
		double k44_totPriceAll = k44_totPrice1 + k44_totPrice2 + k44_totPrice3;	//������1,2,3�� �ݾ��� ��� ������ �հ踦 ������ ��
		
		int k44_tax;
		
		if (k44_totPriceAll/11 % 1 == 0) {	//��ü �հ踦 11���� 1�� �ΰ����̴�. �̶� �Ҽ����� ��Ÿ���ٸ�, �����հ踦 �����ؾ� �Ѵ�. �׷��� �ΰ����� 1�� �������� ����.
			k44_tax = (int)(k44_totPriceAll/11);
		} else {
			k44_tax = (int)(k44_totPriceAll/11)+1;	
		}
		
		int k44_noTaxPriceAll = (int)k44_totPriceAll - k44_tax;	//�����հ�� ��ü �Ǹ� �հ迡�� �ΰ����� �� ���̹Ƿ� ������ ���� �ۼ�.
		
		
		System.out.printf("%25s\n","\"���ΰ���, ���̼�\"");
		System.out.printf("%s\n","(��)�Ƽ����̼�_�д缭����");
		System.out.printf("%s\n","��ȭ:031-702-6016");
		System.out.printf("%s\n","����:���� ������ ���μ�ȯ�� 2748 (���)");
		System.out.printf("%s\n%s\n","����:��⵵ ������ �д籸 �д�� 53���� 11 (����","��");
		System.out.printf("================================================\n");
		System.out.printf("%27s\n","�Һ����߽ɰ濵(CCM) �������");
		System.out.printf("%29s\n","ISO 9001 ǰ���濵�ý��� �������");
		System.out.printf("================================================\n");
		System.out.printf("%29s\n","��ȯ/ȯ�� 14��(03��12��)�̳�,");
		System.out.printf("%s\n","(����)������, ����ī�� ���� �� ���Ը��忡�� ����");
		System.out.printf("%27s\n","����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�");
		System.out.printf("%27s\n","üũī�� ��� �� �ִ� 7�� �ҿ�");
		System.out.printf("================================================\n");
		System.out.printf("%s%35s\n","[POS 1058231]",k44_dateFormat.format(k44_cal.getTime()));
		System.out.printf("================================================\n");
		System.out.printf("%s%,9d%4d%,9d\n[%s]\n",p08.k44_substringByBytes(k44_itemname1, 0, 27),k44_price1, k44_amount1, k44_price1*k44_amount1,k44_itemcode1);	
		System.out.printf("%s%,9d%4d%,9d\n[%s]\n",p08.k44_substringByBytes(k44_itemname2, 0, 27),k44_price2, k44_amount2, k44_price2*k44_amount2,k44_itemcode2);
		System.out.printf("%s%,9d%4d%,9d\n[%s]\n",p08.k44_substringByBytes(k44_itemname3, 0, 27),k44_price3, k44_amount3, k44_price3*k44_amount3,k44_itemcode3);
		System.out.printf("%18s%,26d\n","�����հ�",k44_noTaxPriceAll);
		System.out.printf("%19s%,26d\n","�ΰ���",(int)k44_totPriceAll - k44_noTaxPriceAll);
		System.out.printf("------------------------------------------------\n");
		System.out.printf("%s%,40d\n","�Ǹ��հ�",(int)k44_totPriceAll);
		System.out.printf("================================================\n");
		System.out.printf("%s%,40d\n","�ſ�ī��",(int)k44_totPriceAll);
		System.out.printf("------------------------------------------------\n");
		System.out.printf("%s%40s\n","�츮ī��","538720**********");
		System.out.printf("%s%12s%18s%,6d\n","���ι�ȣ","77982843(0)","���αݾ�",(int)k44_totPriceAll);
		System.out.printf("================================================\n");
		System.out.printf("%28s%6s\n",k44_dateFormat.format(k44_cal.getTime()),"�д缭����");	//�ŷ� �Ͻô� Ķ���� Ŭ������ getTime() �޼ҵ带 �̿��Ͽ� �����ߴ� format�� ���� ����Ѵ�.
		System.out.printf("%s\n","��ǰ �� ��Ÿ ���� : 1522-4400");
		System.out.printf("%s\n","����� �� �����̼� ���� ���� : 1599-2211");
		System.out.printf("%36s\n","||||||||||||||||||||||||");
		System.out.printf("%36s\n","||||||||||||||||||||||||");
		System.out.printf("%32s\n","2112820610158231");
		System.out.printf("------------------------------------------------\n");
		System.out.printf("%28s\n%27s\n","�� ���̼� ����� �� �Ǵ� Ȩ�������� �����ϼż�","ȸ������ �� �پ��� ������ ����������! ��");
		
	}

	public static String k44_substringByBytes(String k44_str, int k44_beginBytes, int k44_endBytes) { //substringByBytes�Լ��� ������ endBytes�� ���� itemname�� ����� �� �ѱ� �߰��� ©���� �ʵ��� �Ѵ�.

		if (k44_str == null || k44_str.length() == 0) { // str������ null�̰ų� ���̰� 0�̸� �ƹ��͵� �ƴϹǷ� ""�� �����Ѵ�(����ó����).
			return "";
		}

		if (k44_beginBytes < 0) { // beginBytes�� ���� �����̸�, ������ 0���� �ٽ� �����ش�.
			k44_beginBytes = 0;
		}

		if (k44_endBytes < 1) { // ����Ʈ�� ���������� ����ϹǷ� endBytes�� 1���� ������ ""�� �����Ѵ�(����ó����).
			return "";
		}

		int k44_strLen = k44_str.length(); // �Է��� string�� ���̸� ������ ���� len�� ����.

		int k44_beginIndex = -1; // return�� substring�� beginIndex �Ķ����.
		int k44_endIndex = 0; // return�� substring�� endIndex �Ķ����.

		int k44_cutBytesSavelen = 0; // str�� �� byte�� ������, �� byte ũ����� ��� ������ cutBytesSavelen ���� ����.

		String k44_ch = null; //

		for (int k44_i = 0; k44_i < k44_strLen; k44_i++) { // �Է��� string�� ���̸�ŭ �� byteĭ���� ����, �����ϱ⸦ �ݺ�.
			k44_ch = k44_str.substring(k44_i, k44_i + 1); // ��ĭ���� ������ string�� ���� ch�� ����
			k44_cutBytesSavelen += k44_ch.getBytes().length; // ��ĭ���� ������ string�� byteũ�⸦ ���������� ����Ͽ� ������ ���� cutBytesSavelen�� ����.

			if (k44_beginIndex == -1 && k44_cutBytesSavelen >= k44_beginBytes) { // ���� beginIndex�� -1�̸鼭 beginBytes��
																		// cutBytesSavelen���� �۰ų� ������, beginIndex�� i��.
				k44_beginIndex = k44_i;
			}

			if (k44_cutBytesSavelen > k44_endBytes) { //�Լ� ������� �������ֱ�. ������ ����Ʈ ���� ������ ĭ ���� ������ �Լ��� ���������� �����.
				break;
			} else {
				k44_endIndex = k44_i + 1;
			}
		}

		return k44_str.substring(k44_beginIndex, k44_endIndex);
	}

}
