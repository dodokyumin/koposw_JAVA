package aaa;

	public class k44_EmartData { //���� ����� �����͵��� ������ ������ �°� ������� �迭�� �������ش�.
		String[] k44_itemname = { "����Ȩ SAFE365 �ڵ����", "(G)LH��������ȭ�� 10��ġ", "��������E", "���� ���Ϸ� �� ��", "����Ȩ SAFE �ڵ����",
				"��� �Ŷ��120g*5", "(��)����������", "���ѱ� ������� 156g", "GAP ������ 4-6��", "�� ����� �ٳ���(��)", "����ũ ź�θ� �߰���",
				"(����)����߰���(g)", "DZ�ִϾ�縻3��C_BK", "DZ�ִϾ�縻3��C_WH", "�����̾��������ʹ� 10pcs", "����� 110g", "����ũ ����̿���500g",
				"���� ���ִ¿���GT ������ 1L", "���������÷�10��", "��������(��)65g*6", "�ɶ�ý� ���� Ʈ��Ʈ��Ʈ", "Ǫ���� �̼��������", "���Ϸν���������500g",
				"CJ����Ĩ 20g", "����ũ ����̿���500g", "����� ���� ��ũƼ", "1+ ��޶� 10���� Ư", "������ݺ�����ġ��ȹ", "�ٳ��������� 4��", "��ī�ݶ� 500ml",
				"����� ���� ���� 1����", "������ݺ�����ġ��ȹ","ȫ�������� �ڵ����� ��1��" };
		int[] k44_price = { 7500, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980, 7130, 1350,
				3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980, 5400, 1980, 3480, 7980, 9990000 };
		int[] k44_amount = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 52 };
		boolean[] k44_taxfree = { false, false, false, false, false, false, true, false, true, true, false, false, false, false,
				false, false, false, true, false, false, false, false, false, false, false, false, true, false, false,
				false, true, false, false };
		int[] k44_sumPrice = new int[k44_itemname.length];	//�� �����ۺ��� �� ������ ���� �迭 ����. ũ��� �����۹迭�� ���̸�ŭ.
		static int k44_cutBytesSaveLength; //��ǰ�� ĭ�� ����

		public void k44_setSumPrice() { //�׸��� ������ŭ �ݺ��� ���� �ݾװ� ������ ���� �� ������ ������� �����ۺ� �� ���� �迭�� �������ش�.

			for (int k44_i = 0; k44_i < k44_itemname.length; k44_i++) {	//
				k44_sumPrice[k44_i] = k44_price[k44_i] * k44_amount[k44_i];
			}
		}

		public int k44_getTotPrice() {	//�հ踦 ���ϴ� �Լ�.
			int k44_totPrice = 0;	//�� �����ۺ� ���� �ݾ��� ���� totPrice������ �����ϰ� �����Ѵ�.
			k44_setSumPrice();
			for (int k44_i = 0; k44_i < k44_sumPrice.length; k44_i++) {
				k44_totPrice += k44_sumPrice[k44_i];
			}
			return k44_totPrice;
		}

		public int k44_sumTaxFreePrice() {	//�鼼 ǰ����� �� ������ ���ϴ� �Լ�
			int k44_totTaxFreePrice = 0;
			for (int k44_i = 0; k44_i < k44_itemname.length; k44_i++) {
				if (k44_taxfree[k44_i]) {	//�鼼 ���δ� boolean �ڷ����� �迭�̹Ƿ� �鼼�� true�� �� �ش� �������� ���űݾ��� �����ش�. �׸��� ����.
					k44_totTaxFreePrice += k44_price[k44_i] * k44_amount[k44_i];
				}
			}
			return k44_totTaxFreePrice;
		}

		public int k44_sumTaxPrice() {	//���� ǰ����� �� ������ ���ϴ� �Լ�
			int k44_totTaxPrice = 0;
			for (int k44_i = 0; k44_i < k44_itemname.length; k44_i++) {
				if (!k44_taxfree[k44_i]) {	//�鼼 ���δ� boolean �ڷ����� �迭�̹Ƿ� �鼼�� false�� ��,�� ������ �� �ش� �������� ���űݾ��� �����ش�. �׸��� ����.
					k44_totTaxPrice += k44_price[k44_i] * k44_amount[k44_i];
				}
			}
			return k44_totTaxPrice;
		}

		public int k44_getTotTax() {	//�ΰ����� �����ϴ� �Լ�
			int k44_totTax;
			k44_totTax = (int)(k44_sumTaxPrice()/ 1.1);	//�ΰ����� ������ǰ�� �� ���ݿ� 1.1�� ������ �Ҽ������� �������� int������ Ÿ��ĳ�����Ͽ� ������ �Ѵ�. 
				
			return k44_totTax;
		}
		
		public void k44_printItem() {	//�������� ��ǰ��, �ܰ�, ����, �ݾ׿� ���� ������� ����Ʈ���ִ� �Լ�.
			
			for (int k44_i = 0; k44_i < k44_itemname.length; k44_i++) {	//printItem�� Ƚ���� �������� �����̹Ƿ� ���� ������ itemname�迭�� ���̸�ŭ���� ������ �������ش�.
				if (k44_taxfree[k44_i]) {	//�鼼 ���θ� ������ taxfree �迭�� �ҷ��� �ش� �������� �鼼 ��ǰ�̸� * �� ����ϰ� �ƴϸ� �� ĭ��ŭ ������ �־��ش�.
					System.out.printf("* ");
				} else {
					System.out.printf("  ");
				}

				System.out.printf("%s%,10d%3d%,11d\n", k44_setBlank(k44_itemname[k44_i], 15), k44_price[k44_i], k44_amount[k44_i], k44_sumPrice[k44_i]); //�� ���θ��� ����� ��ǰ��(��ǰ���� ���ʺ��� ���Ƿ� ���� �Լ��� ����) �ܰ� ���� �ݾ��� printf�� �־��ش�.

				if (k44_i % 5 == 4) {
					System.out.printf("-----------------------------------------\n"); //�������� �������� ���� 5ĭ���� �� �߱�
				}
			}
		}

		public static String k44_setBlank(String k44_str, int k44_itemNameCellSize) { //��ǰ���� ����� ���� ĭ�� �����Ͽ� �ش� ��Ʈ �� ��ŭ ��ǰ���� �߶� ����ϴ� �Լ�. �ѱ� ���� ����.
			//itemNameCellSize�� ��ǰ���� ����� ĭ�� int�� �Ķ���ͷ� �޴´�.
			String k44_cutStr = ""; //��ǰ���� ������ �� ���� String ���� �����س���.

			// item ���ڿ��� ĭ�� ����Ͽ� charCount�� �����ϱ�.
			int k44_bitCount = 0; //�ѱ��� �ѱ��� �˻��ϸ� �ش� ������ ��Ʈ ��(ĭ ��)�� ����, ������ ���� ����. 
			int k44_i = 0; //�̶�! i�� �̸� ���־� for�� ���� ���� �� ������ i���� for�� �ۿ����� ��밡���ϰ� ������� �� �ֵ��� �ϴ°� Ű����Ʈ����!!
			for (; k44_i < k44_str.length() && k44_bitCount < k44_itemNameCellSize;) { //��ǰ�� ���̸�ŭ iteration�ϸ�, �߶������ϴ� ��Ʈ ���� itemNameCellSize���� ���� �� �������� �����Ѵ�.
				//!!�̶� i��° ���ڰ� �ѱ��̸� 2�� �������Ƿ� itemNameCellSize���� 1�� �� ū bitCount�� ������ �� ����!!
				if (k44_str.substring(k44_i, k44_i + 1).getBytes().length == 2) { // str�� i��° ���ڰ� �ѱ��̸� 2bit ���ϱ�
					k44_bitCount += 2;
				} else if (k44_str.substring(k44_i, k44_i + 1).getBytes().length == 1) { // str�� i��° ���ڰ� ����� 1bit ���ϱ�
					k44_bitCount += 1;
				}
				
				k44_i++;

			}
			
			// str�� �� bit ���� ������ ĭ�� �������. �� i��° ���ڰ� �ѱ��̿��� ��for������ bitCount�� 2�� �߰��� ������ ������ ��찡 �ִ�.
			if (k44_bitCount > k44_itemNameCellSize) {
				// �׷� i�� �ش��ϴ� ���ڰ� 2��Ʈ¥�� �����̳�?
				if (k44_str.substring(k44_i-1,k44_i).getBytes().length == 2) {
					k44_cutStr = k44_str.substring(0, k44_i-1) + " "; //�ش� i��° ���ڸ� �߰��� �ڸ��� ���ڰ� ������ ������ �ٷ� �� i-1��° ���ڱ����� ����ϰ�, ��� 1��Ʈ��ŭ ����" "���ϱ�.
				//��Ʈ ī��Ʈ�� ������ itemNameCellSize�� ����?
				} else {
					k44_cutStr = k44_str.substring(0, k44_i); //�׷��� �ݺ��ߴ� i���� ��ŭ�� ���ڸ� substring���� �߶� ����ϱ⸸ �ϸ� �ȴ�.

				}
			} else {
				
			//str�� �� bit ���� ������ ĭ�� �������� ���str�� ������ ĭ ���ڱ��� ����ä��� ex)��� �Ŷ��120g*5
				int k44_addBlankLen = k44_itemNameCellSize - k44_bitCount; //�߰��� ������ ���� ������ ��ǰ�� ĭ ������ �ش� ��ǰ���� ��Ʈ ī��Ʈ�� �� ������ �����Ѵ�.
				k44_cutStr = k44_str.substring(0,k44_i); //������ cutStr�Լ��� �ش� ��ǰ���� i��������ŭ �����Ѵ�.

				while (k44_addBlankLen > 0) {	//�׸��� ������ cutStr�Լ��� addBlankLen ���̸�ŭ +" " ���ش�.
					
					k44_cutStr += " ";
					
					k44_addBlankLen--;
				}
			
			}

			return k44_cutStr; //�� ��ǰ���� ���� ������ cutStr�� �����Ѵ�.
		}

}
