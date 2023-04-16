package com.bridgelabz.binarysearchtrees;

public class MyBinaryNode<Key extends Comparable<Key>> {
	
	Key key;
	MyBinaryNode<Key> left;
	MyBinaryNode<Key> right;

	public MyBinaryNode(Key key) {
		this.key = key;
	}
}
