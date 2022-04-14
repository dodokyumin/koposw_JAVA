package java_009;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("kim");
		name.add("lee");
		name.add("john");
		name.add("kim");

		System.out.println(name);
		System.out.println(name.size());
		System.out.println(name.get(2));
		
		name.remove(1);
		System.out.println(name);
		
		name.set(1, "park");
		System.out.println(name);
		System.out.println(name.size());
		
		Collections.sort(name);
		System.out.println(name);
		
		Collections.reverse(name);
		System.out.println(name);
		clearScreen();
		
	}

	public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
