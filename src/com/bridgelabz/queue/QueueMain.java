package com.bridgelabz.queue;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyNode;

public class QueueMain {
	public static void main(String[] args) {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		MyDeque<Integer> myDeque = new MyDeque<Integer>();
		myDeque.addRear(firstNode);
		myDeque.addRear(secondNode);
		myDeque.addFront(thirdNode);
		myDeque.printDueue();
		INode<Integer> dequeueNode = myDeque.removeRear();
		System.out.println("Dequeued value is: " + dequeueNode.getKey());
	}
}
