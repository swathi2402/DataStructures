package com.bridgelabz.queue;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyLinkedList;

public class MyDeque<T> {
	private final MyLinkedList<T> myLinkedList;
	
	public MyDeque() {
		this.myLinkedList = new MyLinkedList<T>();
	}
	
	public void addFront(INode<T> newNode) {
		myLinkedList.add(newNode);
	}
	
	public void addRear(INode<T> newNode) {
		myLinkedList.append(newNode);
	}
	
	public INode<T> removeFront() {
		return myLinkedList.pop();
	}
	
	public INode<T> removeRear() {
		return myLinkedList.popLast();
	}
	
	public int size() {
		return myLinkedList.size();
	}
	
	public void printDueue() {
		myLinkedList.printMyNodes();
	}
}
