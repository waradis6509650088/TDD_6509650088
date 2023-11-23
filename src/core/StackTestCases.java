package core;

import junit.framework.TestCase;

public class StackTestCases extends TestCase {
	

	//TC1
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack(10);
		assertEquals(true, s1.isEmpty());
		assertEquals(0, s1.getSize());
		assertEquals(false, s1.isFull());
	}
	
	//TC2
	public void testPushElmToTop() {
		Stack s1 = new Stack(4);
		try {
			s1.push(1);
			s1.push(2);
			s1.push(3);

		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

		assertEquals(4, s1.top());
	}
	
	//TC3
	public void testPushSameElement() throws Exception{
		Stack s1 = new Stack(10);
		try {
			s1.push(1);
			s1.push("hellooo");
			fail("Exception not thrown");
		}
		catch(Exception e) {
			assertEquals("All elements in the stack must be of the same type.", e.getMessage());
		}
	}
	
	//TC4
}
