package com.bridgelabz.linkedlist;

public interface INode<K> {
	K getKet();
	void setKey(K key);
	
	INode<K> getNext();
	void setNext(INode<K> next);
}
