package com.bridgelabz.stack;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyLinkedList;

public class MyStack<K> {
	private final MyLinkedList<K> myLinkedList;

	public MyStack() {
		this.myLinkedList = new MyLinkedList<K>();
	}

	public void push(INode<K> newNode) {
		myLinkedList.add(newNode);
	}

	public void printStack() {
		myLinkedList.printMyNodes();
	}

	public INode<K> peek() {
		return myLinkedList.head;
	}

	public boolean isEmpty() {
		return (myLinkedList.head == null);
	}

	public INode<K> pop() {
		if(isEmpty()) {
			return null;
		}
		return myLinkedList.pop();
	}
	
	public int size() {
		return myLinkedList.size();
	}
	
}
