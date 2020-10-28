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
	    public void append(INode newNode) {
	        if(this.head == null && this.tail == null) {
	            this.head = newNode;
	            this.tail = newNode;
	        }
	        else {
	            this.tail.setNext(newNode);
	            this.tail = newNode;
	        }
	    }
}
