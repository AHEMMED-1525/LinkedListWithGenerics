package NodeTest;

public class MyLinkedList {
	 public INode tail;
	 public INode head;

	    public MyLinkedList() 
	    {
	        this.head = null;
	        this.tail = null;
	    }
	    //Add method
	   public void add(INode newNode) {
	     if(this.head == null && this.tail == null) 
	     {
	            this.head = newNode;
	            this.tail = newNode;
	     }
	     else 
	     {
	            INode tempNode = this.head;
	            this.head = newNode;        
	            this.head.setNext(tempNode);
	        }
	    }
	   //Append Method 
	    public void append(INode newNode)
	    {
	        if(this.head == null && this.tail == null)
	        {
	            this.head = newNode;
	            this.tail = newNode;
	        }
	        else 
	        {
	            this.tail.setNext(newNode);
	            this.tail = newNode;
	        }
	    }
	    public void insert(INode myNode , INode newNode) 
	    {
	    	 /* Initialize previous node to point new node
	    	 * make new node point to tempNode 
	    	 */
	        INode tempNode = myNode.getNext();  
	        myNode.setNext(newNode);         
	        newNode.setNext(tempNode);
	    }
	    // pop First Element
	    public INode popFirst() 
	    {
	        INode tempNode = this.head;         
	        this.head = head.getNext();        
	        return tempNode;
	    }
	    
	    // Pop Last ELement
	    public INode popLast()
	    {
	        INode tempNode = this.head;
	        while (!tempNode.getNext().equals(tail))
	        {
	            tempNode = tempNode.getNext();
	        }
	        this.tail = tempNode;          
	        tempNode = tempNode.getNext();
	        return tempNode;
	    }
	    //Search node for value 30
	    public boolean search(INode searchnode) 
	    {
	        INode tempNode = this.head;
	        while (tempNode != searchnode && tempNode.getNext() != this.tail)
	        {
	            tempNode = tempNode.getNext();
	        }
	        if (tempNode == searchnode)
	        {
	            return true;
	        }
	        else
	            return false;

	    }
	    public <E> INode index(E searchKey) 
	    {
	        INode tempNode = this.head;
	        while (tempNode.getKey() != searchKey)
	        {
	            tempNode = tempNode.getNext();
	        }
	        return tempNode;
	    }
}
