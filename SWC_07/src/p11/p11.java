package p11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p11 {

	public static void main(String[] args) {
		String[] OneRec = { 
				"01   ����Ȩ SAFE365          7,500        2        15,000",
				"02   (G)LH��������ȭ         6,900        1         6,900",
				"03   ��������E               5,980        1         5,980",
				"04   ���� ���Ϸ�           3,300        1         3,300",
				"05   ����Ȩ SAFE ��          5,500        2        11,000",
				"06   ��� �Ŷ��120g         3,380        1         3,380",
				"07*    (��)��������        6,610        1         6,610",
				"08   ���ѱ� �������         2,750        1         2,750",
				"09*    GAP ������ 4-      10,800        1        10,800",
				"10   ��ī�ݶ� 500ml          1,980        1         1,980",
				"11*    �� ����� �ٳ�        4,980        1         4,980",
				"12   ����ũ ź�θ�           2,480        1         2,480",
				"13   (����)����߰�          7,920        1         7,920",
				"14   DZ�ִϾ�縻3��         4,980        1         4,980",
				"15   ��̲�1����             1,800        7        12,600",
				"16   �����̾�������          7,130        1         7,130",
				"17   ����� 110g             1,350        3         4,050",
				"18   ����ũ ����̿�         3,980        1         3,980",
				"19*    ���� ���ִ¿���       4,480        1         4,480",
				"20   ���������÷�1         4,980        1         4,980",
				"21   ��������(��)6         3,210        1         3,210",
				"22   �ɶ�ý� ����           6,950        1         6,950",
				"23   Ǫ���� �̼�����         2,980        2         5,960",
				"24   ���Ϸν�������          1,990        1         1,990",
				"25   CJ����Ĩ 20g          1,980        1         1,980",
				"26   ����ũ ����̿�         3,980        1         3,980",
				"27   ����� ���� ��          4,480        1         4,480",
				"28*    1+ ��޶� 10��        3,480        1         3,480",
				"29   ������ݺ�����          7,980        1         7,980",
				"30   �ٳ��������� 4          5,400        1         5,400"

		};

		ArrayList<ArrayList<String>> OneRec2Arr = new ArrayList<ArrayList<String>>();	//������ ������ 2���� �迭�� �����Ѵ�.(1.������ ����, 2.�ش� ������ ������ ������ �����۵��� ����Ʈ)

		for (int i = 0; i < OneRec.length; i++) {	//2���� �迭�� ���̸�ŭ �ݺ��� ������. 30����

			String[] StrArr = OneRec[i].split("  ");	//�� �׸���� ����� ������ �Ǿ� �����Ƿ� ���⸦ �������� split�Ͽ� 4���� �׸��� �켱 ���� �����ϰ�, ���� ������ �迭�� ��� �����Ѵ�.

			for (int j = 0; j < StrArr.length; j++) {	//��� ������ �迭�� ���̸�ŭ �ݺ����� �����µ�,
				StrArr[j] = StrArr[j].trim().replace(",", "");	//�ش� �׸��� �� �� ������ �ڸ��� trim() �޼ҵ�� 1��, ","�� �����ִ� replace()�޼ҵ�� 2�� �����Ͽ� �ٽ� �迭�� �����Ѵ�.
			}

			ArrayList<String> OneRecArr = new ArrayList<>(Arrays.asList(StrArr));	//2�� ������ �׸���� �ִ� �迭�� �� ArrayList�� �����ϸ� ��´�.(arraylist�� remove�� ���ؼ� ���� �����Ⱚ�� ������ �� �ֱ� ����)

			for (int k = 0; k < OneRecArr.size(); k++) {	//�����Ⱚ�� ���Ե� ArrayList�� ó������ ������ �����鼭,
				if (OneRecArr.get(k).equals("")) {	//���� �����Ⱚ""�� ���ԵǾ�������
					OneRecArr.remove(k);	//�ش� ����k�� ���� remove()�޼ҵ�� �����.
					k--;	//���� �������� ������ �ϳ��� �մ������ �ϹǷ� k--;
				}
			}

			OneRec2Arr.add(OneRecArr);	//������ 3�� ������ ArrayList�� OneRec2Arr 2�� �迭�� �־��ش�.

		}

		for (int i = 0; i < OneRec2Arr.size(); i++) {	//2�� �迭�� ũ�⸸ŭ ó������ �����µ�,
			int price = Integer.parseInt(OneRec2Arr.get(i).get(2));	//�̶� ������ �����ʹ� �� �ٸ��� �� ������ �����ϹǷ�, 2�� �ٿ� �ش��ϴ� price��
			int amount = Integer.parseInt(OneRec2Arr.get(i).get(3));	//3�� �ٿ� �ش��ϴ� ���� amount�� ������ ����ְ�
			int wrongTotal = Integer.parseInt(OneRec2Arr.get(i).get(4));	//�߸� �Է��� ��(4��° �ٿ� �ش�)�� ���� wrongTotal�� ����ش�.
			int correctTotal = price * amount;	//wrongTotal���� �������� ����� �� price�� amount�� ���� correctTotal�� ������ش�.

			if (correctTotal != wrongTotal) {	//���� �Էµ� ���� ����ε� ���̶� �ٸ��ٸ� �Ʒ� ���๮ ����.

				System.out.println("*************************************");
				System.out.printf("����[%d\t%s/t/t%,d\t%d\t%,d]\n", i + 1, OneRec2Arr.get(i).get(1), price, amount,	//��� �޼��� �Է�.
						wrongTotal);
				System.out.printf("����[%d\t%s/t/t%,d\t%d\t%,d]\n", i + 1, OneRec2Arr.get(i).get(1), price, amount,
						correctTotal);
				System.out.println("*************************************");
			}

		}

	}

}
