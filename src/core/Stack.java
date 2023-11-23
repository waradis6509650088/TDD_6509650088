package core;

public class Stack implements Istack{
	int maxSize;
	int currentSize;
	Object[] stack;
	
	public Stack(int inSize) {
		maxSize = inSize;
		stack = new Object[maxSize];
		currentSize = 0;
	}

	@Override
	public int getSize() {
		return currentSize;
	}

	@Override
	public boolean isEmpty() {
		return currentSize == 0? true : false;
	}

	@Override
	public void push(Object elm) throws Exception {
		if(currentSize != 0) {
			if(elm.getClass().equals(stack[0].getClass())) {
				if(currentSize < maxSize - 1) {
					currentSize++;
					stack[currentSize] = elm;
				}
				else {
					throw new Exception("stack size exceeded.");
				}
			}
			else {
				throw new Exception("All elements in the stack must be of the same type.");
			}
		}
		else {
			stack[currentSize++] = elm;
		}
		
		
		
	}
	
	@Override
	public Object pop() throws Exception{
		if(currentSize > 0) {
			return stack[currentSize--];
		}
		else {
			throw new Exception("there is nothing in the stack.");
		}
		
	}

	@Override
	public Object top() {
		return stack[currentSize];
	}

	@Override
	public boolean isFull() {
		return currentSize == maxSize? true : false;
	}

}
