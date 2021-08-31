package com.bridgelabz.linkedlist;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;

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
			count += 1;
			if (tempNode.getKey().equals(key)) {
				return count;
			}
			tempNode = tempNode.getNext();
		}
		return count;
	}

	public void insertAtRandom(INode<K> keyNode, INode<K> newNode) {
		INode<K> tempNode = this.head;
		while (tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(keyNode.getKey())) {
				INode<K> nextNode = tempNode.getNext();
				tempNode.setNext(newNode);
				tempNode = tempNode.getNext();
				tempNode.setNext(nextNode);
			}
			tempNode = tempNode.getNext();
		}
	}

	public void deleteAtRandom(INode<K> keyNode) {
		INode<K> tempNode = this.head;
		while (tempNode != null && tempNode.getNext() != null) {
			if (!tempNode.getKey().equals(keyNode.getKey())) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(tempNode.getNext().getNext());
			break;
		}
	}

	public void orderedListAdd(INode<K> newNode) {
		/*
		 * if (this.tail == null) { this.tail = newNode; } if (this.head == null) {
		 * this.head = newNode; } else { if ((int) this.head.getKey() > (int)
		 * newNode.getKey()) { INode<K> nextNode = this.head; this.head = newNode;
		 * newNode.setNext(nextNode); } else { INode<K> prevNode = this.head; INode<K>
		 * tempNode = this.head.getNext(); boolean found = false;
		 * System.out.println(prevNode.getKey()+ " " + tempNode.getKey()); while
		 * (tempNode.getNext() != null && (int) tempNode.getKey() > (int)
		 * newNode.getKey()) { prevNode = tempNode; tempNode = tempNode.getNext(); found
		 * = true; } // if ((int) prevNode.getKey() == (int) this.head.getKey()) { //
		 * head = newNode; // } else { // prevNode.setNext(newNode); // } //
		 * newNode.setNext(tempNode); if (found) { prevNode.setNext(newNode);
		 * prevNode.getNext().setNext(tempNode); } else {
		 * 
		 * } // tempNode.setNext(newNode); // if ((int) tempNode.getKey() < (int)
		 * newNode.getKey()) { // } // INode<K> nextNode = tempNode.getNext(); //
		 * tempNode = tempNode.getNext(); // tempNode.setNext(nextNode);
		 * 
		 * 
		 * } }
		 */

		if (this.head == null || (int) head.getKey() > (int) newNode.getKey()) {
			newNode.setNext(head);
			head = newNode;
		} else {
			INode<K> currentNode = this.head;
//			while(currentNode.getNext() != null && (int) currentNode.getKey() < (int) newNode.getKey()) {
////				System.out.println("hi");
////				currentNode = currentNode.getNext();
////				System.out.println(currentNode.getNext().getKey());
//				newNode.setNext(currentNode.getNext());
//				System.out.println(newNode.getKey());
//				currentNode.setNext(newNode);
////				System.out.println(currentNode.getKey());
//				break;
//			}

			boolean isInserted = false;
			while (currentNode.getNext() != null) {
				if ((int) currentNode.getNext().getKey() > (int) newNode.getKey()) {
					newNode.setNext(currentNode.getNext());
					currentNode.setNext(newNode);
					isInserted = true;
					break;
				} else {
					System.out.println(
							newNode.getKey() + " " + currentNode.getKey() + " " + currentNode.getNext().getKey());
					currentNode.setNext(currentNode.getNext());
				}
			}
		}

//		INode<K> currentNode = this.head;
//		INode<K> tempNode;
//		if(head == null) {
//			return;
//		}
//		else {
//			while(currentNode != null) {
//				INode<K> nextNode = currentNode.getNext();
//			
//				while(nextNode != null) {
//					if((int) currentNode.getKey() > (int) nextNode.getKey()) {
//						
//					}
//			}
//		}

	}

	public int size() {
		int count = 0;
		INode<K> tempNode = this.head;
		while (tempNode != null) {
			count++;
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
