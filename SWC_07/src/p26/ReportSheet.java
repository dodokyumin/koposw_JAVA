package p26;

public class ReportSheet {

	public static void main(String[] args) {
		
		int k44_iPerson = 10;	//��� �� �����ϱ�
		
		OneRec[] inData = new OneRec[k44_iPerson];	//�ν��Ͻ� �����͵��� ���� OneRec�ڷ����� �迭 inData�� �������ش�.

		inData[0] = new OneRec("ȫ��01",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));	//�ν��Ͻ��� �����ϸ鼭 ���� �־��ְ� �迭�� ��´�
		inData[1] = new OneRec("ȫ��02",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
		inData[2] = new OneRec("ȫ��03",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
		inData[3] = new OneRec("ȫ��04",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
		inData[4] = new OneRec("ȫ��05",(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
		
		System.out.printf("�̸� %s, ���� %d, ���� %d, ���� %d, ���� %d, ��� %.2f\n",inData[0].name(),inData[0].kor(),inData[0].eng(),inData[0].mat(),inData[0].sum(),inData[0].ave());	//�ش� ������ ���˿� �°� ����Ʈ�Ѵ�.
		System.out.printf("�̸� %s, ���� %d, ���� %d, ���� %d, ���� %d, ��� %.2f\n",inData[1].name(),inData[1].kor(),inData[1].eng(),inData[1].mat(),inData[1].sum(),inData[1].ave());
		System.out.printf("�̸� %s, ���� %d, ���� %d, ���� %d, ���� %d, ��� %.2f\n",inData[2].name(),inData[2].kor(),inData[2].eng(),inData[2].mat(),inData[2].sum(),inData[2].ave());
		System.out.printf("�̸� %s, ���� %d, ���� %d, ���� %d, ���� %d, ��� %.2f\n",inData[3].name(),inData[3].kor(),inData[3].eng(),inData[3].mat(),inData[3].sum(),inData[3].ave());
		System.out.printf("�̸� %s, ���� %d, ���� %d, ���� %d, ���� %d, ��� %.2f\n",inData[4].name(),inData[4].kor(),inData[4].eng(),inData[4].mat(),inData[4].sum(),inData[4].ave());

		
	}

}