package core;

public class Stack implements Istack{
	int maxSize;
	int currentSize;
	Object[] stack;
	
	public Stack(int inSize) {
		maxSize = inSize;
		stack = new Object[inSize];
		currentSize = 0;
	}

	@Override
	public int getSize() {
		return currentSize;
	}

	@Override
	public boolean isEmpty() {
		return currentSize < 1? true : false;
	}

	@Override
	public void push(Object elm) throws Exception {
		if(!isEmpty()) {
			if(currentSize < maxSize) {
				if(elm.getClass().equals(stack[0].getClass())) {
						stack[currentSize] = elm;
						currentSize++;
					}
					else {
						throw new Exception("All elements in the stack must be of the same type.");
					}
			}
			else {
				throw new Exception("stack size exceeded.");
			}
		}
		else {
			stack[currentSize] = elm;
			currentSize++;
			
		}
	}
	
	@Override
	public Object pop() throws Exception{
		if(currentSize > 0) {
			return stack[--currentSize];
		}
		else {
			throw new Exception("there is nothing in the stack.");
		}
		
	}

	@Override
	public Object top() {
		return stack[currentSize - 1];
	}

	@Override
	public boolean isFull() {
		return currentSize == maxSize - 1? true : false;
	}

}
