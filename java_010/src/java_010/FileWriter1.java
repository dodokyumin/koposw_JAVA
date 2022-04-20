package java_010;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\501-01\\Desktop\\output.txt", false);
		
		for(int i = 11; i < 16; i++) {
			String data = "Line #" + i + "\n";
			fw.write(data);
		}
		fw.close();
	}

}
