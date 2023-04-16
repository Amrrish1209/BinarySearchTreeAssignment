package com.bridgelabz.binarysearchtrees;

public class MyBinaryNode<K extends Comparable<K>> {

	K key;
	MyBinaryNode<K> left, right;

	public MyBinaryNode(K key) {
		this.key = key;
		left = right = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public MyBinaryNode<K> getLeft() {
		return left;
	}

	public void setLeft(MyBinaryNode<K> left) {
		this.left = left;
	}

	public MyBinaryNode<K> getRight() {
		return right;
	}

	public void setRight(MyBinaryNode<K> right) {
		this.right = right;
	}
}
