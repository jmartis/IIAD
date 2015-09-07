package week_5.queues;

import week_4.linkedlist_versie_3.Iterator;
import week_4.linkedlist_versie_3.Lijst;

public class QueuesDemo {

	public static void main(String[] args) {

		ListQueue queue = new ListQueue();
		ListDeque deque = new ListDeque();

		queue.enqueue("eerste");
		queue.enqueue("tweede");
		queue.enqueue("derde");
		queue.enqueue("vierde");
		queue.enqueue("vijfde");

		System.out.println("eerste item: " + queue.front());
		queue.deque();
		System.out.println("eerste item is nu: " + queue.front());
		// System.out.println(queue.size());
		// System.out.println(queue.isEmpty());
		
		

	}

}
