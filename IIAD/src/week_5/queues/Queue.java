package week_5.queues;

public interface Queue {
	public void enqueue(Object o);
	public Object deque();
	public Object front();
	public int size();
	public boolean isEmpty();

}
