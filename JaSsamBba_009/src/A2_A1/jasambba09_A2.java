package A2_A1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class jasambba09_A2 {

	static ArrayList<ArrayList<String>> nameScore2D = new ArrayList<ArrayList<String>>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("만점은 99점");
		ArrayList<String> data1 = new ArrayList<>();
		String data1Str = sc.nextLine();
		String[] data1StrArr = data1Str.split(" ");
		data1.add(data1StrArr[0]);
		data1.add(data1StrArr[1]);
		nameScore2D.add(data1);

		ArrayList<String> data2 = new ArrayList<>();
		String data2Str = sc.nextLine();
		String[] data2StrArr = data2Str.split(" ");
		data2.add(data2StrArr[0]);
		data2.add(data2StrArr[1]);
		nameScore2D.add(data2);

		ArrayList<String> data3 = new ArrayList<>();
		String data3Str = sc.nextLine();
		String[] data3StrArr = data3Str.split(" ");
		data3.add(data3StrArr[0]);
		data3.add(data3StrArr[1]);
		nameScore2D.add(data3);

		ArrayList<String> data4 = new ArrayList<>();
		String data4Str = sc.nextLine();
		String[] data4StrArr = data4Str.split(" ");
		data4.add(data4StrArr[0]);
		data4.add(data4StrArr[1]);
		nameScore2D.add(data4);

		ArrayList<String> data5 = new ArrayList<>();
		String data5Str = sc.nextLine();
		String[] data5StrArr = data5Str.split(" ");
		data5.add(data5StrArr[0]);
		data5.add(data5StrArr[1]);
		nameScore2D.add(data5);

		System.out.println("#Rank");

		Collections.sort(nameScore2D, new Comparator<ArrayList<String>>() {
			
			public int compare(ArrayList<String> o1, ArrayList<String> o2) {
				return o2.get(1).compareTo(o1.get(1));
			}
		});

		for (int i = 0; i < 5; i++) {
			
			if (i == 4) {
				System.out.print(nameScore2D.get(i).get(0));
			} else {
				System.out.print(nameScore2D.get(i).get(0)+ ", ");
			}
		}
	}

}
