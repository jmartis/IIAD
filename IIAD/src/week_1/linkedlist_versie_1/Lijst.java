package week_1.linkedlist_versie_1;

import java.util.Iterator;
import java.util.LinkedList;

public class Lijst {
	
	private Entry header; //referentie naar het begin van de lijst
	
	
	public Lijst(){
		header = null;
	}
	
	public void addFirst(Object o){
		header = new Entry(o, header);
	}
	
	public Object getFirst(){
		LijstIterator iterator = iterator();
		
		if(!iterator.hasNext()){
			return null;
		}else{
			return(iterator.next());
		}
	}
	
	public Object removeFirst(){
		if(header == null){
			return null;
		}else{
			Object temp = header.element;
			header = header.next;
			return temp;
		}
	}
	
	
	public LijstIterator iterator(){
		return (new LinkedListIterator());
	}
	
	private class LinkedListIterator implements LijstIterator{

		Entry currentPosition = header;
		
		@Override
		public boolean hasNext() {
			
			return (currentPosition != null);
		}

		@Override
		public Object next() {
			
			Entry temp = currentPosition;
			currentPosition = temp.next;
			return temp.element;
			
		}
		
	}
	
	public interface LijstIterator{
		
		public boolean hasNext();
		public Object next();
	}
	
	//inwendige klasse 
	private class Entry {
		
		Object element;
		Entry next;
		
		//constructor
		Entry(Object element, Entry next){
			this.element = element;
			this.next = next;
		}
	}

}
