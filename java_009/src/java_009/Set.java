package java_009;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>();
		name.add("kim");
		System.out.println(name);
		name.add("lee");
		System.out.println(name);
		name.add("kim");
		System.out.println(name);
		
		System.out.println(name.size());
		
	}

}
