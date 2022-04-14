package A2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputStr1 = sc.nextLine();
		String inputStr2 = sc.nextLine();

		HashSet<String> str1Set = new HashSet<String>();
		HashSet<String> str2Set = new HashSet<String>();

		int count = 0;
		// string to hashset
		for (int i = 0; i < inputStr1.length(); i++) {
			str1Set.add(inputStr1.substring(i, i + 1));
		}

		for (int i = 0; i < inputStr2.length(); i++) {
			str2Set.add(inputStr2.substring(i, i + 1));
		}

		List<String> inputStrList1 = new ArrayList<>(str1Set);
		List<String> inputStrList2 = new ArrayList<>(str2Set);

		for (int i = 0; i < inputStrList1.size(); i++) {
			for (int j = 0; j < inputStrList2.size(); j++) {
				if (inputStrList1.get(i).equals(inputStrList2.get(j))) {
					count++;

				}
			}
		}

		System.out.println("1 : " + inputStr1.length());
		System.out.println("2 : " + inputStr2.length());
		System.out.println("3 : " + count);
	}

}
