package java_009;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		
		Queue<String> name = new LinkedList<String>();
		//큐에 값을 넣을 때 : .offer(값);
		name.offer("kim");
		System.out.println(name);
		name.offer("lee");
		System.out.println(name);

		//큐에 값을 빼낼 때 : .poll();
		System.out.println(name.poll());
		System.out.println(name);
		System.out.println(name.poll());
		System.out.println(name);
		
		
	}

}
