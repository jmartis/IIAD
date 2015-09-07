package week_3.linkedlist_versie_3;

import java.util.*;

public class Lijst {
	private Entry header;
	private int size;

	// Constructor voor een lege lijst
	public Lijst() {
		header = new Entry(null, null, null);
		header.next = header;
		header.previous = header;
	}

	// Object vooraan toevoegen
	public void addFirst(Object o) {
		addBefore(o, header.next);
	}

	// Object vooraan opvragen
	public Object getFirst() {
		System.out.println(header.element + "\n");
		return header.next.element;
	}

	// Object vooraan verwijderen
	public Object removeFirst() {
		Entry deleted =  header.next; 
		remove(header.next);
		
		return deleted.element;
	}
	
	//Object achteraan opvragen
		public Object getLast() {
	        return header.previous.element;
	    }

	// Aantal objecten in de lijst afleveren
	public int size() {
		return size;
	}

	// De lijst leegmaken
	public void clear() {
		Entry e = header.next;
		while (e!= header){
			Entry next = e.next;
			e.next = e.previous = null;
			e.element = null;
			e = next;
		}
		header.next = header.previous = header;
		size = 0;
	}

	// Lever een iterator voor de lijst
	public Iterator iterator() {
		return new LItr();
	}

	// private methoden
	private void addBefore(Object o, Entry e) {
		Entry newEntry = new Entry(o, e, e.previous);
		newEntry.previous.next = newEntry;
		newEntry.next.previous = newEntry;
		size++;
	}

	private void remove(Entry e) {
		if (e == header)
			throw new NoSuchElementException("Kan Entry niet verwijderen: is header");

		e.previous.next = e.next;
		e.next.previous = e.previous;
		size--;
	}

	// Inwendige klasse LItr
	private class LItr implements Iterator {
		private Entry pos = header;

		public boolean hasNext() {
			return pos.next != header;
		}

		public Object next() {
			pos = pos.next;
			return pos.element;
		}

		public boolean hasPrevious() {
			return pos.previous != header;
		}

		public Object previous() {
			pos = pos.previous;
			return pos.element;
		}
	} // Einde inwendige klasse LItr

	// Inwendige klasse Entry
	private class Entry {
		Object element;
		Entry next;
		Entry previous;

		Entry(Object element, Entry next, Entry previous) {
			this.element = element;
			this.next = next;
			this.previous = previous;
		}
	} // Einde inwendige klasse Entry

} // Einde klasse Lijst
