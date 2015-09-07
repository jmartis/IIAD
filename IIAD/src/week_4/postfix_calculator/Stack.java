package week_4.postfix_calculator;

public interface Stack {

	public void push(Object o);
	public Object pop();
	public Object peek();
	public int size();
	public boolean isEmpty();
}
