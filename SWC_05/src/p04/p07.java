package p04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class p07 {

	public static void main(String[] args) {
		DateFormat k44_dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 	//import�� Ŭ���� DateFormat�� �ν��Ͻ�(dateFormat)�� �����ϰ�, ��������� �������ش�. 
		Calendar k44_cal = Calendar.getInstance(); 	//Ķ���� Ŭ������ cal�ν��Ͻ��� Ķ���� Ŭ������ getInstance���� �������ش�.

		int k44_iPrice = 1; //iPrice�� �ݾ�(���ް���) + �ΰ����� ���� �հ�.
		
		double k44_valueOfSupply = k44_iPrice*10/11;	// = �ݾ� = ���ް����� �հ��� 11���� 10.

		int k44_tax = k44_iPrice - (int)k44_valueOfSupply;  //�ΰ����� �հ� - ���ް���. ���ް����� int�� �ٲ��ָ鼭 �Ҽ��� �Ʒ� �ڸ������� �����Ѵ�. �հ谡 1���� �� �ݾ��� �ƴ� �ΰ���1�� �޾ƾ��Ѵ�.
		
		
		System.out.printf("�ſ����\n");
		System.out.printf("�ܸ��� : %s %15s : %s\n","2N68665898","��ǥ��ȣ","041218");
		System.out.printf("������ : %s\n","�Ѿ��ġ�");
		System.out.printf("��  �� : %s\n%s\n","��� ������ �д籸 Ȳ�����351���� 10 ,", "1��");
		System.out.printf("��ǥ�� : %s\n","��â��");
		System.out.printf("����� : %s%19s %d\n","752-53-00558","TEL : ",7055695);
		System.out.printf("------------------------------------------------\n");
		
		System.out.printf("��  ��%,39d%2s\n",(int)k44_valueOfSupply,"��"); //valueOfSupply�� double������ int�� Ÿ��ĳ���� �Ͽ� �����ϴ� ������ ���ľ� �ϹǷ� double���� int�� �ٲ��ش�.
		System.out.printf("�ΰ���%,39d%2s\n",k44_tax,"��");
		System.out.printf("��  ��%,39d%2s\n",k44_iPrice,"��");	//�հ�� ���ް��װ� �ΰ����� ���� �ݾ�.
		
		System.out.printf("------------------------------------------------\n");
		System.out.printf("�츮ī��\n");
		System.out.printf("ī���ȣ : %s%12s\n","5387-20**-****-4613(S)","�Ͻú�");
		System.out.printf("�ŷ��Ͻ� : %s\n",k44_dateFormat.format(k44_cal.getTime())); //�ŷ� �Ͻô� Ķ���� Ŭ������ getTime() �޼ҵ带 �̿��Ͽ� �����ߴ� format�� ���� ����Ѵ�.
		System.out.printf("���ι�ȣ : %d\n",70404427);
		System.out.printf("�ŷ���ȣ : %s\n","357734873739");
		System.out.printf("���� : %s%10s%d\n","��ī���","���� : ",720068568);
		System.out.printf("�˸� : %s\n","EDC����ǥ");
		System.out.printf("���� : %s\n","TEL)1544-4700");
		System.out.printf("------------------------------------------------\n");
		System.out.printf("%26s\n","* �����մϴ� *");
		System.out.printf("%46s\n","ǥ��V2.08_20220418");
	}

}
