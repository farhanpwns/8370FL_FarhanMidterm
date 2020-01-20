package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

		Queue<String> q = new LinkedList<String>();

		q.add("Sora");
		q.add("Roxas");
		q.add("Kairi");
		q.add("Namine");
		q.add("Riku");
		q.add("Xion");
		q.add("Axel");
		System.out.println("Elements in Queue: "+q);

		q.remove();
		System.out.println("Elements in Queue after removing one element: "+q);

		System.out.println("Head of the Queue after remove: "+q.element());

		System.out.println("Poll method removes latest head and returns it: "+q.poll());

		System.out.println("Peek method returns the latest head of the Queue: "+q.peek());

		System.out.println("Elements in Queue:"+q);

		System.out.println("Use of for each loop to retrieve data: ");
		for (String str1 : q) {
			System.out.print(str1+" ");
		}
		System.out.println();

		System.out.println("Use of while loop to retrieve data: ");
		Iterator itr = q.iterator();
		while (itr.hasNext()) {
			String str2 = (String) itr.next();
			System.out.print(str2+" ");
		}
		System.out.println();

	}

}
