package com.bridgelabz.binarysearchtrees;

public class MyBinaryNode<Key extends Comparable<Key>> {
	Key key;
	MyBinaryNode<Key> left, right;

	public MyBinaryNode(Key key) {
		this.key = key;
		left = right = null;
	}

	public void insert(Key key) {
		if (key.compareTo(this.key) < 0) {
			if (left != null) {
				left.insert(key);
			} else {
				left = new MyBinaryNode<Key>(key);
			}
		} else if (key.compareTo(this.key) > 0) {
			if (right != null) {
				right.insert(key);
			} else {
				right = new MyBinaryNode<Key>(key);
			}
		}
	}

	public static void main(String[] args) {
		MyBinaryNode<Integer> root = new MyBinaryNode<Integer>(56);
		root.insert(30);
		root.insert(70);
	}
}
