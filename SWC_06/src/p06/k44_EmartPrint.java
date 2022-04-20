package p06;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class k44_EmartPrint extends k44_EmartData {	//����Ʈ�ϱ� ���� �ʿ��� �����͵��� EmartDataŬ�����κ��� ��ӹ޾� (�� EmartData�� �θ� Ŭ����) �Լ����� �ʿ��� ���� �־��ֱ� ���� extends���ش�.
	DateFormat k44_dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");  //import�� Ŭ���� DateFormat�� �ν��Ͻ�(dateFormat)�� �����ϰ�, ��������� �������ش�.
	Calendar k44_cal = Calendar.getInstance(); 	//Ķ���� Ŭ������ cal�ν��Ͻ��� Ķ���� Ŭ������ getInstance���� �������ش�.
	DateFormat k44_dateFormat2 = new SimpleDateFormat("yyyyMMdd");  //import�� Ŭ���� DateFormat�� �ν��Ͻ�(dateFormat2)�� �����ϰ�, �������2�� ���� �������ش�.
	Calendar k44_cal2 = Calendar.getInstance(); //Ķ���� Ŭ������ cal2�ν��Ͻ��� Ķ���� Ŭ������ getInstance���� �������ش�.
	
public void k44_head() { //������ ��� ���� �� head�κ��� ����Ʈ�ϴ� �ڵ���� ��� head�Լ��� �ٷ�� ���� �����Ͽ���.
	
	System.out.printf("%35s\n","�̸�Ʈ ������ (031)888-1234");
	System.out.printf("%30s\n","286-86-50913 ȫ�Թ�");
	System.out.printf("%29s\n\n","���� ������ ������� 552");
	System.out.printf("%s\n","������ �������� ��ȯ/ȯ�� �Ұ�");
	System.out.printf("%s\n","�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
	System.out.printf("%s\n","���Ϻ� �귣����� ����(���� ����������)");
	System.out.printf("%s\n\n","��ȯ/ȯ�� ���������� ����(����ī�� ����)");
	System.out.printf("[%s]%s%15s\n","�� ��",k44_dateFormat.format(k44_cal.getTime()),"POS:0011-9861");
	System.out.printf("-----------------------------------------\n");
	System.out.printf("%9s%13s%3s%7s\n","�� ǰ ��","�� ��","����","�� ��");
	System.out.printf("-----------------------------------------\n");
}




public void k44_tail() {	//������ ��� ���� �Ʒ� �κ��� ����Ʈ�ϴ� �ڵ���� ��� tail�Լ��� �ٷ�� ���� �����Ͽ���.
	
	System.out.printf("\n%20s%16d\n","��ǰ�����", k44_itemname.length);	//�� ǰ�� ������ �������� ������ itemname �迭�� ���̸� ���Ѵ�. itemname�� ���� �߰��Ǹ� �������ְ� �ٲ��ֱ� ����.
	System.out.printf("%21s%,16d\n","(*)�鼼  ��ǰ", k44_sumTaxFreePrice());	//�鼼 ��ǰ���� ���ϴ� sumTaxFreePrice�Լ��� ȣ���� ���ϰ��� �־��ش�. %�ڿ� ","�� �ٿ��ָ� �˾Ƽ� ���ڸ������� ,�� ����ش�.
	System.out.printf("%21s%,16d\n","����  ��ǰ", k44_getTotTax());	//�� ������ǰ���� �ݾ� ���ϴ� getTotTax�Լ��� ȣ���� ���ϰ��� �־��ش�.
	System.out.printf("%22s%,16d\n","��  ��  ��",k44_sumTaxPrice()-k44_getTotTax()); //�ΰ����� ������ǰ �ݾ׵��� ���տ��� ��ü �ΰ����� �����̹Ƿ�.
	System.out.printf("%23s%,16d\n","��      ��", k44_getTotPrice());	//��ü �ݾ��� ���Ϲ޴� �Լ� getTotPrice�� �־��ش�.
	System.out.printf("%s%,24d\n","�� �� �� �� �� ��", k44_getTotPrice());	// ǥ�� ���� ���� ��� �ݾ��� �հ�� ����.
	System.out.printf("-----------------------------------------\n"); //�ٱ߱�
	System.out.printf("%s%28s\n","0012 KEB �ϳ�", "541907**0484/35860658");
	System.out.printf("%s%15s%,11d\n","ī�����(IC)", "�Ͻú� / ",k44_getTotPrice()); //�Ͻúҷ� �ݾ��� �� �հ�� ����
	System.out.printf("-----------------------------------------\n");
	System.out.printf("%22s\n","[�ż�������Ʈ ����]");
	System.out.printf("%s\n","ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
	System.out.printf("%s%19s%,8d\n","��ȸ�߻�����Ʈ","9350**9995",k44_getTotPrice()/1000); //����Ʈ�� ��ü �հ��� 0.001�ۼ�Ʈ�̴�.
	System.out.printf("%s%,16d(%,7d)\n","����(����)����Ʈ",k44_getTotPrice()/1000,k44_getTotPrice()/1000);	//���� ó�� ������ ����Ʈ�� ������.
	System.out.printf("%s\n","*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");
	System.out.printf("-----------------------------------------\n");
	System.out.printf("%22s\n","���űݾױ��� ���������ð� �ڵ��ο�");
	System.out.printf("%s%30s\n","������ȣ :", "34��****");
	System.out.printf("%s%31s\n","�����ð� :", k44_dateFormat.format(k44_cal.getTime())); //�����ð��� Ķ���� Ŭ������ getTime() �޼ҵ带 �̿��Ͽ� �����ߴ� format�� ���� ����Ѵ�.
	System.out.printf("-----------------------------------------\n");
	System.out.printf("%s%25d\n","ĳ��:084599 ȫOO", 1150);
	System.out.printf("%38s\n","||||||||||||||||||||||||||||||||||");
	System.out.printf("%15s%s\n",k44_dateFormat2.format(k44_cal2.getTime()),"/00119861/00164980/31"); //���ڵ���½ð��� Ķ���� Ŭ������ getTime() �޼ҵ带 �̿��Ͽ� �����ߴ� format�� ���� ����Ѵ�.
}

}
