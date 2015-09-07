package week_2.linkedlist_versie_2;

public class Lijst {

	private Entry header;
	private Entry tail;
	private int size;

	public Lijst() {
		header = null;
		tail = null;
		size = 0;
	}

	public void addFirst(Object o) {

		Entry newNode = new Entry(o, null);

		if (header != null) {
			newNode.setNext(header);
			header.setTail(newNode);
			if (header.getNext() == null) {
				this.tail = header;
			}
		}

		header = newNode;
		size++;
	}

	public void addLast(Object o) {

		Entry newNode = new Entry(o, null);
		// is de tail leeg?
		if (tail != null) {
			newNode.setTail(tail);
			tail.setNext(newNode);
			if (tail.getTail() == null) {
				this.header = tail;
			}
		}
		tail = newNode;
		size++;
	}

	public int getSize() {
		return size;
	}

	public Iterator iterator() {
		return (new LijstIterator());
	}

	// inwendige klasse LijstIterator
	private class LijstIterator implements Iterator {

		Entry currentPosition = header;

		@Override
		public boolean hasNext() {
			return (currentPosition != null);
		}

		@Override
		public Object next() {
			Entry temporary = currentPosition;
			currentPosition = temporary.next;
			return temporary.element;
		}
	}

	// inwendige klasse
	private class Entry {

		Object element;
		Entry next;
		Entry tail;

		Entry(Object element, Entry next) {
			this.element = element;
			this.next = next;
		}

		public Entry getNext() {
			return next;
		}

		public void setNext(Entry next) {
			this.next = next;
		}

		public Entry getTail() {
			return tail;
		}

		public void setTail(Entry tail) {
			this.tail = tail;
		}
	}
}
