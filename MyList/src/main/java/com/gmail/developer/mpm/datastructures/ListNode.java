package com.gmail.developer.mpm.datastructures;

class ListNode<T> {
	T data;
	ListNode<T> nextNode;
	
	public ListNode(T data) {
		this(data, null);
	}
	
	public ListNode(T data, ListNode<T> nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}

	public T getData() {
		return data;
	}

	public ListNode<T> getNext() {
		return nextNode;
	}
}
