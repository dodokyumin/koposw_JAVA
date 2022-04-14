package java_010;

import java.io.File;

public class listFiles {

	public static void main(String[] args) {
		File dir = new File("C:\\User\\501-01\\Desktop\\test");
		File files[] = dir.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
		
	}

}
