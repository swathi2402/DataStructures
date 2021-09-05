package com.bridgelabz.stack;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyNode;

public class StackMain {
	public static void main(String[] args) {
		MyNode<Integer> firstNode = new MyNode<>(70);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(56);
		MyStack<Integer> myStack = new MyStack<Integer>();
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		myStack.printStack();
		INode<Integer> peekValue = myStack.peek();
		System.out.println("Peek value is: " + peekValue.getKey());
		myStack.pop();
		
	}
}
