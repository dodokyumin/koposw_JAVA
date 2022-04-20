package java_010;

import java.io.File;

public class FileExistsOrDelete {

	public static void main(String[] args) {
		File file = new File("C:\\User\\501-01\\Desktop\\out.txt");
		System.out.println(file.exists());
		if(file.exists()) {
			file.delete();
		}
		System.out.println(file.exists());
	}

}
