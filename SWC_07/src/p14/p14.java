package p14;

public class p14 {

	public static void main(String[] args) {
		String[] k44_OneRec = {
				"����,`04 �ݾ�,`05 �ݾ�,`06 �ݾ�,`07 �ݾ�,`08 �ݾ�,`09 �ݾ�,`10 �ݾ�,`11 �ݾ�,`12 �ݾ�,`13 �ݾ�,`14 �ݾ�,`15 �ݾ�,`16 �ݾ�,`17 �ݾ�,`18 �ݾ�,`19 �ݾ�,`20 1Q �ݾ�",
				"������ű�� ����,56,310,328,751,689,974,1580,1240,1644,2285,1462,1009,712,964,1160,1092,327",
				"������ű�� ����,15,61,220,344,262,505,958,698,915,1171,1534,3668,3109,3568,5174,8094,1385",
				"���� ��� ���,45,94,293,1038,551,1536,1977,2752,1753,1633,1113,1364,1641,1403,2011,1660,250",
				"ȭ�� ����,4,12,66,390,716,751,840,727,1286,475,656,1194,1261,811,1059,906,292",
				"���̿� �Ƿ�,0,0,168,239,308,552,899,858,760,1191,2584,3004,3686,3240,5771,7677,1879",
				"���� ���� ����,0,272,234,467,867,1073,1527,2207,2364,2345,2309,2383,2230,2159,2236,2522,300",
				"����,0,15,117,488,229,561,647,1024,756,899,1331,1514,1165,1149,1201,891,193",
				"���� ����,0,23,86,557,401,723,539,632,690,652,1770,2426,2183,3553,3998,5495,879",
				"��Ÿ,0,37,47,416,193,344,571,470,311,379,539,1479,1448,1089,1779,2543,400",
				"�հ�,120,824,1559,4690,4216,7019,9538,10608,10479,11030,13298,18041,17435,17936,24389,30880,5905"

		};

		String[] k44_field_name = k44_OneRec[0].split(","); //onerec array�� ù ���� ��, �ʵ� �׸���� ,�������� ���� ���� �ʵ� name�迭�� �����Ѵ�.
		for (int k44_i = 1; k44_i < k44_OneRec.length; k44_i++) {	//onerec ������ŭ �ݺ��� ���µ�, ���۰��� 1�� �����Ͽ� �ʵ��׸� ������ ������� �����´�.
			String[] k44_field = k44_OneRec[k44_i].split(","); //�� ���ε��� ,�������� substring�Ͽ� �迭�� �ִ´�.
			System.out.printf(" %s : %s\n", k44_field_name[0], k44_field[0]); //�ʵ� �׸��� �� ���� ���
			for (int k44_j = 3; k44_j < k44_field_name.length; k44_j++) { //������ ������ ������ ���� ����ϱ�.
				System.out.printf(" %s : %s\n", k44_field_name[k44_j], k44_numberRead(k44_field[k44_j]));
			}
			System.out.println("=============================="); //���м� ���
		}

	}

	public static String k44_numberRead(String k44_text) {
		String[] k44_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" }; // ���ڿ� �迭 units ���� �� �ʱ�ȭ
		String[] k44_unitX = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" }; // ���ڿ� �迭 unitX ���� �� �ʱ�ȭ
		String k44_sNumVoice = "";
		int k44_i = 0; // ���� i�� 0���� �ʱ�ȭ
		int k44_j = k44_text.length() - 1; // ���� j�� sNumVal�� ���� - 1�� �ʱ�ȭ > �迭�� 0��°���� �����ϱ� ����

		while (true) { // ���� �ݺ���
			if (k44_i >= k44_text.length()) // ���� i�� sNumVal.length()���� ���ų� Ŭ ��
				break; // �ݺ����� �ߴ��ϰ� �������� �Ѿ��

			if (k44_text.substring(k44_i, k44_i + 1).equals("0")) { // sNumVal�� i���� i+1��ŭ �ڸ� ���� 0�� �� (if��) (.equals > ���ڿ� ���� �� �� Ȯ�ν� ���)
				if (k44_text.length() <= 8) {
					k44_sNumVoice = k44_sNumVoice // sNumVoice�� sNumVoice +
							+ k44_units[Integer.parseInt(k44_text.substring(k44_i, k44_i + 1))] // sNumVal�� i���� i+1��ū �ڸ� ���ڿ��� ������ ��ȯ ��(Integer.parseInt()Ȱ��)
							+ k44_unitX[k44_j]; // + unitX[j]�� �����Ѵ� // String �迭 units�� ��ġ�� �ִ� ���ڸ� ���
				} else {
					if (k44_text.substring(k44_text.length() - 8, k44_text.length() - 4).equals("0000") 
							&& k44_unitX[k44_j].equals("��")) { // sNumVal�� ����-8 ���� sNumVal�� ����-4������ sNumVal���� �ڸ��� �װ��� 0000�̰� �迭 unitX[j] �� "��"�̸� �ƹ� �͵� ���� �ʴ´�.
					} else if (k44_unitX[k44_j].equals("��") || k44_unitX[k44_j].equals("��")) { // ���� ������ false�̰�unitX[j]�� "��" �Ǵ� "��"�̸� (||�� �Ǵ� �ǹ�)
						k44_sNumVoice = k44_sNumVoice + "" + k44_unitX[k44_j]; // sNumVoice�� sNumVoice + "" + unitX[j]�� ����
					}
				}

			} else { // sNumVal�� i���� i+1��ŭ �ڸ� ���� 0�� �ƴϸ�
				k44_sNumVoice = k44_sNumVoice // sNumVoice�� sNumVoice +
						+ k44_units[Integer.parseInt(k44_text.substring(k44_i, k44_i + 1))] // sNumVal�� i���� i+1��ū �ڸ� ���ڿ��� ������ ��ȯ ��(Integer.parseInt()Ȱ��)
						+ k44_unitX[k44_j]; // + unitX[j]�� �����Ѵ� // String �迭 units�� ��ġ�� �ִ� ���ڸ� ���
			}
			k44_i++; // ���� i�� 1��ŭ ����
			k44_j--; // ���� j�� 1��ŭ ����
		}
		return k44_sNumVoice;
	}

}