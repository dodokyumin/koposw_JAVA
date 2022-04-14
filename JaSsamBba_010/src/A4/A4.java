package A4;

import java.io.*;
import java.util.*;

public class A4 {

	public static void main(String[] args) throws IOException {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list = listMaking(list);

		resultShow(list);
	}

	public static ArrayList<Integer> listMaking(ArrayList<Integer> list) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\501-01\\Desktop\\trafficvolume.csv"));
		String line;

		while ((line = reader.readLine()) != null) {
			if (line.contains(",¸ñ,")) {
				String[] trafficArray = line.split(",");
				try {
					if (trafficArray[20] != null)
						list.add(Integer.parseInt(trafficArray[20]));
				} catch (Exception e) {

				}
			}
		}
		return list;
	}

	public static void resultShow(ArrayList<Integer> a) throws IOException {
		int sum = 0;
		for (int i = 0; i < a.size(); i++) {
			sum += a.get(i);
		}
		Collections.sort(a);
		int min = a.get(0);
		System.out.println("MIN: " + a.get(0));
		Collections.reverse(a);
		int max = a.get(0);
		System.out.println("MAX: " + a.get(0));
		System.out.println("SUM: " + sum);
		System.out.println("AVR: " + sum / a.size());

		FileWriter fw = new FileWriter("c:\\Users\\501-01\\Desktop\\result.txt", false);

		String data = "ThurMAX : " + max + "/ MIN : " + min + "/ AVR : " + sum / a.size() + "\n";
		fw.write(data);
		fw.close();
	}
}