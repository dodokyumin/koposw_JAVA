package aaa;

public class p09 {

	public static void main(String[] args) {

		k44_EmartData k44_ED = new k44_EmartData();	//�̸�Ʈ ������ Ŭ������ �ν��Ͻ� ED�� �����ߴ�.
		k44_EmartPrint k44_EP = new k44_EmartPrint();	//�̸�Ʈ ������ ����Ʈ�� �ν��Ͻ� EP�� �����ߴ�.

		k44_ED.k44_setSumPrice();	//EDŬ������ setSumPrice �Լ� �����Ͽ� ����Ʈ ���� sumPrice�� �̸� �����Ͽ� �����س���.

		k44_EP.k44_head();	//EPŬ������ head�Լ� ȣ���ϱ�.
		k44_ED.k44_printItem();	//EDŬ������ printItem�Լ� ȣ���ϱ�.
		k44_EP.k44_tail();	//EPŬ������ tail�Լ� ȣ���ϱ�.

	}

}
