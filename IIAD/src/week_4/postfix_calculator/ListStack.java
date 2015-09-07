package week_4.postfix_calculator;

import week_3.linkedlist_versie_3.Lijst;

public class ListStack implements Stack {

	private Lijst lijst; // Lineaire lijst versie 3
	private int size;

	public ListStack() {
		lijst = new Lijst();
		size = 0;
	}

	public void push(Object o) {
		lijst.addFirst(o);
		size++;
	}

	public Object pop() {
		Object temp = lijst.removeFirst();
		size--;
		return temp;
	}

	public Object peek() {
		return lijst.getFirst();
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size < 0);
	}
}
