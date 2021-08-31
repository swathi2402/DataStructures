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

	public void pop() {
		while (myLinkedList.head != myLinkedList.tail) {
			myLinkedList.popLast();
			myLinkedList.printMyNodes();
		}
		if(myLinkedList.head == myLinkedList.tail) {
			myLinkedList.pop();
		}
	}
}
