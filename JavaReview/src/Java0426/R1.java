package Java0426;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class R1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String userInput1 = sc.nextLine();
		String userInput2 = sc.nextLine();

		String[] inputArr1 = userInput1.split("");
		String[] inputArr2 = userInput2.split("");

		List<String> list = new ArrayList<String>(Arrays.asList(inputArr1));
		List<String> list2 = new ArrayList<String>(Arrays.asList(inputArr2));

		int cnt = 0;

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list.get(i).equals(list2.get(j))) {
					cnt++;
					list.remove(i);
					list2.remove(j);
					i--;
					j--;
					break;
				}

			}
		}

		if (cnt == userInput1.length()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();
	}

}
