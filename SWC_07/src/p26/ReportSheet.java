package p26;

public class ReportSheet {

	public static void main(String[] args) {
		
		int k44_iPerson = 10;	//��� �� �����ϱ�
		
		k44_OneRec[] k44_inData = new k44_OneRec[k44_iPerson];	//�ν��Ͻ� �����͵��� ���� OneRec�ڷ����� �迭 inData�� �������ش�.

		k44_inData[0] = new k44_OneRec("ȫ��01",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));	//�ν��Ͻ��� �����ϸ鼭 ���� �־��ְ� �迭�� ��´�
		k44_inData[1] = new k44_OneRec("ȫ��02",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
		k44_inData[2] = new k44_OneRec("ȫ��03",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
		k44_inData[3] = new k44_OneRec("ȫ��04",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
		k44_inData[4] = new k44_OneRec("ȫ��05",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
		//�ش� ������ ���˿� �°� ����Ʈ�Ѵ�.
		System.out.printf("�̸� %s, ���� %d, ���� %d, ���� %d, ���� %d, ��� %.2f\n",k44_inData[0].k44_name(),k44_inData[0].k44_kor(),k44_inData[0].k44_eng(),k44_inData[0].k44_mat(),k44_inData[0].k44_sum(),k44_inData[0].k44_ave());	
		System.out.printf("�̸� %s, ���� %d, ���� %d, ���� %d, ���� %d, ��� %.2f\n",k44_inData[1].k44_name(),k44_inData[1].k44_kor(),k44_inData[1].k44_eng(),k44_inData[1].k44_mat(),k44_inData[1].k44_sum(),k44_inData[1].k44_ave());
		System.out.printf("�̸� %s, ���� %d, ���� %d, ���� %d, ���� %d, ��� %.2f\n",k44_inData[2].k44_name(),k44_inData[2].k44_kor(),k44_inData[2].k44_eng(),k44_inData[2].k44_mat(),k44_inData[2].k44_sum(),k44_inData[2].k44_ave());
		System.out.printf("�̸� %s, ���� %d, ���� %d, ���� %d, ���� %d, ��� %.2f\n",k44_inData[3].k44_name(),k44_inData[3].k44_kor(),k44_inData[3].k44_eng(),k44_inData[3].k44_mat(),k44_inData[3].k44_sum(),k44_inData[3].k44_ave());
		System.out.printf("�̸� %s, ���� %d, ���� %d, ���� %d, ���� %d, ��� %.2f\n",k44_inData[4].k44_name(),k44_inData[4].k44_kor(),k44_inData[4].k44_eng(),k44_inData[4].k44_mat(),k44_inData[4].k44_sum(),k44_inData[4].k44_ave());

		
	}

}