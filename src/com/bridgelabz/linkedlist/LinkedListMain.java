package com.bridgelabz.linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.append(firstNode);
		myLinkedList.append(thirdNode);
		myLinkedList.insert(firstNode, secondNode);
		MyNode<Integer> newNode = new MyNode<>(40);
		myLinkedList.insertAtRandom(secondNode, newNode);
		myLinkedList.printMyNodes();
		myLinkedList.deleteAtRandom(newNode);
		myLinkedList.printMyNodes();
		int listSize = myLinkedList.size();
		System.out.println("Size of the linked list is " + listSize);
	}
}
