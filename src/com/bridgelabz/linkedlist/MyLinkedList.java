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

	public void insert(INode<K> myNode, INode<K> newNode) {
		INode<K> tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public INode<K> pop() {
		INode<K> tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	public INode<K> popLast() {
		INode<K> tempNode = this.head;
		while (!tempNode.getNext().equals(this.tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		this.tail.setNext(null);
		return tempNode;
	}

	public int search(K key) {
		int count = -1;
		INode<K> tempNode = this.head;
		while (tempNode != null && tempNode.getNext() != null) {
			count += 1 ;
			if(tempNode.getKey().equals(key)) {
				return count;			
			}
			tempNode = tempNode.getNext();
		}
		return count;
	}

	public void printMyNodes() {
		StringBuffer printNodes = new StringBuffer("My Nodes: ");
		INode<K> tempNode = this.head;
		while (tempNode.getNext() != null) {
			printNodes.append(tempNode.getKey());
			if (!tempNode.equals(this.tail))
				printNodes.append("->");
			tempNode = tempNode.getNext();
		}
		printNodes.append(tempNode.getKey());
		System.out.println(printNodes);
	}
}
