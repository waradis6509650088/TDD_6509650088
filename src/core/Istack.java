package core;

public interface Istack {
	int getSize();
	boolean isEmpty();
	void push(Object elm) throws Exception;
	Object top();
	boolean isFull();
	Object pop() throws Exception;
}
