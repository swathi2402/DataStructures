package com.bridgelabz.queue;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyLinkedList;

public class MyQueue<T> {
	private final MyLinkedList<T> myLinkedList;
	
	public MyQueue() {
		this.myLinkedList = new MyLinkedList<T>();
	}

	public void enqueue(INode<T> newNode) {
		myLinkedList.append(newNode);
	}
	
	public INode<T> dequeue() {
		if(isEmpty()) {
			return null;
		}
		return myLinkedList.pop();
	}
	
	public void printQueue() {
		myLinkedList.printMyNodes();
	}

	public boolean isEmpty() {
		return (myLinkedList.head == null);
	}
}

