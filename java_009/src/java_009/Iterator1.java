package java_009;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("kim");
		list1.add("lee");
		list1.add("hong");

		Iterator<String> iterator = list1.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("----------------");

		for (String name : list1) {
			System.out.println(name);

		}

		System.out.println("----------------");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

	}

}
