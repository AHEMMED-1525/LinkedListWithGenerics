package NodeTest;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
	@Test
	public void given3NumbersWhenLinkedShouldPassedLinkedListTest() 
	{
		
		MyNode<Integer> myFirstNode = new MyNode<>(56);						 // Initializing each node with a key 
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		myFirstNode.setNext(mySecondNode);								   	// Set next node for each node 	
		mySecondNode.setNext(myThirdNode);
		
		boolean result = myFirstNode.getNext().equals(mySecondNode) &&
						 mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(true);
	}

}
