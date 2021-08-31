package com.bridgelabz.linkedlist;

public class MyLinkedList<K> {
	private INode<K> head;
	private INode<K> tail;

	public MyLinkedList() {
		super();
		this.head = null;
		this.tail = null;
	}

	public void add(INode<K> newNode) {
		if (this.tail == null) {
			this.head = newNode;
		}
		if(this.head == null) {
			this.tail = newNode;
		} else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
}
