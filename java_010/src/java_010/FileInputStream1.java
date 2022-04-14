package java_010;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileInputStream1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader (new FileReader("C:\\Users\\501-01\\Desktop\\trafficvolume.csv"));
		String line;

		List<List<String>> csvList = new ArrayList<List<String>>();
		List<String> aLine = new ArrayList<String>();

		while ((line = reader.readLine()) != null) {

			String[] lineArr = line.split(",");
			
			if (lineArr[1].contains("¸ñ")) {
				aLine = Arrays.asList(lineArr);
			}

			csvList.add(aLine);

		}
		for (int i = 0; i < 5; i++) {
			for(int j= 0; j<csvList.size(); j++)
			if (i == 4) {
				System.out.print(csvList.get(i).get(0));
			} else {
				System.out.print(csvList.get(i).get(0) + ", ");
			}
		}

	}

}
