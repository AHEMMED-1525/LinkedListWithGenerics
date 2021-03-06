package NodeTest;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
	// Creating 3 nodes
	@Test
	public void given3NumbersWhenLinkedShouldPassedLinkedListTest() 
	{		
		MyNode<Integer> myFirstNode = new MyNode<>(56);									// Initializing each node with a key 
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		myFirstNode.setNext(mySecondNode);										// Set next node for each node 	
		mySecondNode.setNext(myThirdNode);
		
		boolean result = myFirstNode.getNext().equals(mySecondNode) &&
						 mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(true);
	}
	// Adding to the top
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop()
    {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        //create a linked list
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        
        boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }
    //Append the node to last
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAppendedToLast()
    {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    // Insert the node in between the nodes
    @Test
    public void given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedListTest()
    {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        MyLinkedList myLinkedList = new MyLinkedList();
        
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode , mySecondNode);
        
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    // Delete First Element of Sequence
    @Test
    public void givenFirstElementWhenDeletedShouldPassLinkedListResult()
    {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        
        //Using pop can delete the first Element
        myLinkedList.popFirst();
        
        boolean result = myLinkedList.head.equals(mySecondNode);
        Assert.assertTrue(result);
    }
    // Deleting Laast Element of Sequence
    @Test
    public void givenLastElementWhenDeletingShouldPassLinkedListResult() 
    {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
     
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        
        INode result = myLinkedList.popLast();
        Assert.assertEquals(myThirdNode,  result);
    }
    // Search a Key value
    @Test
    public void given3NumbersWhenMatchesValueShouldSearchNodeTrue() 
    {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        
        //search a node where for the key value 30
        boolean result = myLinkedList.search(mySecondNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLinkedListWhenInsertingPositionShouldPassLinkedListTest() 
    {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myInsertionNode = new MyNode<>(40);

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);

        INode searchNode = myLinkedList.index(30);

        myLinkedList.insert(searchNode , myInsertionNode);

        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.head.getNext().getNext().equals(myInsertionNode) && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    
    /*
     * 1. Search the key value to delete
     * 2.delete node 
     * 3.Show the  size of newly modified list*/
    @Test
    public void givenLinkedList_AfterDeletingANode_ShouldReturnExpectedListSize() 
    {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
    
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.append(myFourthNode);
        
        INode searchNode = myLinkedList.index(40);

        INode startNode = myLinkedList.remove(searchNode);

        int size = myLinkedList.Listsize();
        Assert.assertEquals(3 , size);
    }

}
