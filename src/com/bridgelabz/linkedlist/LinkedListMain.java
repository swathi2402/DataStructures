package com.bridgelabz.linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		System.out.println(firstNode.getKey() + " " + secondNode.getKey() + " " + thirdNode.getKey());
	}
}
