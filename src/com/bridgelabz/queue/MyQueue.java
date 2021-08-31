package com.bridgelabz.queue;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyLinkedList;
import com.bridgelabz.linkedlist.MyNode;

public class MyQueue<T> {
	private final MyLinkedList<T> myLinkedList;
	
	public MyQueue() {
		this.myLinkedList = new MyLinkedList<T>();
	}

	public void enqueue(INode<T> newNode) {
		myLinkedList.append(newNode);
	}
	
	public void printQueue() {
		myLinkedList.printMyNodes();
	}
}

