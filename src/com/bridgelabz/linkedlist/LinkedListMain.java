package com.bridgelabz.linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.add(firstNode);
		myLinkedList.append(thirdNode);
		myLinkedList.insert(firstNode, secondNode);
		myLinkedList.printMyNodes();
		INode<Integer> poppedNode = myLinkedList.pop();
		System.out.println(poppedNode.getKey() + " is popped");
		myLinkedList.printMyNodes();
	}
}
