package com.bridgelabz.queue;

import com.bridgelabz.linkedlist.MyNode;

public class QueueMain {
	public static void main(String[] args) {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		MyQueue<Integer> myQueue = new MyQueue<Integer>();
		myQueue.enqueue(firstNode);
		myQueue.enqueue(secondNode);
		myQueue.enqueue(thirdNode);
		myQueue.printQueue();
	}
}
