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
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void append(INode<K> newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	public void printMyNodes() {
		StringBuffer printNodes = new StringBuffer("My Nodes: ");
		INode<K> tempNode = this.head;
		while (tempNode.getNext() != null) {
			printNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail)) printNodes.append("->");	
			tempNode = tempNode.getNext();
		}
		printNodes.append(tempNode.getKey());
		System.out.println(printNodes);
	}

}
