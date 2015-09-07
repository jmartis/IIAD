package week_5.queues;

import week_4.linkedlist_versie_3.Lijst;

public class ListQueue implements Queue{
	
	private Lijst lijst; //lineaire lijst versie 3
	
	ListQueue(){
		lijst = new Lijst();
	}
	
	public void enqueue(Object o){
		lijst.addLast(o);
	}
	
	public Object deque(){
		return lijst.removeFirst();
	}
	//peek()
	public Object front(){
		return lijst.getFirst();
	}
	
	public int size(){
		return lijst.size();
	}
	
	public boolean isEmpty(){
		return (lijst.isEmpty());
	}

}
