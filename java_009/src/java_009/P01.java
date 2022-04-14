package java_009;

import java.util.ArrayList;
import java.util.Collections;

public class P01 {

	public static void main(String[] args) {
		ArrayList<Integer> ranNum = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++)
			ranNum.add((int) (Math.random() * 10));

		Collections.sort(ranNum);
		System.out.println(ranNum);

		ranNum.remove(4);
		ranNum.remove(5);
		System.out.println(ranNum);

	}

}
