package week_5.queues;

public interface Deque {

	public void addFirst(Object o);
	public void addLast(Object o);
	public Object getFirst();
	public Object getLast();
	public Object removeFirst();
	public Object removeLast();
	public int size();
	public boolean isEmpty();
}
