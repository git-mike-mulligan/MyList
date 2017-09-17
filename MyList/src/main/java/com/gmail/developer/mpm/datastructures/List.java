package com.gmail.developer.mpm.datastructures;

public class List<T> {
	private ListNode<T> firstNode;
	private ListNode<T> lastNode;
	private String name;
	
	public List() {
		this("List");
	}

	public List(String name) {
		this.name = name;
		this.firstNode = this.lastNode = null;
	}
	
	public void insertAtFront( T insertItem ) {
		if ( isEmpty() )
			this.firstNode = this.lastNode = new ListNode<T>( insertItem );
		else
			this.firstNode = new ListNode<T>( insertItem, firstNode );
	}
	
	public void insertAtBack( T insertItem ) {
		if ( isEmpty() )
			this.firstNode = this.lastNode = new ListNode<T>( insertItem );
		else
			this.lastNode = this.lastNode.nextNode = new ListNode<T>( insertItem );
	}
	
	public T removeFromFront() throws EmptyListException {
		if ( isEmpty() ) // throw exception if List is empty 
			throw new EmptyListException(name); 
		
		T removedItem = firstNode.data; // retrieve data being removed 
		
		// update references firstNode and lastNode 86 
		if (firstNode == lastNode) 
			firstNode = lastNode = null; 
		else 
			firstNode = firstNode.nextNode; 
		
		return removedItem; // return removed node data
	}
	
	public T removeFromBack() throws EmptyListException {
		if ( isEmpty() ) // throw exception if List is empty 
			throw new EmptyListException(name); 
		
		T removedItem = lastNode.data; // retrieve data being removed 
		
		// update references firstNode and lastNode 
		if (firstNode == lastNode) 
			firstNode = lastNode = null; 
		else // locate new last node 
		{ 
			ListNode<T> current = firstNode; 
			
			// loop while current node does not refer to lastNode 
			while (current.nextNode != lastNode) 
				current = current.nextNode; 
			
			lastNode = current; // current is new lastNode 
			current.nextNode = null; 
		} 
		return removedItem; // return removed node data	
	}
	
	public boolean isEmpty() {
		return firstNode == null;
	}
	
	public void print() {
		if ( isEmpty() ) {
			System.out.printf("Empty %s%n", this.name);
			return;
		}
		
		System.out.printf("The %s is: ", this.name);
		ListNode<T> current = this.firstNode;
		
		while ( current != null ) {
			System.out.printf("%s ", current.data);
			current = current.nextNode; 
		}
		System.out.println();
	}
}
