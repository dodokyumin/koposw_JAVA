package java_009;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		
		Queue<String> name = new LinkedList<String>();
		//ť�� ���� ���� �� : .offer(��);
		name.offer("kim");
		System.out.println(name);
		name.offer("lee");
		System.out.println(name);

		//ť�� ���� ���� �� : .poll();
		System.out.println(name.poll());
		System.out.println(name);
		System.out.println(name.poll());
		System.out.println(name);
		
		
	}

}
